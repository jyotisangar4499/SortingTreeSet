package sortedtree;

import java.util.TreeSet;

public class StudentSortingTreeSet {
public static void main(String[] args) {
		
		StudentRollnoComparator stdSortByRoll = new StudentRollnoComparator();
		StudentNameComparator   stdSortByName = new StudentNameComparator();
		StudentCityComparator   stdSortByCity = new StudentCityComparator();
		TreeSet<Student> treeSet1 = new TreeSet<Student>(stdSortByRoll);
		TreeSet<Student> treeSet2 = new TreeSet<Student>(stdSortByName);
		TreeSet<Student> treeSet3 = new TreeSet<Student>(stdSortByCity);
		
		Student s1 = new Student(10,"Parth","Kolhapur");
		Student s2 = new Student(20,"Ram","Pune");
		Student s3 = new Student(30,"Niraj","Mumbai");
		Student s4 = new Student(40,"Ganesh","Satara");
		
		treeSet1.add(s1);
		treeSet1.add(s2);
		treeSet1.add(s3);
		treeSet1.add(s4);
	
		
		System.out.println("Sorted by Rollno : " +treeSet1);
		
		treeSet2.add(s1);
		treeSet2.add(s2);
		treeSet2.add(s3);
		treeSet2.add(s4);
		
		System.out.println("Sorted by Name : " +treeSet2);
		
		treeSet3.add(s1);
		treeSet3.add(s2);
		treeSet3.add(s3);
		treeSet3.add(s4);
		
		System.out.println("Sorted by City : " +treeSet3);
		
		
		
				
	}

}