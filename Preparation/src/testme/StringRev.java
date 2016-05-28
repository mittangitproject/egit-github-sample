package testme;

public class StringRev {

	/**
	 * @param args
	 */
	
	public String stringReverse(String value){
		String finalString = "";
		if(value.length() == 1) {
			finalString = value;
			
		}else{
			
			char[] ch = value.toCharArray();
			StringBuffer sb = new StringBuffer();
			for(int i = ch.length - 1; i >= 0 ; i--){
				
				sb.append(ch[i]);
			}
			
			finalString = new String(sb).trim();
		}
		return finalString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "Mittan sadma Husen";
		
		String fValue = new StringRev().stringReverse(value);
		System.out.println("After Reverse : " + fValue);

	}

}
