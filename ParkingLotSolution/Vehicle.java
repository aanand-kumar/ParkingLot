package ParkingLotSolution;
class Vehicle
{
  private String vehicleNubmer;
  private int age;
  Vehicle(String vehicleNo,int age)
  {
    this.vehicleNubmer=vehicleNo;
    this.age=age;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getVehicleNubmer() {
    return vehicleNubmer;
  }
  public void setVehicleNubmer(String vehicleNo) {
    this.vehicleNubmer = vehicleNo;
  }
}