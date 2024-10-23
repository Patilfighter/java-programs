package comparison;
import java.util.*;
import entity.*;
public class NameCompare implements Comparator<Student>{
	
	public NameCompare() {
		
	}

	

	@Override
	public int compare(Student o1, Student o2) {
		
		int diff = o1.getName().compareTo(o2.getName());
		return diff;
	}
	
	
	

}
