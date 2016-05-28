package testme;

public class MySingleton {
	
	private static MySingleton obj;
	
	static{
		obj = new MySingleton();
	}
	
	private MySingleton(){}
	
	public static MySingleton getInstance(){
		
		return obj;
	}
	

}
