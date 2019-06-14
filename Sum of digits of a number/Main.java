import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int a = in. nextInt();
      int count=0,first;
      int temp=a;
    while(a!=0)
    {
       //count=count*10;
      first=a%10;
      count=count+first;
      a=a/10;
    }
      System.out.println(count);
    }
}