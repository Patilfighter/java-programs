package comparators;
import entity.*;
import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
	
	
	
	public NameComparator() {
		super();
	}

	@Override
	public int compare(Student o1, Student o2) {
		int diff = o1.getName().compareTo(o2.getName());
		return diff;
	}
	

}
