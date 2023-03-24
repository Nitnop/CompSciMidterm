/*
 * this is the java version of a call center
 */



public class ComputerBuilderDriver{

    static int laptopOrDesktop;
    static String nameOfBuild;
    static String nameOfBrand;
    static String sizeOfCase;
    static String cpuBrand;
    static int cpuSpeed;
    static int hardDriveCapacity;
    static String monitorBrand;
    static int monitorSize;

    public static void main(String[] args) {     
    // to do: prompt the user weather they want to bulid a PC or a Laptop
        laptopOrDesktop = ComputerBuilder.getLaptopOrDesktop();
    // to do: prompt the user for a name for this build
        nameOfBuild = ComputerBuilder.setNameOfBuild();
    // to do: prompt the user for brand
        nameOfBrand = ComputerBuilder.setComputerBrand();
    // to do: prompt the user for case type
        sizeOfCase = ComputerBuilder.setSizeOfCase();
    // to do: prompt the user for CPU brand
        cpuBrand = ComputerBuilder.setCPUBrand();
    // to do: prompt the user for CPU speed
        cpuSpeed = ComputerBuilder.setCPUSpeed();
    // to do: prompt the user for Hard Drive capacity
        hardDriveCapacity = ComputerBuilder.setHardDriveCapacity();
    // to do: prompt user for monitor brand
        monitorBrand = ComputerBuilder.setMonitorBrand();
    // to do: prompt user for monitor size
        monitorSize = ComputerBuilder.setMonitorSize();
    // to do: make a new object to store all this info in, call it name.object or something
    ComputerBuilder.Build myBuild = new Build()
    // to do: make up a bunch of prices and options for all the above
    // probably go to newegg.com and just use what I find there
    
    // to do: call a printf that outputs everthing they want and the prices
    // and do it in a not ugly way
    // and have a total at the bottom
    }

    

}
