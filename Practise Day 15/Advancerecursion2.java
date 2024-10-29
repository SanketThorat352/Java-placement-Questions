//CountPathMaze 

public class Advancerecursion2 {
    
    
    
    
       public static int countPaths(int i, int j, int m, int n) {
           if(i == m-1 || j == n-1) {
               return 1;
           }
    
    
           return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
       }
    
    
       public static void main(String args[]) {
           int m = 4, n = 5;
           System.out.println(countPaths(0, 0, m, n));
       }
    }
    
}
