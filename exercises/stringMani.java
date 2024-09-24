public class stringMani {
	public static void main(String[] args) {

	String str = "http://www.academiadecodigo.org";

	String domain = str.replace("http://", "");
	String name = "< " + str.replace("http://www.", "")
				.replace(".org", "")
				.replaceFirst("a", "A")
				.replaceFirst("iad", "ia D")
				.replaceFirst("co", " Co")
				+ "_>";

	System.out.println( "I am Code Cadet at " + name + "," + domain);


	}
}

