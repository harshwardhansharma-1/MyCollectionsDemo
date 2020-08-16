
public class SamplePersonObject
//implements Comparable<SamplePersonObject> 
{

	private String name;
	private Integer age;
	
	public SamplePersonObject(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "SamplePersonObject [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(SamplePersonObject o) {
//		// TODO Auto-generated method stub
//		return this.age.compareTo(o.age);
//	}
	
	
}
