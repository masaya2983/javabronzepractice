package sample4;
 class Sample4_8{
	 public static void main(String[] args) {
		 //外部の制御文
		 for (int i = 1; i< 10; i++) {
		 //内側の制御文
		 if((i % 4) == 0) {
			 System.out.println(i + "4の倍数です");
		 }
		 }
		 
	 }
 }