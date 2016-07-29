package ocp.generics;

/**
 * example of multiple types in Generic classes
 */
public class MultiDataNode<Type1, Type2, Type3> {
	Type1 data1;
	Type2 data2;
	Type3 data3;
	
	public MultiDataNode(Type1 t1, Type2 t2, Type3 t3) {
		this.data1 = t1;
		this.data2 = t2;
		this.data3 = t3;
	}
	
	public void printData(){
		System.out.println(data1+" "+data2+" "+data3);
	}
	
	public static void main(String[] args) {
		MultiDataNode<String, String, Float> node = new MultiDataNode<String, String, Float>("John", "Doe", 23.0f);
		node.printData();
	}
}
