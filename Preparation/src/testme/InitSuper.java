package testme;

public class InitSuper {
	
	InitSuper(){
		
		System.out.println("super class constructor");
	}
	{System.out.println("super class init 1");}
	static{System.out.println("super class static 1");}
	{System.out.println("super class init2");}
	static{System.out.println("super class stsatic2");}

}


//super class static 1
//super class stsatic2
//super class init 1
//super class init 2
//super class constructor
//Inside InitTest - instance block1 static
//Inside InitTest - instance block2 static
//Inside InitTest - instance block1
//Inside InitTest - instance block2
//Inside InitTest - constructor
