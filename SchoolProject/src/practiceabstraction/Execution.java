package practiceabstraction;

public class Execution {

	public static void main(String[] args) {

		String a = "Sharadkumar Sahu";

		a = a.replaceAll("\\s", "");

		String x = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			x = x + a.charAt(i);
		}
		System.out.println(x);

	}

}
