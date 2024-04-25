package sample7;
class Super{
	public void print(String s) {
		System.out.println("Super print : " +s);
	}
	public void method() {}	
}
class sub extends Super{//サブクラス
	public void print(String s) {
		s = "渡された文字列は"+s+"です";
		System.out.println("Sub print :" +s);
           
	}
	//void method(){}//コンパイルエラー
}

class Sample7_2{
	public static void main (String[] args) {
		Super s1 =new Super();
		s1.print("Java");
		Sub s2 = new Sub();
		s2.print("Java");
	}
}