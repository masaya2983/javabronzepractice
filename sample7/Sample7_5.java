class Super{
	int num;
	public void methodA() { num += 500;}
	public void methodB() {System.out.println("num値 :" +num);	}
}

class Sub extends Super{
	public void methodA() {num += 500;}
	public void methodB() {
		methodA(); //7行目が呼び出される
		print(); //スーパークラスのメソッド呼び出し
		super.methodA(); //スーパークラスのメゾッド呼び出し
		print(); //スーパークラスのメゾット呼び出し
	}
}
class Sample7_5{
	public static void main(String[] args) {
		Sub s = new Sub();
		s.methodB();
	}
}