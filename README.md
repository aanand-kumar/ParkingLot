# ParkingLot

Installation guide

First we have to install java in our OS For Windows https://java.com/en/download/help/windows_manual_download.html For Linux https://java.com/en/download/help/linux_install.html For Mac https://java.com/en/download/help/mac_install.html

After Installing Java Install git or Download this repo as Zip file and use any zip Extractor such as WinRar,7zip to Extract files

git install link -: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

git commands to pull the files

git clone https://github.com/aanand-kumar/ParkingLot.git

after the above process

open the terminal/Cmd, then by using CD command go to the Parkinglot directory

cd ParkingLot

Same goes with repl.it(Run Button will also work but by default will take input.txt as filepath) Run the below commands in their console

Now run the following commands to run the program

1.javac ParkingLotSolution/*.java

2.java ParkingLotSolution/Main.java ParkingLotSolution/input.txt

For Windows

1.javac ParkingLotSolution\*.java

2.java ParkingLotSolution\Main.java ParkingLotSolution\input.txt

First command will compile java files and create classes

Second will run the Main class with the path to the test file

Check your terminal screen for the output

Assumptions-:

1.Assumed vehcile number must be in proper format and unique i.e. No duplicates will be provided

2.all commands,vehicle numbers are case insensitive i.e. Leave or leave or leAVe are same KA-01-AB-1234 or ka-01-ab-1234 are same

3.No format check has been done for the vehicle number

3.For Any Invalid command System will output "Not a correct input"

4.age,and slot to leave must be an Integer else the system will give warning "Invalid command name please provide correct input"

5.Assumed filepath must be provided and file must exist else the system will give warning as well as throw error and halt the execution of the program.

6.Since no output provided in case no vehicle present the system will output balnck.

7.Assumed all the commands specified must be in proper format else system will give warning

8.System will give warning in case of Inavlid slot number,Slot full, already vacant slot,reinitialisation of parking slot
