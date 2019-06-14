import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr=in.nextInt();
      int arry[]=new int[arr];
      int arryy[]=new int[arr];
      int i,count=0,k,l;
      for(i=0;i<arr;i++)
      {
        arry[i]=in.nextInt();
      }
      k=arry[0];
      for(i=0;i<arr;i++)
      {
        if(k<arry[i])
        {
          k=arry[i];
        }
      }
      System.out.println(k);
    }
}