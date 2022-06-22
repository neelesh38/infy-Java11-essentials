
public class evenSum {
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		int sum=0;
		for(int i:numbers)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		
		System.out.print(sum);
	}

}
