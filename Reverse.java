//Reverse an array
import java.util.*;
class Reverse{
  public static void main(String[] args) {
    int n;
    System.out.println("Enter array size");
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.nextLine());
    int[] arr = new int[n];
    for (int i=0;i<n ;i++ ) {
      arr[i]=Integer.parseInt(sc.nextLine());
    }
    int j,t;
    j=n-1;
    for (int i=0;i<n ;i++ ) {
      if (i>=j) {
        break;
      }
      t=arr[i];
      arr[i]=arr[j];
      arr[j]=t;
      // arr[i]=arr[i]+arr[j];
      // arr[j]=arr[i]-arr[j];
      // arr[i]=arr[i]-arr[j];
      j--;
    }
    System.out.println("Reversed Arr is:");
    for (int i=0;i<n ;i++ ) {
      System.out.println(arr[i]+" ");
    }
  }
}
