package pt.upacademy.DefaultTypes;

public class DefaultType {
	int num;
	String name;
	boolean valid;
	SomeClass someClassObject;
	
	public DefaultType() {
		System.out.println("Init DefaultType Constructor");
		toString();
		someMethod();
		System.out.println("End DefaultType Constructor");
	}
	
	@Override
	public String toString() {
		return "DefaultType [num=" + num + ", name=" + name + ", valid=" + valid + ", someClassObject="
				+ someClassObject + "]";
	}

	public static void main(String[] args) {
		DefaultType dt = new DefaultType();
		System.out.println(dt);	
	}

	private void someMethod() {
		int var1;
//		
		var1 = 0;
		System.out.println(var1);
	}
}

class SomeClass {
	String name;

	@Override
	public String toString() {
		return "SomeClass [name=" + name + "]";
	}
}
