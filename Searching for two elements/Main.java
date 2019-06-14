import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_element=in.nextInt();
      int s2=in.nextInt();
      int count=0,k=0,a=0;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==search_element)
        {
          System.out.println(count);
          k++;
        }
        if(arr[i]==s2)
        {
          System.out.println(count);
          a++;
        }
        count++;
      }
      if(k==0||a==0)
      {
        System.out.println("-1");
      }
    }
}