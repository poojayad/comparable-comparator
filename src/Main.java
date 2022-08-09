import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>() {
            {
                add(new Student("Pooja", "Yadav", 20, 1001));
                add(new Student("Riya", "Garg", 21, 1002));
                add(new Student("Harsh", "Agrawal", 22, 1003));
                add(new Student("Shreya", "Sharma", 23, 1004));
            }
        };

        System.out.println("From Comparator-");
        System.out.println("Comparing By first Name-");
        Collections.sort(students, new StudentFirstNameComparator());
        for(Student st: students){
            System.out.println(st.firstName+" "+st.lastName+" "+st.age);
        }
        System.out.println();
        System.out.println("Comparing By Age-");
        Collections.sort(students, new StudentAgeComparator());
        for(Student st: students){
            System.out.println(st.firstName+" "+st.lastName+" "+st.age);
        }


        ArrayList<StudentComparable> studentComparables = new ArrayList<StudentComparable>() {
            {
                add(new StudentComparable("Pooja", "Yadav", 20, 1001));
                add(new StudentComparable("Riya", "Garg", 21, 1002));
                add(new StudentComparable("Harsh", "Agrawal", 22, 1003));
                add(new StudentComparable("Shreya", "Sharma", 23, 1004));
            }
        };
        System.out.println();
        System.out.println("From Comparable-");
        System.out.println("Comparing By age-");
        Collections.sort(studentComparables);
        for(StudentComparable st: studentComparables){
            System.out.println(st.firstName+" "+st.lastName+" "+st.age);
        }

    }

}

