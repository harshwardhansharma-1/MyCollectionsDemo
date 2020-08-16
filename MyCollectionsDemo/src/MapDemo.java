import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

//	Uses hashing so no insertion order
		HashMap<Integer, SamplePersonObject> myHashMap = new HashMap<Integer, SamplePersonObject>();
		myHashMap.put(0, new SamplePersonObject("Zero", 0));
		myHashMap.put(1, new SamplePersonObject("First", 1));
		myHashMap.put(3, new SamplePersonObject("Third", 3));
		myHashMap.put(22, new SamplePersonObject("Second", 22));
//		1. Iteration using entryset 
		for(Map.Entry<Integer, SamplePersonObject> entryset : myHashMap.entrySet()){
			System.out.println(entryset.getKey());
			System.out.println(entryset.getValue());
		}
//		2. Iteration user iterator
		Iterator<Map.Entry<Integer, SamplePersonObject>> myHashMapIterator = myHashMap.entrySet().iterator();
		while(myHashMapIterator.hasNext()) {
			Map.Entry<Integer, SamplePersonObject> entry = myHashMapIterator.next();
			System.out.println("KEY: " + entry.getKey());
			System.out.println("Value:  " + entry.getValue());
		}	
		
//		3. Using forEach
		myHashMap.forEach((k,v)-> System.out.println("Key:  "+ k +"Value:   " + v));
		
		
	}

}
