import java.util.Scanner;


public class Laptop {

    
    static void myLaptop(){

        //Laptop myLaptop =new Laptop();

        setUserName();
        setComputerBrand();
        setCpuBrand();
        setCPUSpeed();
        setHardDriveCapacity();
        setMonitorSize();
        printRecipt();
        //String userName;
        //String computerBrandString;
       // double computerBrandMultiplyer;

    }
    
    private static Scanner userInput = new Scanner(System.in);
    private static String cpuBrandString;
    private static double cpuPrice;
    private static int cpuSpeed;
    private static int monitorSizeInt;
    private static double monitorPrice;
    private static String computerBrandString;
    private static double computerBrandMultiplyer;
    //private String TYPE_FORMAT = "%-5s%-20s\n";
    private static String dashes = "     ----------------------------------------------------";
    private static String itemAndAnswer = "%5s%-35s%-15s\n";
    private static String priceAndAnswer = "%10s%-35s%-15s\n";
    private static String userName;
    private static int hardDriveCapacity;
    private static double hardDrivePrice;

    static void setUserName(){
        System.out.println("Please enter your name");
        userName = userInput.next();
    }

    static void setComputerBrand(){
        System.out.println("What brand of computer would you like?");
        System.out.println("Enter 1 for Lenovo\n2 for Dell\n3 for AlienWare");
        int computerBrand = userInput.nextInt();
        switch(computerBrand){
            case 1:
                computerBrandString = "Lenovo";
                computerBrandMultiplyer = 1;
                break;
            case 2:
                computerBrandString = "Dell";
                computerBrandMultiplyer = 1.3;
                break;
            case 3:
                computerBrandString = "AlienWare";
                computerBrandMultiplyer = 2;
                break;
        }
    }

    static void setCpuBrand(){
        System.out.println("What brand of CPU do you want?");
        System.out.println("Enter 1 for AMD or 2 for Intel");
        int cpuBrand = userInput.nextInt();

        switch(cpuBrand){
            case 1:
                cpuBrandString = "AMD";
                //cpuPrice = 120;
                break;
            case 2:
                cpuBrandString = "Intel";
                //cpuPrice = 150;
                break;
        }
    }
    
    static int setCPUSpeed(int speed){
        return speed;
    }


    static void setHardDriveCapacity(){
        System.out.println("How much space do you think you'll need?");
        System.out.println("Enter a whole number for how many Terrbytes you want from 1 to 5");
        int usersize = userInput.nextInt();
        switch(usersize){
            case 1,2,3,4,5:
                hardDriveCapacity = usersize;
                hardDrivePrice = usersize * 30.0;
                break;
            
            }
        }

        static void setMonitorSize(){
            System.out.println("What size Monitor do you want? Bigger is better.");
            System.out.println("Enter 1 for 18 inch\n2 for 20 inch\n3 for 22 inch");
            int monitorSize = userInput.nextInt();
    
            switch(monitorSize){
                case 1:
                    monitorSizeInt = 18;
                    monitorPrice = 100.0;
                    break;
                case 2:
                    monitorSizeInt = 20;
                    monitorPrice = 150.0;
                    break;
                case 3:
                    monitorSizeInt = 22;
                    monitorPrice = 200.0;
                    break;
            }
        }
            
        static void printRecipt(){
            System.out.println("Congradulations on the new computer " + userName + "\nRecipt for your " + computerBrandString +" Laptop");

            System.out.println(dashes);

            cpuPrice = cpuPrice * computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "CPU Brand:", cpuBrandString);
            System.out.printf(itemAndAnswer, " ", "CPU Speed:", cpuSpeed + "Ghz");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + cpuPrice + " \n");
            // debug System.out.println(cpuPrice);

            hardDrivePrice = hardDrivePrice * computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "Hard Dive Capacity:", hardDriveCapacity + "TB");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + hardDrivePrice + " \n");

            monitorPrice = monitorPrice * computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "Monitor size:", monitorSizeInt + " Inch");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + monitorPrice);

            System.out.println(dashes);

            System.out.printf(priceAndAnswer, " ", "Total:", cpuPrice + hardDrivePrice + monitorPrice);
        } 
}
