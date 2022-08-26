package marksheet;

public class SkPublicSchool {
	
int Phy;	int Chem;	int Math;	String stu;
	
	public SkPublicSchool(int Phy, int Chem, int Math, String stu) {
		this.Phy=Phy;	this.Chem=Chem;	 this.Math=Math;	 this.stu=stu;
		System.out.println("Name of Student= "+"["+stu+"]");
		System.out.println("Physics	   = "+"|"+Phy+" |");
		System.out.println("Chemistry  = "+"|"+Chem+" |");
		System.out.println("Mathematics= "+"|"+Math+" |");
		Total();
		
	}
	public void Total() {
		int Total=Phy+Chem+Math;
		System.out.println("Total Marks= "+"|"+Total+"|");
		if (Phy>40 && Chem>40 && Math>40 && Total>150)
			System.out.println("Pass"+"\n");
		else
			System.out.println("Fail"+"\n");
	}
	public static void main(String[] args) {
		new SkPublicSchool(78,67,89,"Sharad");
		System.out.println("<------------------------------>");		
		new SkPublicSchool(45,40,61,"Shyam");
		System.out.println("<------------------------------>");	
		new SkPublicSchool(39,78,90,"Sahu");
	}

}
