import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        return Integer.compare(student1.age, student2.age);

            //          either of the lines can be used.
//        if(student1.age == student2.age)
//            return 0;
//        else if (student1.age>student2.age) {
//            return 1;
//        }else {
//            return -1;
//        }
    }
}
