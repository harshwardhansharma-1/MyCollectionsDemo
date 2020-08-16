import java.util.Comparator;

public class SamplePersonObjectComparator implements Comparator<SamplePersonObject>{

	@Override
	public int compare(SamplePersonObject o1, SamplePersonObject o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge()) 
			return 1;
		else
			return -1;
	}

	
}
