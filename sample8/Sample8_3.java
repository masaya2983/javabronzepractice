package sample8;
interface MYInterface{
	//int a; //初期化詩t例ないのでコンパイルエラー
	int b = 10;
	final int c =20;
	public int d =30;
	static int e = 40;
	public final int f = 50;
	
	public abstract void methodA();
	abstract void methodA();
	void methodC();
	//protected abstract void methodD(); //protectedは使用不可コンパイルエラー
}
class MyClass implements MYInterface{
	public void methodA() {}
	public void methodB() {}
	public void methodC() {}
}