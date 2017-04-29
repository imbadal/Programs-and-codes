//Diagonal of a matrix
import java.util.*;
class MatrixDiagonal{
  public static void main(String[] args) {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of n*n matrix");
    n=sc.nextInt();
    int[][] m = new int[n][n];
    System.out.println("Enter the matrix");
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        m[i][j]=sc.nextInt();
      }
    }
    int k=0,x=0;

    for (i=0;i<n;i++) {
      j=0;
      k=i;
      while(j<=x){
        System.out.print(m[k][j]+" ");
        k--;
        j++;
      }
      System.out.println();
      if(i == n-1) {
        x=1;
        for (i=n-1;i>=1;i--) {
          k=n-1;
          for (j=x;j<n;j++) {
            System.out.print(m[k][j]+" ");
            k--;
          }
          x++;
          System.out.println();
        }
        break;
      }
      x++;
    }
  }
}
