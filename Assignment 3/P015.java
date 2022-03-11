class P016
{
  public static void main(String args [])
  {
   int i,j,k,l;
   for(i=1;i<=5;i++)
   { 
   for(l=4;l>=i;l--)
     {
     System.out.print(" ");
     }
   System.out.print("*");
   if(i<5)
   {
     for(j=3;j<=i;j++)
     {
     System.out.print(" ");
     }
   }
   if(i!=1)
   {
	 for(k=i+1;k>+i;k--)
     {
     System.out.print("*");
     }
   }
	if(i==5)
	{
	 for(l=2;l<i;l++)
     {
     System.out.print("*");
     }
	}
	 System.out.println();
   }
  }
}