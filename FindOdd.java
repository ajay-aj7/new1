class FindOdd 
{
	public static void main(String[] args) 
	{
		int num=125,sum=0,rem;
		  while (num>0)
		  {
			  rem=num%10;
		  
			 if (rem%2!=0)
			 {
				 sum=sum+rem*rem;
			 }
			    num/=10;
		  }

		System.out.println(sum);
	}
}
