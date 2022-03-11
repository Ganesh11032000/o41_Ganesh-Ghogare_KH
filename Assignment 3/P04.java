class P05
{
  public static void main (String args [])
  {
   int i,j,k;
   for(i=1;i<=10;i+=2)
   { 
	 for (k=10;k<i;k-=2)
	 {
	 System.out.print(" ");
	 }
     for (j=1;j<=i;j+=2)
	 {
	 System.out.print("*");
	 }

     
	 System.out.println();
   }
  }
}