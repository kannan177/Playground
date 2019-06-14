import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
Scanner in=new Scanner(System.in);
      int a =in.nextInt();
      int count=1;
      for(int i=1;count<=a;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
          count=count+1;
        }
      }
    }
}