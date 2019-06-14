import java.util.Scanner;
public class Main{
public static void kan(int a,int b,int c)
{
  while(a!=1)
  {
    if((b%a==0)&&(c%a==0))
    {
      System.out.println(a);
      break;
    }
      a--;
  }
}
  public static void main (String[] args)
	{
      Scanner in =new Scanner(System.in);
      int a =in.nextInt();
     int b,c,d,i;
      b=in.nextInt();
      c=in.nextInt();
      if(a<b&&a<c)
      {
        kan(a,b,c);
      }
      if(b<a&&b<c)
      {
        kan(b,a,c);
      }
      if(c<a&&c<b)
      {
        kan(c,a,b);
      }
	}
}