class A {
	B b = new B();
}
class B {
	String c;
	String a;
}
class C {
	B b = new B();
}

class FirstAssignment {
	public static void main(String [] args){
		A a = new A();
		C c = new C();
		a.b.c = c.b.a;
	}
}