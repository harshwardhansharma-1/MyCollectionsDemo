import java.util.*;

//Set maintains natural ordering 
public class SetDemo {
	public static void main(String[] args) {
		Set<String> myHashSet = new HashSet<String>();
		// Unordered
		// Unsorted
		myHashSet.add("zero");
		myHashSet.add("one");
		myHashSet.add("two");
		myHashSet.add("three");
		myHashSet.add("Four");
		myHashSet.add("five");
		myHashSet.add("six");
		myHashSet.add("seven");

		System.out.println("My hashset:");
		Iterator<String> myIterator = myHashSet.iterator();
		while (myIterator.hasNext()) {
			String string = (String) myIterator.next();
			System.out.println(string);

		}

		Set<String> myLinkedHashSet = new LinkedHashSet<String>();
		// Ordered
		// Iterates in order of insertion
		myLinkedHashSet.add("zero");
		myLinkedHashSet.add("one");
		myLinkedHashSet.add("two");
		myLinkedHashSet.add("three");
		myLinkedHashSet.add("Four");
		myLinkedHashSet.add("five");
		myLinkedHashSet.add("six");
		myLinkedHashSet.add("seven");

		System.out.println("My Linked hashset:");
		myIterator = myLinkedHashSet.iterator();
		while (myIterator.hasNext()) {
			String string = (String) myIterator.next();
			System.out.println(string);

		}
		
		Set<SamplePersonObject> myObjectSet = new TreeSet<SamplePersonObject>(new SamplePersonObjectComparator());
		myObjectSet.add(new SamplePersonObject("Raju", 78));
		myObjectSet.add(new SamplePersonObject("Raju", 7));
		myObjectSet.add(new SamplePersonObject("Raju", 798));
		myObjectSet.add(new SamplePersonObject("Raju", 781));
		
		
		Iterator<SamplePersonObject> objectIterator = myObjectSet.iterator();
		
		while (objectIterator.hasNext()) {
			SamplePersonObject samplePersonObject = (SamplePersonObject) objectIterator.next();
			System.out.println(samplePersonObject);
			
		}
		
	}
}
