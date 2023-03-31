import java.util.*;


public class ComputerBuilder {
    // o shit here we go again meme

    private static Scanner userInput = new Scanner(System.in);
    private static int laptopOrDesktop;
    private static String buildType;
    private static boolean whileTrue = false;
    private static String nameOfBuild;
    private static int nameOfBrand;
    static String sizeOfCase;
    static String cpuBrand;
    static int cpuPrice;
    static int cpuSpeed;
    static int hardDriveCapacity;
    static int monitorBrand;
    static String monitorBrandString;
    static int monitorPrice;
    static int monitorSize;
    //static String userName = "%-40s\n"
    static String TYPE_FORMAT = "%-5s%-20s\n";
    static String dashes = "     ----------------------------------------------------";
    static String itemAndAnswer = "%5s%-35s%-15s\n";
    static String priceAndAnswer = "%10s%-35s%-15s\n";
    static double brandPriceMultiplyer;
    static String sizeString;
    static int sizePrice;
    static int hardDriveSize;

    static void getLaptopOrDesktop(){
        
        int D = 1; int L = 2;
        while(!whileTrue){
            
            System.out.println("Welcome to Cove's project that he's also\n" + 
            "gonna use to teach a class with. Would you Like to build\n" + 
            " a Laptop or a Desktop?\n for Desktop enter 1\n for Laptop enter 2");

            laptopOrDesktop = userInput.nextInt();
            //getLaptopOrDesktop = Character.toUpperCase(getLaptopOrDesktop); going a diffrent route

            if(laptopOrDesktop == D || laptopOrDesktop == L){
                whileTrue = true;
            }
            else{
                whileTrue = false;
                System.out.println("Please enter 1 or 2");
            }
        }
        
        
    }

    static void type(int laptopOrDesktop){
        if (laptopOrDesktop == 1){
            buildType = "Desktop";
        }
        else{
            buildType = "Laptop";
            
        }
        
    }
/* 
    static String setNameOfBuild(){
        System.out.println("What would you like to name this project/build?");
        nameOfBuild = userInput.nextLine();
        return nameOfBuild;
    }

    static String setComputerBrand(){
        System.out.println("What brand of computer woudl you like?");
        System.out.println("")
        nameOfBrand = userInput.nextInt();
        return nameOfBrand;
    }
    */
    static void setSizeOfCase(){
        System.out.println("What size of Case do you want?\n"+
        " 1 for mini\n 2 for full");

        int size = userInput.nextInt();

        switch(size){
            case 1:
                sizeString = "mini";
                sizePrice = 80;

            case 2:
                sizeString = "Full";
                sizePrice = 120;
        }
    }

    static String setCPUBrand(){
        System.out.println("What brand of CPU do you want?");
        System.out.println("Enter 1 for AMD or 2 for Intel");
        String brand = userInput.nextInt();

        switch(brand){
            case 1:
                cpuBrand = "AMD";
                cpuPrice = 120;
                break;
            case 2:
                cpuBrand = "Intel";
                cpuPrice = 150;
                break;
        }
        return brand;
    }
    static int setCPUSpeed(){
        System.out.println("speed cost money, how fast do you wanna go?");
        System.out.println("Enter 1 for 3Ghz or 2 for 4 Ghz");
        int speed = userInput.nextInt();

        switch(speed){
            case 1:
                cpuSpeed = 3;
                cpuPrice = cpuPrice + 80;
                break;
            case 2:
                cpuSpeed = 4;
                cpuPrice = cpuPrice + 120;
                break;
        }
        return speed;
    }
    static int setHardDriveCapacity(){
        System.out.println("How much space do you think you'll need?");
        System.out.println("Enter a whole number for how many Terrbytes you want from 1 to 5");
        hardDriveSize = userInput.nextInt();
        return hardDriveSize;
    }
    static String setMonitorBrand(){
        System.out.println("what brand of monitor do you want?");
        System.out.println("Enter 1 for Dell 2 for AlienWare");
        monitorBrand = userInput.nextInt();

        switch(monitorBrand){
            case 1:
                monitorBrandString = "Dell";
                monitorPrice = 0;
                break;
            case 2:
                monitorBrandString = "AlienWare"
                monitorPrice = 200;
                break;
        }

        return monitorbrand;
    }

    static int setMonitorSize(){
        System.out.println("What size Monitor do you want? Bigger is better.");
        System.out.println("Enter 1 for 18 inch\n2 for 22 inch\n3 for 26 inch");
        monitorSize = userInput.nextInt();

        switch(monitorSize){
            case 1:
                monitorSizeString = "18";
                monitorPrice += 100;
                break;
        }
        return size;
    }

    ComputerBuilder(String nameOfBuild, String nameOfBrand, String cpuBrand, 
    int cpuSpeed, int hardDriveCapacity, int monitorSize) {
        ComputerBuilder.nameOfBrand = nameOfBrand;
        ComputerBuilder.nameOfBuild = nameOfBuild;
        ComputerBuilder.cpuBrand = cpuBrand;
        ComputerBuilder.cpuSpeed = cpuSpeed;
        ComputerBuilder.hardDriveCapacity = hardDriveCapacity;
        ComputerBuilder.monitorSize = monitorSize;
    }
    ComputerBuilder(String sizeOfCase, String monitorBrand){ 
        this(nameOfBuild, nameOfBrand, cpuBrand, cpuSpeed, hardDriveCapacity, monitorSize);
        ComputerBuilder.sizeOfCase = sizeOfCase;
        ComputerBuilder.monitorBrand = monitorBrand;
    }
    static void print(){//(String nameOfBuild, String nameOfBrand, String priceAndAnswer,
    //double brandPriceMultiplyer){
        System.out.print("Congradulations on the new computer \n Recipt for " + nameOfBuild +
        " " + buildType + "\n");
        System.out.printf(TYPE_FORMAT, "     ", nameOfBrand + " " + buildType);
        System.out.println(dashes);
        //System.out.printf(itemAndAnswer, " ", "Brand:", nameOfBrand);

        System.out.printf(priceAndAnswer, "", "Price:","$" + sizePrice );

    }

    static void print(){
        this();
        System.out.println("sizeOfCase");
    }
}