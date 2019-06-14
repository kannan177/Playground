import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int kan=0, initial,count;
      for(initial=1;initial<=a;initial++)
      {
        kan =kan+initial;
      }
      System.out.println(kan);
	}
}