public class frontBack {
	
	public static void main(String[] args) {
	
	String word = "heisenberg"
	if(args.length > 0) {
	word = args[0];
	}
	String firstLetter = word.substring(word.length()-1);
	String middle = word.substring(1,word.length()-2);
	String lastLetter = word.substring(0,1);

	System.out.println(firstLetter + middle + lastLetter);
	

	
	
	
	}
}

