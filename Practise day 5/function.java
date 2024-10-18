import java.util.Scanner;

public class function {
    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }
 
 
    // public static int calculateProduct(int a, int b) {
    //    return a * b;
    // }
 
 
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
 
 
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
 
 
        System.out.println(factorial);
        return;

    }
     public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


       printFactorial(n);
   }
}



} 