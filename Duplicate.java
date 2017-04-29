//First Repeating Charcter

import java.util.*;
class Duplicate{
  public static void main(String[] args) {
    System.out.println("Enter the string");
    String s;
    int a=1000;
    Scanner sc=new Scanner(System.in);
    s = sc.nextLine();
    char[] ch=s.toCharArray();
    int[] in = new int[26];
    for (int i=0;i<ch.length-1 ;i++ ) {
      int x=ch[i]-97;
      in[x]=in[x]+1;
      if (in[x]==2) {
        a=x;
        break;
      }
    }
    if (a==1000) {
      System.out.println("No repeating charcter");
    }else{
        System.out.println("Repeating charcters : "+(char)(a+97));
    }

  }
}
