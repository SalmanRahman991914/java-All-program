package Logical_program;

public class Swap_without_thirdvariable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
