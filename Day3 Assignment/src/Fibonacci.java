
public class Fibonacci {
	private int lower;
	private int higher;
	
	
	public Fibonacci(int lower,int higher) {
		super();
		this.lower=lower;
		this.higher=higher;
	}
	
 public void displaySeries() {
	 int a=lower;
	 int b=lower+1;
	 int c=0;
	 System.out.print(a + " " + b + " "); 
	 for(int i=lower+2;i<=higher;i++) {
		c=a+b;
		 if(c>higher)
			 break;
		 System.out.print(c+" ");
		 a=b;
		 b=c;
	 }
 }
		
}