package AutomationQa.AutomationDemo;

import java.util.ArrayList;

public class CoreJavaConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] arry1= {1,2,4,5,8,6,9,14,17,19,100,122,145};
		
		
		 * for(int i=0; i<arry1.length; i++) { if(arry1[i] % 2 == 0) {
		 * System.out.println(arry1[i]); }else{
		 * System.out.println(arry1[i]+"is not multiply with 2"); } }
		 
		for(int i=arry1.length-1; i>=0; i--) {
			System.out.println(arry1[i]);
		}
		for(int i=0; i<arry1.length; i++) {
			System.out.println(arry1[i]);
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("Shoba");
		a.add("siva");
		a.add("varshu");
		System.out.println(a.get(2));
	
	for(String val : a) {
		System.out.println(val);
		
	}*/
	String s="java practice programs ";
	String[] splitedstring =s.split("practice");
	System.out.println(splitedstring[0]);
	System.out.println(splitedstring[1].trim());
		//count vowels and consonants
		String line = "Hello world";
		 int vowels = 0, consonants =0;
		
		for (int i=0; i<line.length(); i++) {
			char ch=line.charAt(i);
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				++vowels;
				
			}
			else if (ch >='a' && ch<='z'){
				++consonants;
			}
		}
		System.out.println("Vowels "+vowels);
		System.out.println("consonants "+consonants);
	
	}
}
