package sample6;
class Sample6_7{
	int instanceVal;
	Static int staticVal;
	
	int methodA() { return instanceVal;}
	int methodB() {return staticVal;}
	//static int methodC {return instanceVal}
	static int methodD() {return staticVal;}
	static int methodE() {
	Sample6_7 obj = new Sample6_7();
	return obj.instanceVal;
}
}