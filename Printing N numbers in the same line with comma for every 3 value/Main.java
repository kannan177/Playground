import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    for(int i=1;i<=a;i++)
    {
      System.out.print(i);
      if(i>1)
      {
      if(i%3==0)
        System.out.print(",");
    }
    }
   //Type your code here
  }
}