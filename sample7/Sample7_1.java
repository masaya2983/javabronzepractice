package sample7;
class Employee{ //スーパークラスの定義
	private String id ="100";
	public String getId() {
		retun id;
	}
	
}

class Sales extends Employee{ //サブクラスの定義
	prtvate String clientName = "SE";
	public String getClientName	() {
		public String getClientName() {
			return clientName;
				
			}
		}
		class Sample7_1{
			public static void main(String[] args) {
				Sales s = new Sales();
				
				System.out.println("clientName :"+s.getClientName());
				
				System.out.println("id      :" +s.getId());
			}
		
	
	
}