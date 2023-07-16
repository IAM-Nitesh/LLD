package Day13_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        }

        catch ( NullPointerException ex){
            System.out.println("Null");
        }
        catch ( ArithmeticException ex){
            System.out.println("Division by zero");
        }
        catch (InputMismatchException ex){
            System.out.println("invalid input");
        }

        catch (Exception ex){
            System.out.println("in exception");
        }

        finally{
            System.out.println("I will always execute");
        }
    }
}
