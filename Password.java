//Generate valid password of length k in increasing order
import java.util.*;
class Password{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = "123456789";
    System.out.println("Enter password length");
    int y = sc.nextInt();
    if (y==9) {
      System.out.println(str);
    }
    int l=str.length();
    int x=0;

    Password permutation = new Password();
    while(y<l){
      int p=x,q=y;
      permutation.permute(str, x, y,p,q);
      x++;
      y++;
    }
  }
  private void permute(String str, int l, int r,int p,int q)
    {
      int count=0;
        if (l == r){
          char[] ch=str.toCharArray();
          char[] c=new char[q-p];
          int z=0;
          for (int i=p;i<q ;i++ ) {
            c[z]=ch[i];
          z++;
          }
          for (int i=0;i<q-p-1 ;i++ ) {
            if (c[i]<c[i+1]) {
              count++;
            }
            else{
              break;
            }
          }
          if (count==q-p-1) {
            String str1=Arrays.toString(c);
              System.out.println(str1);
          }

           }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,p,q);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j){
       char temp;
       char[] charArray = a.toCharArray();
       temp = charArray[i] ;
       charArray[i] = charArray[j];
       charArray[j] = temp;
       return String.valueOf(charArray);
   }
}
