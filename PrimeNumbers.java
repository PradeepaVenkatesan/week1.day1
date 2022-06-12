package week1.day1.assignments;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i,a=0,flag=0;
		int b=13;
		a=b/2;
		if(b==0||b==1) {
			System.out.println(b+ "Not a Prime");
		}
		else {
			for(i=2;i<=a;i++) {
				if(b%i==0) {
					System.out.println(b+ "Not a Prime");
					flag=1;
	
				}
			}
			if(flag==0) {
				System.out.println(b+ "is a Prime Number");
			}
		}
		
	}

}
