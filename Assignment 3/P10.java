class P10
{
  public static void main(String args [])
  {
    
	int i,j ,k;
	
	for(i=1;i<=5;i++)
	{char c=70;
       c-=i;
		for(j=5-i;j>=1;j--)
	  {
	  System.out.print(" ");
	  }
	  for(k=i;k>=1;k--)
	  {
	  System.out.print(c+" ");
	  c++;
	  
	  }
	  System.out.println();
	}
	
  }
}