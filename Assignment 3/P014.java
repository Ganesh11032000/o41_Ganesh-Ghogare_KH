class P014
{
  public static void main (String args [])
  {
   int i,j,k;
    for (i=1;i<=5;i++)
   { 
     for (j=2;j<=i;j++)
	 {
	 System.out.print(" ");
	 }
     for (k=5;k>=i;k--)
	 {
	 System.out.print("* ");
	 }
	 System.out.println();
   }
   
	 for (i=2;i<=5;i++)
	 {
	 for (k=4;k>=i;k--)
	 {
	 System.out.print(" ");
	 }
	 for (j=1;j<=i;j++)
	 {
	 System.out.print("* ");
	 }
	 System.out.println();
   }
	 
  
   
  }
}