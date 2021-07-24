package ParkingLotSolution;
public class Validation
{

  public static boolean isNum(String num)
  {
    if (num == null) {
            return false;
    }
    try {
        Integer d = Integer.parseInt(num);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
  }
}