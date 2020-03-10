public class MathRecursion {
public static int addSquares (int n)
   {
       if (n == 0)      // if n is equal to 0
           return 0;
       else
           return addSquares (n - 1) +  n * n;
   }
   
 public static int factorial (int n) {
   if (n <= 0) throw new IllegalArgumentException("Factorial of a number less than or equal to zero");
   if (n == 1) return 1;
   return n * factorial(n-1);
}
}