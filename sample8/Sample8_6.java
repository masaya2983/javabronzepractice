package sample8;
abstract class Foo{
	int x; int y;
	public static void print();
	public void method(int x, int y) {this.x = x; this.y };
}
	class MyClass extends Foo{
		public void println() {
			System.out.println("x :"+ x + "y :" +y);
		}
	}
	class Sample8_6 {
		public static void main(String[] args) {
			//スーパークラスの変数にサブクラスのオブジェクトを代入
			Foo f = new Myclass();
			f.method(10,20);	//スーパークラスのメソッド呼び出し
			f.print();
		}
	}