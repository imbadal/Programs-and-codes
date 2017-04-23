import java.util.*;
class Duplicate{
  public static void main(String[] args) {
    System.out.println("Enter the string");
    String s;
    Scanner sc=new Scanner(System.in);
    s = sc.nextLine();
    char[] ch=s.toCharArray();
    int[] in = new int[26];
    for (int i=0;i<ch.length-1 ;i++ ) {
      int x=ch[i]-97;
      in[x]=in[x]+1;
    }
    for (int i=0;i<26;i++ ) {
      if(in[i]>1){
        System.out.println((char)(i+97) +" ");
      }
    }

  }
}
