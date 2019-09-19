package com.revature.grading.model;

public class Admindetails {

	private String Sname;
	private int REGNO;
	private int ENG;
	private int MAT;
	private int COM;
	private int Science;
	private int Social;
	private int Total;
	private Double Avg;
	private String Grade;
	private String NAME;
	private String PASSWORD;

	
	private int max1;
	private int max2;
	public int getMax1() {
		return max1;
	}

	public void setMax1(int max1) {
		this.max1 = max1;
	}

	public int getMax2() {
		return max2;
	}

	public void setMax2(int max2) {
		this.max2 = max2;
	}

	public int getMax3() {
		return max3;
	}

	public void setMax3(int max3) {
		this.max3 = max3;
	}

	public int getMax4() {
		return max4;
	}

	public void setMax4(int max4) {
		this.max4 = max4;
	}

	public int getMin1() {
		return min1;
	}

	public void setMin1(int min1) {
		this.min1 = min1;
	}

	public int getMin2() {
		return min2;
	}

	public void setMin2(int min2) {
		this.min2 = min2;
	}

	public int getMin3() {
		return min3;
	}

	public void setMin3(int min3) {
		this.min3 = min3;
	}

	public int getMin4() {
		return min4;
	}

	public void setMin4(int min4) {
		this.min4 = min4;
	}

	public String getGrade1() {
		return grade1;
	}

	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}

	public String getGrade2() {
		return grade2;
	}

	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}

	public String getGrade3() {
		return grade3;
	}

	public void setGrade3(String grade3) {
		this.grade3 = grade3;
	}

	public String getGrade4() {
		return grade4;
	}

	public void setGrade4(String grade4) {
		this.grade4 = grade4;
	}

	private int max3;
	private int max4;
	
	private int min1;
	private int min2;
	private int min3;
	private int min4;
	
	private String grade1;
	private String grade2;
	private String grade3;	
	private String grade4;
	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public int getREGNO() {
		return REGNO;
	}

	public void setREGNO(int rEGNO) {
		REGNO = rEGNO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getMOBILENO() {
		return MOBILENO;
	}

	public void setMOBILENO(int mOBILENO) {
		MOBILENO = mOBILENO;
	}

	public String getROLE() {
		return ROLE;
	}

	public void setROLE(String rOLE) {
		ROLE = rOLE;
	}

	private int MOBILENO;
	private String ROLE;

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getRegNo() {
		return REGNO;
	}

	public void setRegNo(int regno) {
		REGNO = regno;
	}

	public int getENG() {
		return ENG;
	}

	public void setENG(int eng) {
		ENG = eng;
	}

	public int getMAT() {
		return MAT;
	}

	public void setMAT(int mat) {
		MAT = mat;
	}

	public int getCOM() {
		return COM;
	}

	public void setCOM(int com) {
		COM = com;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getSocial() {
		return Social;
	}

	public void setSocial(int social) {
		Social = social;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public Double getAvg() {
		return Avg;
	}

	public void setAvg(Double avg) {
		Avg = avg;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Admindetails [Sname=" + Sname + ", REGNO=" + REGNO + ", ENG=" + ENG + ", MAT=" + MAT + ", COM=" + COM
				+ ", Science=" + Science + ", Social=" + Social + ", Total=" + Total + ", Avg=" + Avg + ", Grade="
				+ Grade + ", NAME=" + NAME + ", PASSWORD=" + PASSWORD + ", max1=" + max1 + ", max2=" + max2 + ", max3="
				+ max3 + ", max4=" + max4 + ", min1=" + min1 + ", min2=" + min2 + ", min3=" + min3 + ", min4=" + min4
				+ ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3 + ", grade4=" + grade4
				+ ", MOBILENO=" + MOBILENO + ", ROLE=" + ROLE + ", getMax1()=" + getMax1() + ", getMax2()=" + getMax2()
				+ ", getMax3()=" + getMax3() + ", getMax4()=" + getMax4() + ", getMin1()=" + getMin1() + ", getMin2()="
				+ getMin2() + ", getMin3()=" + getMin3() + ", getMin4()=" + getMin4() + ", getGrade1()=" + getGrade1()
				+ ", getGrade2()=" + getGrade2() + ", getGrade3()=" + getGrade3() + ", getGrade4()=" + getGrade4()
				+ ", getPASSWORD()=" + getPASSWORD() + ", getREGNO()=" + getREGNO() + ", getNAME()=" + getNAME()
				+ ", getMOBILENO()=" + getMOBILENO() + ", getROLE()=" + getROLE() + ", getSname()=" + getSname()
				+ ", getRegNo()=" + getRegNo() + ", getENG()=" + getENG() + ", getMAT()=" + getMAT() + ", getCOM()="
				+ getCOM() + ", getScience()=" + getScience() + ", getSocial()=" + getSocial() + ", getTotal()="
				+ getTotal() + ", getAvg()=" + getAvg() + ", getGrade()=" + getGrade() + ", getSUDENTNAME()="
				+ getSUDENTNAME() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getSUDENTNAME() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAvg(int avg2) {
		// TODO Auto-generated method stub
		
	}

	public void setGrade(int grade2) {
		// TODO Auto-generated method stub
		
	}

}
