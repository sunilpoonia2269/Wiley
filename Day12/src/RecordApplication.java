
public class RecordApplication {

	public static void main(String[] args) {
		
		// Anonymous class approach
		Records r = new Records() {
			@Override
			public void displayAllRecords(int x, int y) {
				// TODO Auto-generated method stub
				for(int i=x; i<=y; i++) {
					System.out.println(i);
				}
			}
			
		};
		r.displayAllRecords(1, 8);
		
		Records r1 = (int x, int y)->{
			System.out.println("Lambda expression");
			for(int i=x; i<=y; i++) {
				System.out.println(i);
			}
		};
		r1.displayAllRecords(3, 7);
		
		
		Records r2 = (x,y)->{
			System.out.println("Lambda expression without type");
			for(int i=x; i<=y; i++) {
				System.out.println(i);
			}
		};
		r2.displayAllRecords(2, 7);
	}

}
