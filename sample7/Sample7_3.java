package sample7;
class SuperA {}          				//ス－パークラスA
final class SuperB{}					//ス－パークラスB
class SuperC { void print() {}}			//ス－パークラスC
class SuperD { final void print() {}}	//ス－パークラスD

class SubA extends SuperA{}				//サブクラスA
//class SubB extends SuperB{}			//サブクラスB
class SubC extends SuperC{ void print() {}}				//サブクラスC
//class SubD extends SuperD{void print() {}}			//サブクラスD