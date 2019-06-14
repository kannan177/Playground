import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int b,c;
    //Type your code here
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
   b=a%10;
    b=b*100;
    c=a%100;
    c=c/10;
    c=c*10;
    b=b+c;
    b=b+(a/100);
    System.out.println(b);
  }
}