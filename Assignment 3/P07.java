class P07
{
  public static void main (String args [])
  {
   int i,j,k;
    for(i=1;i<=5;i++)
   { 
	 for (k=i;k<5;k++)
	 {
	 System.out.print(" ");
	 }
     for (j=1;j<=i*2-1;j++)
	 {
	 System.out.print("*");
	 }
	 System.out.println();
   }
	 
   for(i=4;i>=1;i--)
   { 
	 for (k=i;k<=4;k++)
	 {
	 System.out.print(" ");
	 }
     for (j=1;j<=i*2-1;j++)
	 {
	 System.out.print("*");
	 }

     
	 System.out.println();
   }
  }
}