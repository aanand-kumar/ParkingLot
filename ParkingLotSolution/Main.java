package ParkingLotSolution;
class Main {
  public static void main(String[] args) {
    if(args.length  == 0 || args[0].isEmpty()) {
            System.out.println("File Input is Manadatory");
            throw new NullPointerException("No file Path Provided As Argument");
        }
    String pathfile = args[0];   
    ParkApp app=new ParkApp(pathfile);
    app.run();
  }
}