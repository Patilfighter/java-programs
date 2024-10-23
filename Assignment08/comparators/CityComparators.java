package comparators;

import entity.*;
import java.util.Comparator;
public class CityComparators implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		 int diff = s1.getName().compareTo(s2.getName());
		return diff;
	}

}
