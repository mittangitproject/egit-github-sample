package testme;

public class MainA {

	/**
	 * @param args
	 */
	
     public void display(){
		
		System.out.println("I am Inside class - MainA dispaly Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bi = new B();
		MainA ma = new MainA();
		ma.display();
		bi.display();

	}

}
