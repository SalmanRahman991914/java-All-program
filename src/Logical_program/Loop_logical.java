package Logical_program;

public class Loop_logical {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			 System.out.print("*"+"\t"); 
			/* System.out.print("*"); */
		}
		System.out.println();
	}
}
}
