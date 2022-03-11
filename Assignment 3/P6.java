import java.util.Scanner;
class P6
{
  public static void main(String args [])
    {int i,j,k;
      for(i=1;i<=10;i+=2)
	  {
	    for(k=9-i;k>=1;k--)
		  {
			  System.out.print(" ");
		  }
		  for(j=1;j<=i;j+=2)
		  {
			  System.out.print("* ");
		  }
		 System.out.println();
        k--;		 
	  }
	  
    }
}