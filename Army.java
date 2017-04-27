import java.util.*;
class Army{
  public static void main(String[] args) {
    String msg,sub;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Messsage");
    msg=sc.nextLine();
    System.out.println("Enter substring");
    sub=sc.nextLine();
    char[] arrmsg=msg.toCharArray();
    char[] arrsub=sub.toCharArray();
    // System.out.println(msg+" "+sub);
    int lmsg=arrmsg.length;
    int lsub=arrsub.length;

    int i=0,j,x,count=0;
    for (j=lsub-1;j<lmsg;j++) {
      int c=0;
      for (int k=i;k<lsub ;k++ ){
        for (x=0;x<lsub ;x++ ) {
          if (arrmsg[k]==arrsub[x]) {
            c++;
            break;
          }
          if (c==lsub) {
            count++;
            break;
          }
          if (x==lsub) {
            i=k+1;
            j=i+lsub;
            break;
          }
        }
      }
    }
System.out.println(count);
  }
}
