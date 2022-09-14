package Logical_program;

final public class Immutable_class {
private int i;

public Immutable_class(int i) {
	this.i=i;
}
public Immutable_class modify(int i) {
	if(this.i==i) {
		return this;
	}
	else {
		return new Immutable_class(i);
	}
	
}
public static void main(String[] args) {
	Immutable_class obj1=new Immutable_class(10);
	Immutable_class obj2=obj1.modify(100);
	Immutable_class obj3=obj1.modify(10);
	System.out.println(obj1==obj2);
	System.out.println(obj1==obj3);
}
}
