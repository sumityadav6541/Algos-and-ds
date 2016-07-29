package ocp.generics;

public class Test<T> {
	T obj;
	public Test(T obj){
		this.obj = obj;
	}
	
	public T getObject(){
		return obj;
	}
	
	public static void main(String[] args) {
		Test<Integer> a1 = new Test<Integer>(2);
		Test<String> a2 = new Test<String>("abcd");
		System.out.println(a1.getObject());
		System.out.println(a2.getObject());
	}
}
