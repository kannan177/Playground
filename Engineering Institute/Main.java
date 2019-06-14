import java.util.Scanner;

class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int baseSalary)
  {
     System.out.println("IT Faculty: "+(baseSalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}
class Main
{
  public static void main(String[] args)
  {
       Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    if(baseSalary > 0)
    {
    Faculty aaa = new Faculty();
    aaa.salary(baseSalary);
    CSE bbb = new CSE();
    bbb.salary(baseSalary);
    IT ccc = new IT();
   ccc.salary(baseSalary);
    ECE ddd = new ECE();
    ddd.salary(baseSalary);
    
    }
    else
    {
      System.out.println("null");
    }
    //ECE obj = new ECE();
    //implement your required concept here
  }
}