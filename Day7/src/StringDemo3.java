import java.util.StringTokenizer;

public class StringDemo3 {

	public static void main(String[] args) {
		String data = "Welcome to java programming";
		
		// Recommended - 
		String[] result = data.split(" ");
		
		for(String str : result)
			System.out.println(str);
		
		/// Older way 
		StringTokenizer tokens = new StringTokenizer("Welcome to java programming");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		
		String complicatedString = "Welcom to some *stuff $ which ## I am going to do @ I am done [ how you are doing ]";
		String[] meaningFulWords = complicatedString.split("[!,$ .?*@##]+");
		
		for(String str : meaningFulWords)
			System.out.println(str);
		
	}

}
