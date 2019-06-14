import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a,b,c;
      Scanner in =new Scanner(System.in);
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      if(a<b)
        a=b;
        if(a<c)
        {
          a=c;
     // System.out.println(a);
        }
        System.out.println(a);
    }
    }