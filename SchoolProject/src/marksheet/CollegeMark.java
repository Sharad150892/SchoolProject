package marksheet;

public class CollegeMark {
	
	public String Mark(int M3, int TOM, int FP, int MP, int EM, int CA, String stuName) {
		System.out.println("Name of Student:- " +stuName);
		System.out.println("Name of Subject--> "+"1.M3= "+M3+ " 2.TOM= "+TOM+" 3.FP= "+FP+" 4.MP= "+MP+" 5.EM= "+EM+" 6.CA= "+CA);
		int c =M3+TOM+FP+MP+EM+CA;
		System.out.println("Total:-"+c);
	
			return "Pass";
		
	}
	public static void main(String[] args) {
		CollegeMark obj = new CollegeMark();
		System.out.println(obj.Mark(50, 40, 60, 50, 76, 85, "Sharad"));
		System.out.println("<------------------------------------------>");
		System.out.println(obj.Mark(30, 50, 20, 40, 32, 23, "Shyaam"));
	}

	

}
