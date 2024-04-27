package sample8;
abstract class Super{// 抽象クラス
	protected abstract void methodA();
	public void methodB () {}
}
class Sub extends Super{//具象クラス
	protected void methodA() {} //必須//抽象メソッドは必ず実装
	//以下でもOK。アクセス修飾子は同じか公開範囲を広いものを使用
	//public void methodA(){}
	public void methodB() {}  //任意//必要に応じて実装可能
}