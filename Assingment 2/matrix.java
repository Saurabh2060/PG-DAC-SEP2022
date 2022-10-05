import java.util.Scanner;
class matrix
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
	System.out.println("enter the number of row");
	int n1 = s.nextInt();
	
	System.out.println("enter the number of coloum");
	int n2 = s.nextInt();
	for(int i=1;i<=n1;i++)
	{
	  for(int j=1;j<=i;j++)
	  {
	    System.out.print(j+" ");
	  }
	   System.out.println("  ");
	}
  }
}