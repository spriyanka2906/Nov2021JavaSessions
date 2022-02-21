package HashMapConcept;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {
		
		//HashMap---Key-Value pair
		//<key,value> ---generics 
		// not order based collection
		
		HashMap<String, String> prodMap=new HashMap<String, String>();
		prodMap.put("name", "Macbook pro");
		prodMap.put("seller", "XYZ ent");
		prodMap.put("size", "Macbook pro 16 inches");
		prodMap.put("code", "mac32");
		prodMap.put("color", "grey");
		
		
		System.out.println(prodMap.get("name"));
		System.out.println(prodMap.get("size"));

		prodMap.forEach((k,v)->System.out.println(k+":"+v)); //Lambda Expression

		//Output: not ordered
//		seller:XYZ ent
//		code:mac32
//		size:Macbook pro 16 inches
//		color:grey
//		name:Macbook pro
//		
		HashMap<Integer, String> studMap=new HashMap<Integer, String>();
		studMap.put(1, "Anil");
		studMap.put(2, "Ravi");
		studMap.put(3, "Pooja");
		studMap.put(4, "Anil");
		
		System.out.println(studMap.get(4));
		System.out.println(studMap.get(8));//null
		
		System.out.println(studMap.size());
		
		studMap.forEach((k,v) -> System.out.println(k+":"+v));
		
	}

}
