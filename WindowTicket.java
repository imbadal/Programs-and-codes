//Maximun Revenue by window ticket
import java.util.*;
class WindowTicket{


  public static void main(String[] args) {
    int w;
    int sum=0;
    int max=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Window size");
    w=sc.nextInt();
    int[] arr= new int[w];

    System.out.println("Enter Reamaining tickets");
    for (int i=0;i<w ;i++ ) {
      arr[i]=sc.nextInt();
    }
    while(max!=0){
      max=maximum(arr);
      sum=sum+max;
    }
    System.out.println("Maximum Revenue is: "+sum);
  }
  static int maximum(int[] arr){
    int c=0,max;
    max=arr[0];
    for (int i=0;i<arr.length ;i++ ) {
      if(max<arr[i]){
        max=arr[i];
        c=i;
      }

    }
    arr[c]--;
    return max;
  }
}
