package Logical_program;

public class String_dublicate {
public static void main(String[] args) {
  
	int count=0; 
	String a="mummy";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='m') {
			count++; 
		}
	}
	System.out.println(count); 
	
}
}