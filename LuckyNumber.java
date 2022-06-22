public class LuckyNumber {
	public static void main(String[] args) {
		int num=1523;
		int temp;
		int i=1;
		double sq=0;
		while(num!=0)
		{
			i++;
			temp=num%10;
			if(i%2==0)
			{
				//System.out.println(temp);
				sq=sq+Math.pow(temp, 2);
			}
			
			//System.out.println(temp);
			num=num/10;
		}
		//System.out.println(sq);
		if(sq%9==0)
		{
			System.out.println("The number 1623 is a Lucky number");
		}
		else
		{
			System.out.println("Oops! Not a Lucky number");
		}
	}

}
