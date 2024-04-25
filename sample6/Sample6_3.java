package sample6;
class Test{
	void myPrint() {System.out.println("myPrint()");}
	void myPrint(int a) {System.out.println("myPrint(int a)");}
	void myPrint(int a, int b) {System.out.println("myPrint(int a,int b)");}
	void myPrint(String s) {System.out.println("myPrint(String s)");}
}

	class Sample6_3{
		public static void main(String[] args) {
			//Testクラスのインスタンス化
			Test t =new Test();
			t.myPrint();  //2行目が呼ばれる
			t.myPrint(100);  //3行目が呼び出される
			t.myPrint(100,200);
			t.myPrint("yamamoto");
		}
	}