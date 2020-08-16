import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
	public static void main(String[] args) {
//		PriorityQueue
//		Sorted natural order
		Queue<SamplePersonObject> myPriQueueObjects = new PriorityQueue<SamplePersonObject>(
				new SamplePersonObjectComparator());
		myPriQueueObjects.add(new SamplePersonObject("Raju", 76));
		myPriQueueObjects.add(new SamplePersonObject("Rajsdsu", 176));
		myPriQueueObjects.add(new SamplePersonObject("sdsRaju", 736));
		myPriQueueObjects.add(new SamplePersonObject("Raju", 7699));

		Iterator<SamplePersonObject> myIterator = myPriQueueObjects.iterator();
		while (myIterator.hasNext()) {
			SamplePersonObject samplePersonObject = (SamplePersonObject) myIterator.next();
			System.out.println(samplePersonObject.toString());

		}
//		ArrayDequeue
//		Allows insertion and deletion from both sides
		Deque<SamplePersonObject> myArrayDequeue = new ArrayDeque<SamplePersonObject>();
		myArrayDequeue.add(new SamplePersonObject("Zero", 0));
		myArrayDequeue.add(new SamplePersonObject("One", 1));
		myArrayDequeue.add(new SamplePersonObject("Two", 2));
		myArrayDequeue.add(new SamplePersonObject("Three", 3));
		myArrayDequeue.addFirst(new SamplePersonObject("Three", 3));
		System.out.println("ArrayDequeue");
		System.out.println(myArrayDequeue.peek());
		
//		ArrayBlockingQueue
//		Faster iteration
//		Can define the fixed size in ArrayBlockingQueue
		Queue<SamplePersonObject> myArrayBlockingQueue = new ArrayBlockingQueue<SamplePersonObject>(2);
		
		myArrayBlockingQueue.add(new SamplePersonObject("Raju", 76));
		myArrayBlockingQueue.add(new SamplePersonObject("Kaju", 78));
		myArrayBlockingQueue.add(new SamplePersonObject("baju", 799));

//		LinkedBlockingQueue uses inked list and faster for insertion and deletion 
		
	}
}
