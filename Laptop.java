import java.util.Scanner;


public class Laptop {

    
    public Laptop(){

        //Laptop myLaptop =new Laptop();

        String UserName;
        String ComputerBrand;
        String CpuBrand;
        double CPUSpeed;
        double HardDriveCapacity;
        double MonitorSize;
        String userName;
        String computerBrandString;
       // double computerBrandMultiplyer;
    }
    
    public Laptop(String userNameIn, String computerBrandStringIn,String cpuBrandString, double cpuSpeed, double hardDriveCapacity, double monitorSize){

        //Laptop myLaptop =new Laptop();

        userName = userNameIn;
        computerBrandString = computerBrandStringIn;
        this.cpuBrandString = cpuBrandString;
        this.cpuSpeed = cpuSpeed;
        this.hardDriveCapacity = hardDriveCapacity;
        this.monitorSize = monitorSize;
       // double computerBrandMultiplyer;

    }

    private static Scanner userInput = new Scanner(System.in);
    protected String cpuBrandString;
    protected double cpuPrice;
    protected double cpuSpeed;
    protected double monitorSize;
    protected double monitorPrice;
    protected String computerBrandString;
    protected double computerBrandMultiplyer;
    //private String TYPE_FORMAT = "%-5s%-20s\n"; i'm a moron
    private static String dashes = "     ----------------------------------------------------"; // much better than formatting
    private static String itemAndAnswer = "%5s%-35s%-15s\n"; // 
    private static String priceAndAnswer = "%10s%-35s%-15s\n";
    protected String userName;
    protected double hardDriveCapacity;
    protected double hardDrivePrice;

    public void setUserName(){  // fuck me this took days to get the syntax right, ok, now I just have to copy it everywhere
        System.out.println("Please enter your name");
        this.userName = userInput.nextLine();
        //return this.userName; and as an added bonous it works without return, this will make everything so much easyer
    }

    public void setComputerBrand(){ // not having to return values is nice, makes this much easier
        System.out.println("What brand of computer would you like?");
        System.out.println("Enter 1 for Lenovo\n2 for Dell\n3 for AlienWare");
        int computerBrandChoice = userInput.nextInt();
        switch(computerBrandChoice){
            case 1:
                this.computerBrandString = "Lenovo";
                this.computerBrandMultiplyer = 1;
                break;
            case 2:
                this.computerBrandString = "Dell";
                this.computerBrandMultiplyer = 1.3;
                break;
            case 3:
                this.computerBrandString = "AlienWare";
                this.computerBrandMultiplyer = 2;
                break;
        }
    }

    public void setCpuBrand(){ //quick call and set
        System.out.println("What brand of CPU do you want?");
        System.out.println("Enter \n1 for AMD \n2 for Intel");
        int cpuBrandChoice = userInput.nextInt();

        switch(cpuBrandChoice){
            case 1:
                this.cpuBrandString = "AMD";
                this.cpuPrice = 120;
                break;
            case 2:
                this.cpuBrandString = "Intel";
                this.cpuPrice = 150;
                break;
        }
    }
    
    public void setCPUSpeed(){ //quick call and set
        System.out.println("speed cost money, how fast do you wanna go?");
        System.out.println("Enter \n1 for 3Ghz \n2 for 4 Ghz");
        int speed = userInput.nextInt();

        switch(speed){
            case 1:
                this.cpuSpeed = 3;
                this.cpuPrice += 80.0;
                break;
            case 2:
                this.cpuSpeed = 4;
                this.cpuPrice += 120.0;
                break;
        }
    }

    public void setHardDriveCapacity(){
        System.out.println("How much space do you think you'll need?");
        System.out.println("Enter a whole number for how many Terrbytes you want from 1 to 5");
        int usersize = userInput.nextInt();
        switch(usersize){
            case 1,2,3,4,5:
                this.hardDriveCapacity = usersize;
                this.hardDrivePrice = usersize * 15.0;
                break;
            
            }
        }

        public void setMonitorSize(){
            System.out.println("What size Monitor do you want? Bigger is better.");
            System.out.println("Enter 1 for 18 inch\n2 for 20 inch\n3 for 22 inch");
            int monitorSize = userInput.nextInt();
    
            switch(monitorSize){
                case 1:
                    this.monitorSize = 18;
                    this.monitorPrice = 100.0;
                    break;
                case 2:
                    this.monitorSize = 20;
                    this.monitorPrice = 150.0;
                    break;
                case 3:
                    this.monitorSize = 22;
                    this.monitorPrice = 200.0;
                    break;
            }
        }
            
        public void printRecipt(){
            System.out.println("Congradulations on the new computer " + this.userName + "\nRecipt for your " + this.computerBrandString +" Laptop");

            System.out.println(dashes);

            this.cpuPrice = this.cpuPrice * this.computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "CPU Brand:", this.cpuBrandString);
            System.out.printf(itemAndAnswer, " ", "CPU Speed:", this.cpuSpeed + "Ghz");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + this.cpuPrice + " \n");
            // debug System.out.println(cpuPrice);

            this.hardDrivePrice = this.hardDrivePrice * this.computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "Hard Dive Capacity:", this.hardDriveCapacity + "TB");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + this.hardDrivePrice + " \n");

            this.monitorPrice = this.monitorPrice * this.computerBrandMultiplyer;
            System.out.printf(itemAndAnswer, " ", "Monitor size:", this.monitorSize + " Inch");
            System.out.printf(priceAndAnswer, " ", "Price:", "$" + this.monitorPrice);

            System.out.println(dashes);

            System.out.printf(priceAndAnswer, " ", "Total:", this.cpuPrice + this.hardDrivePrice + this.monitorPrice);
        }
}
