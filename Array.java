//Second largest element of an array
import java.util.*;
class Array{
  public static void main(String[] args) {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size");
  n=sc.nextInt();
  int[] arr=new int[n];
  for (int i = 0;i<n ;i++ ) {
    arr[i]=sc.nextInt();
  }
  Arrays.sort(arr);
  System.out.println("Second largest number is "+arr[n-2]);
}
}
