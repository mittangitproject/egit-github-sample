package testme;

public class addTestInterfaceMain {

	/**
	 * @param args
	 */
	
	static addTestInterface addTestInterface = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTestInterface = new addTestInterfaceImpl();
		System.out.println(addTestInterface.add(12, 34));
		
	}

}
