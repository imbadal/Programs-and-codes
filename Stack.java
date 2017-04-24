import java.util.*;
import java.lang.System.*;

class Stack{
  public static void main(String[] args) {
    int c;
    String s;
    Scanner sc=new Scanner(System.in);
    LinkedList<String> li=new LinkedList<String>();
    while(true){
    System.out.println("1:push");
    System.out.println("2:pop");
    System.out.println("3:getsize");
    System.out.println("4:diaplay");
    System.out.println("5:exit");
    System.out.println("_________________");
    System.out.println("Enter your choice");
    System.out.println();
    System.out.println();
    c = sc.nextInt();


    if (c==1) {
      System.out.println("Enter the data to push");
      s = sc.next();
      System.out.println("Pushed value is : "+ s);
      li.addFirst(s);
      }else if (c==2) {
        li.removeFirst();
      }else if (c==3) {
        System.out.println("Size is : "+li.size());
      }else if (c==4) {
         System.out.println("list is : "+ li);
      }else if (c==5) {
        System.exit(0);
      }
      else{
        System.out.println("Wrong choice");
      }
    }
  }
}
