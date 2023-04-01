import java.util.Scanner;

public class OverSimplifiedDriver {

        public static void main(String[] args) {

            try (Scanner userInput = new Scanner(System.in)) {
                System.out.println("Enter 1 for Laptop 2 for Desktop");
                int userchoice = userInput.nextInt();

                switch(userchoice){
                case 1:
                    Laptop2 userLaptop = new Laptop2();
                    System.out.println("speed cost money, how fast do you wanna go?");
                    System.out.println("Enter 1 for 3Ghz or 2 for 4 Ghz");
                    System.out.println("Enter int CPU speed in ghz");
                    //int speed = userInput.nextInt();
                    userLaptop.cpuSpeed = userInput.nextInt();
                    System.out.println("enter string for brand");
                    String brand = userInput.next();
                    userLaptop.setCpu(brand);

                    System.out.println("\n \n output \n " + userLaptop.getCpuSpeed() + " \n" + userLaptop.getCpuBrand());
                    break;
                case 2:
                    Desktop.myDesktop();
                    break;
                }
            }

        }
}

        
