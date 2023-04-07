
import java.util.Scanner;
public class Laptop2 {
    
    //Laptop2(){
    String cpuBrandString;
    double cpuPrice;
    int cpuSpeed;
    int monitorSizeInt;
    double monitorPrice;
    String computerBrandString;
    double computerBrandMultiplyer;
    String userName;
    int hardDriveCapacity;
    double hardDrivePrice;
    //}

    Scanner userInput = new Scanner(System.in);
    

    void setCpu(int speed){
        
        this.cpuSpeed = speed;
    }

    void setCpu(String brand){
        this.cpuBrandString = brand;
    }

    int getCpuSpeed(){
        return this.cpuSpeed;
    }
    String getCpuBrand(){
        return this.cpuBrandString;
    }
}
