import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in =new Scanner(System.in);
      int a=in.nextInt();
      int arr[]=new int[a];
      int temp[]=new int[a];
      int temp2[]=new int[a];
      int indax,j,i,k,z;
      for(i=0;i<a;i++)
      {
        arr[i]=in.nextInt();
      }
      for(i=0,j=0,k=0;i<a;i++)
      {
        if(arr[i]!=0)
        {
          temp[j]=arr[i];
          j++;
        }
        else
        {
          temp2[k]=arr[i];
          k++;
        }
      }
      z=j;
      for(i=0,j=0;i<z;i++)
      {
        arr[i]=temp[j];
        j++;
      }
        for(i=z,k=0;i<a;i++)
      {
        arr[i]=temp2[k];
        k++;
      }
       for(i=0;i<a;i++)
      {
       System.out.print(arr[i]+" ");
      }
    }
}
