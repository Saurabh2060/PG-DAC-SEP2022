import java.util.Scanner;
class Matrix1
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
/*	System.out.println("enter the number of row");
	int n1 = s.nextInt();
	
	System.out.println("enter the number of coloum");
	int n2 = s.nextInt(); */
	for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=i;j++)
	  {
		  if(j==1)
	    System.out.print("A ");
	       if(j==2)
		System.out.print("B ");
           if (j==3)
        System.out.print("C ");
             if(j==4)
         System.out.print("D ");
           if (j==5)
         System.out.print("E ");			   
	  }
	   System.out.println("  ");
	}
  }
}