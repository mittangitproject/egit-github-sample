package testme;

public class EnumEqual {

	/**
	 * @param args
	 */
	
	enum Color{RED,BLUE}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1  = Color.RED;
		Color c2  = Color.BLUE;
		if(c1==c2){System.out.println("c1==c2");}
		if(c1.equals(c2)){System.out.println("c1.e");}

	}

}
