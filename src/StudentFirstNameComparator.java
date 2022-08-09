import java.util.Comparator;

public class StudentFirstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.firstName.compareTo(student2.firstName);
    }
}
