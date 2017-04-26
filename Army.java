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
    int x=0,i=0,j,k,c,d,count=0;
    for (j=lsub-1;j<lmsg;j++) {
      d=0;
      c=0;
      k=i;
      for(x=0;x<lsub;x++) {
        if (arrmsg[k]==arrsub[x]) {
          k++;
          c++;
          x=0;
          d=0;
        }
        else{
          c=0;
          d++;
        }
        if (c==lsub) {
          i++;
          j++;
          count++;
          break;
        }
      }
      if (d==lsub) {
        i=i+(k-i)+1;
        j=j+(k-i)+1;
      }
    }
System.out.println(count);
  }
}
