/**
 * Tyler Schumacher
 */
import java.util.*;
public class BisectionMethod
{
    public static void main(String[] args)
    {
        System.out.println("The unique root to sin(x) = 0, 2 <= x <= 4, to within 7 decimal places,");
        System.out.println("using the Bisection Method.");
        System.out.println("Runtime: " + bisection(2,4,.0000001));
    }
    public static int bisection(double a,double b,double tol)
    {
        boolean found = false;
        double m =(a+b)/2.0;
        int count = 0;
        while((b-a >= tol) && (found == false))
        {
            m = (a+b)/2.0;
            if(Math.sin(m) == 0)
            {
                found = true;
            }
            else
            {
                if((Math.sin(m)*Math.sin(a)) > 0)
                {
                    a = m;
                }
                else
                {
                    b = m;
                }
                count++;
            }
            System.out.println("Iteration #" + count+ ": " + round(m,7));
        }
        return count;
    }
    public static double round(double value, int dPlaces)
    {
        double x = Math.pow(10, dPlaces);
        double y = value * x;
        return Math.round(y)/x;
    }
}