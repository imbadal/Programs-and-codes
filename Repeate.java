import java.util.* ;
class Repeate{
  public static void main(String[] args) {
    String s;
    System.out.println("Enter a string");

    Scanner in = new Scanner(System.in);
    s = in.nextLine();
    char[] ch = s.toCharArray();
    char[] arr = new Array(ch.length -1);
    for (int i = 0; i < ch.length - 1 ; i++ ) {
      for (int j = i+1 ; j < ch.length ; j++ ) {
        if(ch[i] == ch[j]){
          System.out.printl(ch[i]+ " ");
          arr[i]=
          break;
        }
      }
    }
  }
}
