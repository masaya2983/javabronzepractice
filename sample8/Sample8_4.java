package sample8;
interface XIF {
	void methodA(); 
}
interface YIF {
	void methodB();
}
class MyClass implements SubIF{
	public void methodA() {System.out.println("methodA()");}
	public void methodB() {System.out.println("methodB()");}
	public void methodC() {System.out.println("methodC()");}
}

class Sample8_4{
	public static void main(String[] args) {
		MyClasss c = new MyClass();
		c.methodA(); c.methodB(); c.methodC();
	}
}