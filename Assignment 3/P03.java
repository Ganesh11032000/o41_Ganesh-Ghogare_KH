class P04
{
  public static void main (String args [])
  {
   int i,j,k;
   for(i=1;i<=5;i++)
   { 
     for (j=6-i;j>=1;j--)
	 {
	 System.out.print("*");
	 }
	   for (k=2;k<=i;k++)
	 {
	 System.out.print(" ");
	 }
     
	 System.out.println();
   }
  }
}