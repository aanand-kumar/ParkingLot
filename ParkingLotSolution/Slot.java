

class Slot
{
  private int slotNumber;
  private boolean status;
  private Vehicle vehicle;

  Slot(int slotNumber)
  {
    this.slotNumber=slotNumber;
    status=false;
  }

  public int getSlotNumber() {
    return slotNumber;
  }
  public boolean getStatus() {
    return status;
  }
  public void parkVehicle(Vehicle vehicle){
    this.vehicle=vehicle;
    status=true;
  }
  public void removeVehicle(){
    status=false;
    vehicle=null;
  }
  public Vehicle getVehicle() {
    return vehicle;
  }
}