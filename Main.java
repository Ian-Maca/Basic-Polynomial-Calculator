import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  //scanner to take user input

        System.out.println("Welcome to Ian's Polynomial Calculator");   //shows parabola form
        System.out.println("ax^2 + bx + c");

        System.out.println("a :");              //gets a value as user input (double)
        double a = keyboard.nextDouble();

        System.out.println("b :");              //gets b value as user input (double)
        double b = keyboard.nextDouble();

        System.out.println("c :");              //gets c value as user input (double)
        double c = keyboard.nextDouble();

        if(a == 0 && b == 0){                   //if a and b are 0 parabola will be straight line
            System.out.println("error: a and b val = 0");
        }
        else {
        
        Polynomial poly = new Polynomial(a, b, c);  //creates instance of "Polynomial.java" using user input values

        System.out.println(poly.toString());        // prints the created polynomial
        System.out.println(poly.getVertex());       // prints the vertex of the polynomial
        }


    }
}
