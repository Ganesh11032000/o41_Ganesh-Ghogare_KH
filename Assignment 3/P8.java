import java.util.Scanner;
class P8
{
  public static void main(String args [])
    {int i,j,k;
      for(i=1;i<=5;i++)
	  {
	    for(k=5-i;k>=1;k--)
		  {
			  System.out.print(" ");
		  }
		  for(j=6-i;j<6;j++)
		  {
			  System.out.print(j+" ");
		  }
		 System.out.println(); 
	  }
	  
    }
}