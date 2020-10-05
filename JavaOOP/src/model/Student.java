package model;

public class Student {
    static String name;
    static int age;
    static String gender;
    static int idNumber;

    public Student(String name, int age, String gender, int idNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Student.gender = gender;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Student.idNumber = idNumber;
    }

}
