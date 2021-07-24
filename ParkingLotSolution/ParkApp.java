package ParkingLotSolution;
import java.util.ArrayList;
import java.util.List;


class ParkApp
{
  private String inputpath;
  private boolean create_lot;
  public ParkApp(String inp)
  {
    inputpath=inp;
    create_lot=false;
  }

  public void run()
  {
    List<String> inputs = Reader.readFile(inputpath);

    List<Slot> slots=new ArrayList<>();
    
    for (String input : inputs) {
            String[] currentInput = input.split(" ");
            if (currentInput.length == 0) {
                System.err.println("Empty Input Provided");
                continue;
            }
           
            workList(currentInput,slots);
        }
    

  }

  public void workList(String[] input,List<Slot>slots){
    
   
    if(input[0].toLowerCase().trim().equals("create_parking_lot")){
        if(create_lot==false){
          if(Validation.isNum(input[1])){
          Work.createSlot(slots,Integer.parseInt(input[1]));
          create_lot=true;
          }
          else
            System.err.println("Not a valid number");
        }
        else{
          System.err.println("parking already created");
        }
    }
    else if(create_lot==false){
      System.out.println("parking is not created");
    }
    else if(input[0].toLowerCase().trim().equals("leave")){
      if(create_lot==true && Validation.isNum(input[1])){
        Work.leaveVehicle(slots,Integer.parseInt(input[1]));
      }
    }
    else if(input[0].toLowerCase().trim().equals("park")){
      if(create_lot==true && Validation.isNum(input[3]))
        Work.parkVehicle(slots,input[1],Integer.parseInt(input[3]));
      
    }
    else if(input[0].toLowerCase().trim().equals("slot_number_for_car_with_number")){
      if(create_lot==true)
        Work.getSlotNumberVehicleQuery(slots,input[1]);
      

    }
    else if(input[0].toLowerCase().trim().equals("slot_numbers_for_driver_of_age")){
      if(create_lot==true && Validation.isNum(input[1]))
        Work.getAgeQuery(slots,Integer.parseInt(input[1]));
    }
    else if(input[0].toLowerCase().trim().equals("vehicle_registration_number_for_driver_of_age"))
    {
      if(create_lot==true && input.length==2 && !input[1].isBlank() && Validation.isNum(input[1]))
        Work.getVehicleAgeNumber(slots,Integer.parseInt(input[1]));
    }
    else
      System.out.println("Not a correct input");
  }
}