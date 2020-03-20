package overload;

class A{
	static {
		int a=0;
		System.out.println("========= static block ======="+a);
	}
	public int m1(int i) {
		System.out.println("=========Integer Version ======");
		return 0;
		
	}
	public float m1(float i) {
		System.out.println("=============Float Version ========");
		return 0;
		
	}
}
public class Test1 {
	public static void main(String args[]) {
		A a = new A();
		a.m1(10);
		a.m1('A');
		a.m1(10.5f);
	}
}
