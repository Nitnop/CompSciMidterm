import java.util.Scanner;

public class OverSimplifiedDriver {

        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            //try ()) {
                System.out.println("Enter 1 for Laptop 2 for Desktop");
                int userchoice = userInput.nextInt();

                switch(userchoice){
                case 1:
                    Laptop userLaptop = new Laptop();
                    //userLaptop.userName = userLaptop.setUserName(); i hate java
                    userLaptop.setUserName();
                    //System.out.println(userLaptop.userName); holy shit i'm smart, it works!
                    userLaptop.setComputerBrand();
                    userLaptop.setCpuBrand();
                    userLaptop.setCPUSpeed();
                    userLaptop.setHardDriveCapacity();
                    userLaptop.setMonitorSize();
                    userLaptop.printRecipt();
                    break;
                case 2:
                    Desktop.myDesktop();
                    break;
                }
            }
        }

		

        


        
