public class StudentComparable implements Comparable<StudentComparable>{
    String firstName;
    String lastName;
    int age;
    long studentId;

    StudentComparable(){}

    StudentComparable(String firstName, String lastName, int age, long studentId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public int compareTo(StudentComparable studentComparable) {
        if(age==studentComparable.age)
            return 0;
        else if (age>studentComparable.age) {
            return 1;
        }else {
            return -1;
        }
    }

}
