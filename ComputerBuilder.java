import java.util.Scanner;


public class ComputerBuilder {
    // o shit here we go again meme

    private static Scanner userInput = new Scanner(System.in);
    private static int laptopOrDesktop;
    private static boolean whileTrue = false;
    private static String nameOfBuild;
    private static String nameOfBrand;
    static String sizeOfCase;
    static String cpuBrand;
    static int cpuSpeed;
    static int hardDriveCapacity;
    static String monitorBrand;
    static int monitorSize;


    static int getLaptopOrDesktop(){
        
        int D = 1; int L = 2;
        while(!whileTrue){
            
            System.out.println("Welcome to Cove's THE SPANISH INQUISITION project that he's also\n" + 
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
        return laptopOrDesktop;
        
    }

    static String setNameOfBuild(){
        System.out.println("What would you like to name this project/build?");
        nameOfBuild = userInput.nextLine();
        return nameOfBuild;
    }

    static String setComputerBrand(){
        System.out.println("What brand of computer woudl you like?");
        String nameOfBrand = userInput.nextLine();
        return nameOfBrand;
    }
    static String setSizeOfCase(){
        System.out.println("What size of Case do you want?");
        String size = userInput.nextLine();
        return size;
    }

    static String setCPUBrand(){
        System.out.println("What brand of CPU do you want?");
        String brand = userInput.nextLine();
        return brand;
    }
    static int setCPUSpeed(){
        System.out.println("speed cost money, how fast do you wanna go?");
        int speed = userInput.nextInt();
        return speed;
    }
    static int setHardDriveCapacity(){
        System.out.println("How much space do you think you'll need?");
        int size = userInput.nextInt();
        return size;
    }
    static String setMonitorBrand(){
        System.out.println("what brand of monitor do you want?");
        String brand = userInput.nextLine();
        return brand;
    }

    static int setMonitorSize(){
        System.out.println("What size Monitor do you want? Bigger is better.");
        int size = userInput.nextInt();
        return size;
    }

    ComputerBuilder(String nameOfBuild, String nameOfBrand, int cpuBrand, int cpuSpeed, 
    int hardDriveCapacity, int monitorSize) {
        this.nameOfBrand = nameOfBrand;
        this.nameOfBuild = nameOfBuild;
        this.cpuBrand = cpuBrand;
        this.cpuSpeed = cpuSpeed;
        this.hardDriveCapacity = hardDriveCapacity;
        this.monitorSize = monitorSize;
    }
    ComputerBuilder(String sizeOfCase, String monitorBrand){ 
        this(nameOfBuild, nameOfBrand, cpuBrand, cpuSpeed, hardDriveCapacity, monitorSize);
        this.sizeOfCase = sizeOfCase;
        this.monitorBrand = monitorBrand;
    }
}