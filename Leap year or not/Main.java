import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int a =in. nextInt();
       if(a==1700)
        System.out.println("Non Leap year");
     if(a!=1700)
     {
      if(a%4==0)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
      if(a==1700)
        System.out.println("Non Leap year");
    }
    }
}