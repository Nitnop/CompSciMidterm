import java.util.Scanner;

public class OverSimplifiedDriver {

        public static void main(String[] args) {

            try (Scanner userInput = new Scanner(System.in)) {
                System.out.println("Enter 1 for Laptop 2 for Desktop");
                int userchoice = userInput.nextInt();

                switch(userchoice){
                case 1:
                    Laptop.myLaptop();
                    break;
                case 2:
                    Desktop.myDesktop();
                    break;
                }
            }
        }
}

        
