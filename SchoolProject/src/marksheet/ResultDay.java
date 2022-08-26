package marksheet;

public class ResultDay {
	
	public String Marks(int Phy, int Chem, int Math, String stuName) {
		System.out.println("Name of Student:- "+stuName);
		System.out.println("Physics    :- "+Phy);
		System.out.println("Chemistry  :- "+Chem);
		System.out.println("Mathematics:- "+Math);
		int c = Phy+Chem+Math;
		System.out.println("Total      :- "+c);
		if (Phy>40 && Chem>40 && Math>40 && c>150 )
			return "Pass";
		else
			return "Fail";		
	}
	public static void main(String[] args) {
		ResultDay obj = new ResultDay();
		System.out.println(obj.Marks(50, 75, 80, "Sharad"));
		System.out.println("<------------------------------------>");
		System.out.println(obj.Marks(39, 60, 40, "Sahu"));
		System.out.println("<------------------------------------>");
		System.out.println(obj.Marks(35, 60, 70, "Raju"));
	}

}
