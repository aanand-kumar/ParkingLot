package ParkingLotSolution;
import java.util.ArrayList;
import java.util.List;
public class Work
{

  public static void createSlot(List<Slot> slots,int n){

    for(int i=0;i<n;i++){
      Slot obj=new Slot(i+1);
      slots.add(obj);
    }
    System.out.println("Created parking of "+ n + " slots");
  }

  public static void parkVehicle(List<Slot> slots,String vehicleNumber,int age)
  {
      Vehicle vehicle=new Vehicle(vehicleNumber,age);
      
      for(Slot slot:slots){
        if(!slot.getStatus()){
          slot.parkVehicle(vehicle);
          System.out.println("Car with vehicle registration number " + slot.getVehicle().getVehicleNubmer() + " has been parked at slot number " 
        + (slot.getSlotNumber()));
          return;
        }
      }
  }
  public static void leaveVehicle(List<Slot>slots,int slotNumber)
  {
    for(Slot slot:slots){
        if(slot.getStatus() && slot.getSlotNumber()==slotNumber){
          
          System.out.println("Slot number "+ slotNumber+" vacated, the car with vehicle registration number "+slot.getVehicle().getVehicleNubmer()+ " left the space, the driver of the car was of age "+slot.getVehicle().getAge());
          slot.removeVehicle();
          return;
        }
      }
    System.out.println("Slot is empty");
  }

  public static void getAgeQuery(List<Slot>slots,int age)
  { boolean flag=true;
  
    for(Slot slot:slots)
    {
      if(slot.getStatus()==true && slot.getVehicle().getAge()==age){
        if(flag){
          System.out.print(slot.getSlotNumber());
          flag=false;
        }
        else
          System.out.print(","+slot.getSlotNumber()); 
      }
    }

    System.out.print("\n");
    
  }

  public static void getSlotNumberVehicleQuery(List<Slot> slots, String number)
  {
    for(Slot slot:slots)
    {
      if(slot.getStatus()==true && slot.getVehicle().getVehicleNubmer().trim().equals(number)){
        System.out.println(slot.getSlotNumber());
        return;
      } 
        
    }
    System.out.println("No vehicle exists for this Number");

  }

  public static void getVehicleAgeNumber(List<Slot> slots, int age)
  { boolean flag=true;
    for(Slot slot:slots)
    { 
      if(slot.getStatus()==true && slot.getVehicle().getAge()==age)
      { 
          
          if(flag)
          {
            System.out.print(slot.getVehicle().getVehicleNubmer());
            flag=false; 
          }
          else
          {
          System.out.print(","+slot.getVehicle().getVehicleNubmer()); 
          }
      }
      
    }
    System.out.print("\n");
  }
}