package com.google.pre.D23092015;
import java.util.Iterator;

class SampleDataStructure{
	
	int SIZE = 15;
	int[] arrayOfInts = new int[SIZE];
	
	public SampleDataStructure(){
		
		for(int i=0;i<SIZE;i++){
			
			arrayOfInts[i] = i;
		}
	}
	
	interface CustomizeDS extends Iterator<Integer>{}
	
	public void show(){
		
		Iterator itr = this.new innerDS();
		while(itr.hasNext()){
			System.out.println(itr.next() + "  ");
		}
		
	}
	
	private class innerDS implements CustomizeDS{
		
		int baseIndex = 0;

		public boolean hasNext() {
			
			return (baseIndex <= (SIZE-1));
		}

		public Integer next() {
			
			Integer returnedValue = Integer.valueOf(arrayOfInts[baseIndex]);
			baseIndex = baseIndex + 2;
			return returnedValue;
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}


public class SampleTwo {
	
	public static void main(String[] args) {
		
		new SampleDataStructure().show();
		
	}

}
