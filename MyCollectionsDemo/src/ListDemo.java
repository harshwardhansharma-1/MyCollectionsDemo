import java.util.*;

public class ListDemo {
public static void main(String[] args) {
	List<Integer> myArrayList = new ArrayList<Integer>();
	//1. Maintains insertion order
	//2. Slow insertion and deletion because both operation require new array
	myArrayList.add(1);
	myArrayList.add(2);
	myArrayList.add(3);
	myArrayList.add(4);
	Iterator<Integer> myIterator = myArrayList.listIterator();
	System.out.println("My Arraylist:");
	while (myIterator.hasNext()) {
		Integer integer = (Integer) myIterator.next();
		System.out.println(integer);
	}	
	List<Integer> myVectorList = new Vector<Integer>();
	myVectorList.add(1);
	myVectorList.add(2);
	myVectorList.add(3);
	myVectorList.add(4);
	myVectorList.remove(1);
	myIterator = myVectorList.listIterator();
	System.out.println("My vector");
	while(myIterator.hasNext()) {
		Integer integer = (Integer) myIterator.next();
		System.out.println(integer);
	}
	
	List<SamplePersonObject> myObjectList = new LinkedList<SamplePersonObject>();
	myObjectList.add(new SamplePersonObject("Harsh", 78) );
	myObjectList.add(new SamplePersonObject("Harsh", 7) );
	myObjectList.add(new SamplePersonObject("Harsh", 478) );
	myObjectList.add(new SamplePersonObject("Harsh", 748) );
	myObjectList.sort(new SamplePersonObjectComparator());
	
	Iterator<SamplePersonObject> myOjectIterator = myObjectList.listIterator();
	while (myOjectIterator.hasNext()) {
		SamplePersonObject samplePersonObject = (SamplePersonObject) myOjectIterator.next();
		System.out.println(samplePersonObject.toString());
	}
}
	
}
