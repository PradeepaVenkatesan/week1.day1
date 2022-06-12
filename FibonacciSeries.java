package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int firstNum=0,secNum=1,sumNum,i,range=8;
		System.out.println(firstNum+""+secNum);
		
		for(i=2;i<range;++i)
		{
			sumNum=firstNum+secNum;
			System.out.println(""+sumNum);
			firstNum=secNum;
			secNum=sumNum;
		}

		
	}
}
