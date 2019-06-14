import java.util.Scanner;
class Main{
  public static int kan(int b,int c)
  {
    if(b>c)
      return b;
    else
      return c;
  }
	public static void main (String[] args){
	    // Type your code here
     Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int d,j;
      if(a<b)
      {
        a=b;
      }
      else
        b=a;
      //System.out.println(b);
     d=kan(b,c);
      System.out.println(d);
	}
}