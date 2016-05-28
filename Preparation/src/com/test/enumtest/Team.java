package com.test.enumtest;

public class Team {

	
	public void show(){
		int p=80;
		go(p);
		System.out.println(p);
	}
	
	public void go(int x){
		
		x+=10;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Team team = new Team();
		team.show();

	}

}
