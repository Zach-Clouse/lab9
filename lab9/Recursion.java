/*
 * Recursion is a new way of thinking for solving problems.
 * 
 * It's a new way of solving problems by repeating a same process, just like
 * loops. 
 * 
 */
public class Recursion {

    public static void printNormalSeq(int num) {
        for (int i = 1; i <= num; ++i) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 2, -10, 5, 7, -11};
        System.out.printf("%d", mystery(-5));
        
    }
    
    static int mystery(int num) {
        if (num == 0) {
          return 0;
        } else {
          return num+mystery(num-1);
        }
      }

    

    /*
     * How do we repeat things? by calling a method from itself.
     * 
     * Every time we call a method from itself, java loads up the new call
     * inside the stack memory.
     * 
     * It's full now. So it causes java.lang.StackOverflowError exception. 
     * |               |. 
     * | recursive01() |. 
     * | recursive01() |. 
     * | recursive01() |. 
     * | recursive01() |. 
     * | recursive01() |.
     *  ---------------.
     */
    public static void recursive01() {
        
    }

    /*
     * Rule #1: we have to stop it at some point to avoid stackOverflow. 
     * So, we need a condition to stop it. This is what we call a base case.
     * 
     * Rule #2: we make the program to run toward the base case.
     * 
     */
    public static void recursive02(int num) {
          
    }
    
    // ==== Solving Problems With Recursion ====
    
    // Adding sequences e.g. 1, 2, 3, 4 + 5 = 10
    
    /**
     *  1 + 2 + 3 + 4 + 5 = 15
     *  sum(5) -> 15
     *  return 5 + sum(4)
     *              return 4 + sum(3)
     *                          return 3 + sum(2)
     *                                     return 2 + sum(1)
     *                                                  return 1
     *  sum(5) -> 15
     *  return 5 + (10) = 15
     *          return 4 + (6) = 10
     *                      return 3 + (3) = 6
     *                                  return 2 + (1) = 3
     *                                              return 1
     */
    
    // Factorial of 5 e.g. 5 * 4 * 3 * 2 * 1 = 120
    
    /*
     * 
     * factorial(5) -> 120
     *  return 5 * factorial(4)
     *             return 4 * factorial(3)
     *                        return 3 * factorial(2)
     *                                   return 2 * factorial(1)
     *                                              return 1 
     * 5!
     * return 5 * (24)
     *        return 4 * (6)
     *                   return 3 * (2)
     *                               return 2 * (1)
     *                                          return 1 
     */
    
    // Print digits e.g. printDigits(4503) -> 3  0  5  4
    public static void printDigits1(int num) {
        
    }
    
    // Print digits e.g. printDigits(4503) -> 4 5 0 3
    public static void printDigits2(int num) {
        
    }
    
    // print x to the power of n e.g. power(2, 3) -> 8  
    /*
     * power(2, 3) -> 8
     * return 2 * power(2, 2)
     *             return 2 * power(2, 1)
     *                        return 2 * power(2, 0)
     *                                   return 1
     * 
     * power(2, 3) -> 8
     * return 2 * (2)
     *        return 2 * (2)
     *                   return 2 * (1)
     *                              return 1
     */
    public static int power(int x , int n) {
        return -1;
    }
    
    
}
