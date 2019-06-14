import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int a = in. nextInt();
      int count=1,first,sec;
      int temp=a;
    while(a!=0)
    {
       count=count*10;
      a=a/10;
     
    } 
      count=count/10;
      first=temp/count;
      sec = temp%10;
      count=first+sec;
      System.out.println(count);
    }
}