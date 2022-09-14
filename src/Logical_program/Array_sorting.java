
package Logical_program;

import java.util.Arrays;

public class Array_sorting {
public static void main(String[] args) {
	int[]a=new int[] {12,23,9,4,3,7,10};
	 Arrays.sort(a);
	
	for(int i=0;i<a.length;i++) {
		System.out.println("sorting the element:"+a[i]);
	}
}
}
