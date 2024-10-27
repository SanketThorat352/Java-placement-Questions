//Print the fibonacci sequence till nth term.
public class Recursion5 {
   
class Recursion1 {
public static void printFactorial(int a, int b, int n) {
if(n == 0) {
return;
}
System.out.println(a);
printFactorial(b, a+b, n-1);
}
public static void main(String args[]) {
printFactorial(0, 1, 5);
}
}
}