package sample4;
 class Sample4_4{
	 public static void main(String[] args) {
		 int count = 5;
		 
		 
		 //whileの場合
		 while  (count !=5 && count >0) {
			 System.out.println("wile  : count="+ count);
			 count--;
		 }
		 
		 //do-whileの場合
		 do {
			 System.out.println("do-while  :count = "+count);
			 count--;
		 } while(count != 5&& count > 0);
	 }
 }