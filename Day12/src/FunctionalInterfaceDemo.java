
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.function.Consumer;

class FunctionalInterfaceDemo {


	public static void main(String[] args) {
//		Consumer<String> consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String name) {
//				// TODO Auto-generated method stub
//				System.out.println("Name is " + name);
//				
//			}
//			
//		};
//		
//		consumer.accept("Sunil");
		
		
		InputStream is = new FileInputStream();
		
		Consumer<String> consumer = (name)->System.out.println("Name is " + name);
		consumer.accept("Sunil");
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sunil");
		list.add("Mohit");
		list.add("Yash");
		
		
		//list.forEach(consumer);
		
		list.forEach((name)-> System.out.println(name.toUpperCase()));
	}

}
