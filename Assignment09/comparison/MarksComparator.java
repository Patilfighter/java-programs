 package comparison;
import java.util.*;
import entity.*;
public class MarksComparator implements Comparator<Student>{
	
	public MarksComparator() {
		
	}

	

	@Override
	public int compare(Student o1, Student o2) {
		
		double diff = o1.getMarks()- o2.getMarks();
		if(diff == 0)
			return 0;
		
		else if(diff >=1) 
			return 1;

		else return -1;
	}
	
	
	

}
