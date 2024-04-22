package sample3;
class Sample3_12{
	public static void main(String []args) {
		int num = 2;
		switch(num) {
		//numの値が1の場合の処理
		case 1:
			System.out.println("numの値は1です");
			break; //breakによりswitchから抜ける
			//numの値が2の場合の処理
		case 2:
			System.out.println("numの値は2です。");
			//break文がないため、次のdefultの処理分も実行
			//numの値が1以上の場合の以下が実行される
		default:
			System.out.println("defaultです");
		}
	}
}