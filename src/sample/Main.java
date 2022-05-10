package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String args[]) {

		Main m = new Main();

		List<Student> list1 = m.getStudentList();
		System.out.println(m.sortWithLambdaExp(list1)); // sort using stream and firstName

		List<Student> list2 = m.getStudentList();
		System.out.println(m.sortWithAnymClass(list2));

	}

	private List<Student> getStudentList() {
		return Arrays.asList(new Student(1, "Bindu", "IT"), new Student(2, "Sam", "CS"), new Student(3, "David", "IT"),
				new Student(4, "Anjali", "CS"));

	}

	private List<Student> sortWithLambdaExp(List<Student> list) {
		// sort using stream and firstName
		list.sort(Comparator.comparing((Student s) -> s.getStream()).thenComparing((Student s) -> s.getFirstName()));
		return list;

	}

	private List<Student> sortWithAnymClass(List<Student> list) {
		Collections.sort(list, new Comparator<Student>() {
			// compare using stream and then rollNumber;
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getStream().equals(s2.getStream())) {
					if (s1.getRollNum() == s2.getRollNum())
						return 0;
					if (s1.getRollNum() > s2.getRollNum())
						return 1;
					return -1;
				}
				return s1.getStream().compareTo(s2.getStream());
			}
		});

		return list;
	}
}
