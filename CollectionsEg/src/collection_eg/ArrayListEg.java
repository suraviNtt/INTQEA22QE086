package collection_eg;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(123);
		arrayList.add("abc");
		arrayList.add(0.356);
		
		System.out.println("Before : "+arrayList);
		
		arrayList.add(0, 568);
		
		System.out.println("After : "+arrayList);
		
	}
}
