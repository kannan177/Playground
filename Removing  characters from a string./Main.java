import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String str1=sc.nextLine();
  StringBuilder str2=new StringBuilder(str);
  StringBuilder str3=new StringBuilder(str1);
   StringBuilder str4=new StringBuilder("");
  int a=str2.length();
  int b=str3.length();
  int i,j,count=0;
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      if(str2.charAt(i)==str3.charAt(j))
      {
        count++;
      }
    }
    if(count==0)
    {
        str4.append(str2.charAt(i));
     }
    count=0;
  }
  System.out.println(str4);
}
}