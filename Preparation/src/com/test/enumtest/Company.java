package com.test.enumtest;

public class Company {

	/**
	 * @param args
	 */
	
	CompanySize companySize;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Company com1 = new Company();
//		Company com2 = new Company();
//		Company com3 = new Company();
//		Company com4 = new Company();
//       
//		com1.companySize = CompanySize.BIG;
//		com2.companySize = CompanySize.SMALL;
//		com3.companySize = CompanySize.MEDIUM;
//		com4.companySize = CompanySize.EXTRA_LARGE;
//		
		for(CompanySize cs : CompanySize.values()) {
			
			System.out.println(cs.getCapacity());
		}
		
	}

}
