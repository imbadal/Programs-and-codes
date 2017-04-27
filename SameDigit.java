import java.util.*;
class SameDigit{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int p,q,count=0;
    p=sc.nextInt();
    q=sc.nextInt();
    for (int n=p;n<=q ;n++ ) {
      int r = n%10;
      String s=Integer.toString(n);
      int l=s.length();
      int x=n/(int)Math.pow(10, l-1);
      if (x==r) {
        count++;
      }
    }
    System.out.println(count);

  }
}
