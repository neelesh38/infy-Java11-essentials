
public class sumOfDigit {
	public static void main(String[] args) {
		int n = 2589;
		int sum=0;
		
		while(n!=0)
		{
			int temp = n%10;
			sum=sum+temp;
			n=n/10;
		}
		
		System.out.print(sum);
	}

}
