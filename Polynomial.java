import java.lang.Math;

/*initializing variables for constructor*/
public class Polynomial{
    public double aVal;
    public double bVal;
    public double cVal;

    /* Polynomial constructor, assigns variables */
    public Polynomial(double a, double b, double c){
        aVal = a;
        bVal = b;
        cVal = c;
    }

    /* uses -b/2a formula to find x value of vertex and plugs it into the original function */
    public String getVertex(){
         double xVal = -bVal / (2 * aVal);
         double yVal = (   (aVal * Math.pow(xVal, 2)) + (bVal * xVal) + cVal);
         return "(" + xVal + ", " + yVal + ")";
    }
    /*toString prints out ax^2 + bx + c with a , b , c values plugged in */
    public String toString(){
        return aVal + "x^2" + " + " + bVal + "x" + " + " + cVal;
    }
}