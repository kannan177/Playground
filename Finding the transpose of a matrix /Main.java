import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int arr[][]=new int[a][b];
     for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
       arr[i][j]=sc.nextInt(); 
      }
    }
     for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
       System.out.println();
    }
  }
}