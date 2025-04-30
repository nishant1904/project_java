import java.util.Scanner;
public class project_calculater {
    public static void main(String[] args) {

        // this the simple calculator
        Scanner a = new Scanner(System.in);

        System.out.println("enter the first number");
        double b = a.nextDouble();

        System.out.println("enter your operator (+ , - , *, /) :");
        char c = a.next().charAt(0);

        System.out.println("enter number two ");
        double d = a.nextDouble();
        double result;

        if(c == '+'){
            result = b + d;
        }


        else if(c=='-'){
            result = b - d;

        }

        else if(c == '/'){

            result = b/d;

        }

        else if(c== '*'){

            result = b * d;
        }

        else{

            System.out.println("invalid operator");
            a.close();
            return;
        }

        System.out.println("results :" + result);
        a.close();








    }
}

