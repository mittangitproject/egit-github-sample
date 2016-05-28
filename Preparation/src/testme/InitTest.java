package testme;

public class InitTest  extends InitSuper{

	
	InitTest(){
		System.out.println("Inside InitTest - constructor");
	}
	
	{
		System.out.println("Inside InitTest - instance block1");
	}
	
	static{System.out.println("Inside InitTest - instance block1 static");}
	static{System.out.println("Inside InitTest - instance block2 static");}
	{System.out.println("Inside InitTest - instance block2");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InitTest();

	}

}
