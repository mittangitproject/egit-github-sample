package testme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Man extends Human implements Serializable{

	String name;
	
	Man(String color,String name){
	   super("White");
		this.color = color;
		this.name = name;
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Man man = new Man("Black","Mahesh");
		FileOutputStream fos = new FileOutputStream("sss.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(man);
		oos.close();
		
		FileInputStream fis = new FileInputStream("sss.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Man obj = (Man)ois.readObject();
		System.out.println(obj.color + "  " + obj.name);

	}
	

}
