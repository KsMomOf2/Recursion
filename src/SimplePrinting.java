public class SimplePrinting {

  public static void printBefore(String s) {
  
    // Base Case
    if (s.length() == 0) return;
    
    System.out.print(s.substring(0,1));
    printBefore(s.substring(1));
  }
  
  
  public static void printAfter(String s) {
  
    // Base Case
    if (s.length() == 0) return;

    printAfter(s.substring(1));    
    System.out.print(s.substring(0,1));
  }


  public static void printMiddle(String s) {
  
    if (s.length() == 0) return;
    if (s.length() == 1) {
      System.out.print(s);
      return;
      }
    if (s.length() == 2) {
      System.out.print(s);
      return;
    }
    
    int mid = s.length()/2;
    printMiddle(s.substring(mid+1)); // prints the second half of the string
    System.out.print(s.substring(mid,mid+1));
    printMiddle(s.substring(0,mid)); // prints the first half of the string
  }
  
  public static String someFun (String s)
  {
     if (s.length( ) >= 2)
        s = someFun(s.substring(1)) + s.charAt(0);
     return s;
  }

  
  public static void main (String[] args) {
/*
    printBefore("Hello");
    System.out.println();
*/
    printAfter("Hello");
    System.out.println();
/*
    printMiddle("What is the name of the game?");
    System.out.println();
*/
    printMiddle("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    System.out.println();
/*
    printMiddle("ABCDEFGHIJKLMNOPQRSTUVWXY");
    System.out.println();

    System.out.println(someFun("BCDEFGHIJKLMNOPQRSTUVWXYZ"));
    System.out.println();
    
    System.out.println("addSquares(5): " + MathRecursion.addSquares(5));
    System.out.println("factorial(7):  " + MathRecursion.factorial(7));
*/
  }
  

  }