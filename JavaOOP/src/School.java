import model.Student;

public class School {

    public static void main(String args[]){
        getStudentInformation();
    }

    public static void getStudentInformation() {
        Student student = new Student("Jericah", 24, "Female", 2013102609);
        System.out.println("Student Information");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Id Number: " + student.getIdNumber());
    }


}
