import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
for(int i=1;i<=a;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
   
      }
	}
}