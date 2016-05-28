package com.google.pre.D23092015;

class Weeks {
	
	private String week[] = {"Sun","mon","Tue","wed","Thr","Fri","sat"};
	
	private Integer a = 12;

	

	
	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public String[] getWeek() {
		return week.clone();
	}

	public void setWeek(String[] week) {
		this.week = week;
	}
}


public class CloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Weeks w = new Weeks();
		
		
		System.out.println(w.getWeek()[1]);
		
	     w.setA(w.getA()+12);
		 
		 System.out.println(w.getA());
		

	}

}
