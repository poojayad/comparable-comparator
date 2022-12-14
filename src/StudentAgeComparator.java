import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        return Integer.compare(student1.age, student2.age);

        // this will also work but only if data type of age provide in class Integer not primitive int,
        // compare method is local to class Integer. Whereas compareTo is provided by the Comparator.
        /* return student1.age.compareTo(student2.age); */

        // either of the lines can be used.
        /*
        if(student1.age == student2.age)
            return 0;
        else if (student1.age>student2.age) {
            return 1;
        }else {
            return -1;
        }
        */
    }
}
