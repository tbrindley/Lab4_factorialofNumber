import java.util.Scanner;

/**
 * Created by Travis Brindley on 6/27/2017.
 * Assignment:  Calculates the factorial of a number
 */
public class Main {

    public static int validate(Scanner scnr,int num){
       while(num <=0 || num >= 10){
           System.out.print("I'm sorry, that isn't a valid integer. Please enter an integer greater than 0 but less than 10: ");
           num = scnr.nextInt();
       }
       return num;
    }
    public static int getFactorial(int num){
        int x = 1;
        int y = 1;
        while(x <= num){
            y = y * x;
            x += 1;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Calculator!");
        Scanner scnr = new Scanner(System.in);

        char cont;
        do{
            System.out.print("Enter an integer that's greater than 0 but less than 10:  \n");

            //validates that the number entered is an integer
            while (!scnr.hasNextInt()) {
                System.out.print("I'm sorry, that isn't a valid integer. Please enter an integer greater than 0 but less than 10: ");
                scnr.next();
            }
            int num = scnr.nextInt();

            if(num <= 0 || num >= 10) {
                num = validate(scnr, num);
            }

            int factorial = getFactorial(num);

            System.out.printf("The factorial of %d is %d \n",num,factorial);

            System.out.print("Do you wish to continue? ");
            cont = scnr.next().charAt(0);
        }while(cont == 'y' || cont == 'Y');
    }
}
