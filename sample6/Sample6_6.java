package sample6;

class Test{
	int instanceVal = 100;
	static int staticVal = 200;
	void methoodA() { System.out.println("methoodA():" +instanceVal);}
	void methoodB() { System.out.println("methoodB():" +instanceVal);}
}
class Sample6_6{
	public static void main(String[] args) {
		//System.out.println(Test.instanceVal);
		System.out.println(Test.instanceVal);
		//Test.methodA();
		Test.methodB();
		System.out.println("-----------------");
		Test t = new Test();
		System.out.println(t.instanceVal);
		System.out.println(t.staticVal);
		t.methoodA();
		t.methoodB();
		
	}
}