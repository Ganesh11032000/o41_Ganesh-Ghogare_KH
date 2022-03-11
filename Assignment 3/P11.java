import java.util.Scanner;
class P11
{
  public static void main(String args [])
    {int i,j,k,l;
      for(i=1;i<=5;i++)
	  {
	    for(l=4;l>=i;l--)
		  {
			  System.out.print(" ");
		  }
	    for(k=1;k<=i;k++)
		  {
			  System.out.print("*");
		  }
		  for(j=1;j<i;j++)
		  {
			  System.out.print("*");
		  }
		 System.out.println(); 
	  }
	  
    }
}