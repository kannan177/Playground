import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int a = in. nextInt();
      int count=1,first=1;
      int temp=a;
    while(a!=0)
    {
       count=count*10;
      a=a/10;
      
    } 
      count=count/10;
      a=temp;
      while(first!=2)
      {
        a=a%count;
        first++;
      }
        count=count/10;      
      a=a/count;
      System.out.println(a);
    }
}
      