import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
      int temp;
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      int b=sc.nextInt();
      for(int i=0;i<a;i++)
      {
        for(int j=i+1;j<a;j++)
        {
          if(arr[j]>arr[i])
          {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
          }
        }
      }
      for(int i=0;i<a;i++)
      {
       //System.out.print(arr[i]+" ");
      }
       System.out.println(arr[b-1]+" ");
      // Type your code here
    }   
}