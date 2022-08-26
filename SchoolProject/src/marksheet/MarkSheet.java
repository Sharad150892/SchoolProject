package marksheet;

public class MarkSheet {
	
	int Physics;
	int Chemistry;
	int Mathematics;
	
	public static void main(String[] args) {
		MarkSheet Raju  = new MarkSheet();
		MarkSheet Shyam = new MarkSheet();
		MarkSheet Sharad  = new MarkSheet();
		
		Raju.Physics=45;
		Raju.Chemistry=65;
		Raju.Mathematics=70;
		
		Shyam.Physics=56;
		Shyam.Chemistry=78;
		Shyam.Mathematics=69;
		
		Sharad.Physics=88;
		Sharad.Chemistry=97;
		Sharad.Mathematics=90;
		
		System.out.println("<--------------------------------->");
		System.out.println("Mark of Raju");
		System.out.println("Physics     =" +Raju.Physics);
		System.out.println("Chemistry   =" +Raju.Chemistry);
		System.out.println("Mathematics =" +Raju.Mathematics);
		System.out.println("<--------------------------------->");
		System.out.println("Mark of Shyam");
		System.out.println("Physics     =" +Shyam.Physics);
		System.out.println("Chemistry   =" +Shyam.Chemistry);
		System.out.println("Mathematics =" +Shyam.Mathematics);
		System.out.println("<--------------------------------->");
		System.out.println("Mark of Sharad");
		System.out.println("Physics     =" +Sharad.Physics);
		System.out.println("Chemistry   =" +Sharad.Chemistry);
		System.out.println("Mathematics =" +Sharad.Mathematics);
		System.out.println("<--------------------------------->");
	}

}
