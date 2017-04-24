import java.util.*;
class Demo{
    public static void main(String[] args) {
      TreeMap<String,String> tm=new TreeMap<String,String>();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size");
      int size=sc.nextInt();
      for (int i=0;i<size;i++) {
        String Fname=sc.next();
        String Lname=sc.next();
        tm.put(Lname,Fname);
      }
      System.out.println();
      for(Map.Entry v:tm.entrySet()){
        System.out.println(v.getKey()+" "+v.getValue());
      }
    }
  }
