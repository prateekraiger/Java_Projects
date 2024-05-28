import java.util.*;

class Student {
    String name;
    int rn;
    String grade;

    public Student(String name, int rn, String grade) {
        this.name = name;
        this.rn = rn;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getrn() {
        return rn;
    }

    public String getGrade() {
        return grade;
    }
}

class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rn) {
        students.removeIf(student -> student.getrn() == rn);
    }

    public Student searchStudent(int rn) {
        for (Student s : students) {
            if (s.getrn() == rn) {
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getrn() + ", Grade: " + student.getGrade());
        }
    }
}

public class StuMangSys {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\tWELCOME TO STUDENT MANAGEMENT SYSTEM\t");
        System.out.println("----------------------------------------------------------");


        while (true) {
            System.out.println();
            System.out.println("1. Add student\n2. Remove student\n3. Search student\n4. Display all students\n5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();  

            switch (ch) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your roll number: ");
                    int rn = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter your grade: ");
                    String grade = sc.nextLine();
                    sms.addStudent(new Student(name, rn, grade));
                    break;

                case 2:
                    System.out.print("Enter your roll number: ");
                    rn = sc.nextInt();
                    sms.removeStudent(rn);
                    break;

                case 3:
                    System.out.print("Enter your roll number: ");
                    rn = sc.nextInt();
                    Student student = sms.searchStudent(rn);
                    if (student!= null) {
                        System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getrn() + ", Grade: " + student.getGrade());
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Thank You for Visiting");
                    System.exit(0);
            }
        }
    }
}