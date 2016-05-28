package com.google.pre.d23102015;

public class EqualsTest {

	/**
	 * @param args
	 */
	
	private int rollNo;
	private String name;
	
	
	public EqualsTest(){}
	
	public EqualsTest(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}




	public int getRollNo() {
		return rollNo;
	}




	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

   
	public boolean equals(Object obj) {
		boolean flag = false ;
		
		if(obj == null || obj.getClass() != getClass()){
			
			flag = false;
		}else{
			
			EqualsTest eqtest = (EqualsTest)obj;
			
			if((this.rollNo == eqtest.getRollNo()) && (this.name == eqtest.getName())) {
				
				flag = true;
			}
			
		}
		
		return flag;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EqualsTest et1 = new EqualsTest(518, "smruti");
		EqualsTest et2 = new EqualsTest(518, "smruti1");
		
		if(et1.equals(et2) == true){
			System.out.println("Match");
		}else{
			System.out.println("No Match");
		}

	}

}
