/*
--------------------------------------------------------
Aim       : To store and display student information
            of a few students using a class and objects.
Name      : Khadija Taranawala
UIN       : 251P025
Roll No.  : 59
--------------------------------------------------------
*/
public class StudentTest {

    public static void main(String[] args) {

        // Creating first student object
        Student s1 = new Student();
        s1.name = "Khadija";
        s1.uin = "251P025";
        s1.cgpa = 4.5;
        s1.display();

        // Creating second student object
        Student s2 = new Student();
        s2.name = "Shifa";
        s2.uin = "251P021";
        s2.cgpa = 3.5;
        s2.display();

        // Creating third student object
        Student s3 = new Student();
        s3.name = "Faiza";
        s3.uin = "251P028";
        s3.cgpa = 3.6;
        s3.display();
    }
}

// Student class to store student details
class Student {

    // Data members
    String name;
    String uin;
    double cgpa;
    
    void display() {

        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("UIN: " + uin);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------------");
    }
}
