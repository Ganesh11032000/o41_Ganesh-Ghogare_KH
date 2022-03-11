import java.util.Scanner;
class P7
{
  public static void main(String args [])
    {int i,j,k;
      for(i=1;i<=5;i++)
	  {
	    for(k=5-i;k>=1;k--)
		  {
			  System.out.print(" ");
		  }
		  for(j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		 System.out.println(); 
	  }
	  
    }
}