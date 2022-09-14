package com.logic;

import java.util.ArrayList;


public class Collection_reverce {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

Integer[]arr=list.toArray(new Integer[0]);
for(int a=arr.length-1;a>=0;a--) {
	System.out.println(arr[a]);
}
}
}
