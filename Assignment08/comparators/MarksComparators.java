package comparators;
import entity.*;
import java.util.*;
public class MarksComparators implements Comparator<Student>{
       
	
	 public MarksComparators(){
		 
	 }
	@Override
	public int compare(Student o1, Student o2) {
	     double diff = o1.getMarks()-o2.getMarks();
	     if(diff >= 1) {
	    	 return 1;
	     }
	     else if(diff == 0) {
	    	 return 0;
	     }
	     else {
	    	 return -1;
	     }
		
	}

	
}
