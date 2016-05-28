package testme;

public class Xxx {

	/**
	 * @param args
	 */
	
	public void displayAdd(int x,Integer y){System.out.println("int - Integer");}
	public void displayAdd(int...is ){System.out.println("Integer - int");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xxx xxx  = new Xxx();
		xxx.displayAdd(10, 10);

	}

}
