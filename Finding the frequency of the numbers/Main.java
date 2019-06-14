import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
      int count=0;
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
      for(int i=1;i<=k;i++)
      {
        for(int j=0;j<n;j++)
        {
           if(arr[j]==i)
        {
          count++;
              //System.out.println("count"+" "+count+" ");
        }
         }
        if(count>0)
        {
          System.out.println(i+" "+count+" ");
          count=0;
        }
        else
        {
          System.out.println(i+" "+count+" ");
        }
       }
    }
}
       