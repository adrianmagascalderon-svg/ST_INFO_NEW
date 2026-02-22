import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Repository repo = new Repository();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ENTER 10 STUDENTS ===");

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("First Name: ");
            String fname = sc.nextLine();

            System.out.print("Last Name: ");
            String lname = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Year Level: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Section: ");
            String section = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Contact Number: ");
            int contact = sc.nextInt();
            sc.nextLine();

            Student s = new Student(
                    id,
                    fname,
                    lname,
                    age,
                    gender,
                    course,
                    year,
                    section,
                    email,
                    contact
            );

            repo.saveStudent(s);
        }

        List<Student> students = repo.findAllStudent();

        System.out.println("\n=== MASTER LIST OF STUDENTS ===");

        for (Student s : students) {
            System.out.println(
                    s.getStudID() + " - " +
                    s.getFirstName() + " " +
                    s.getLastName() +
                    " | " + s.getCourse()
            );
        }

        repo.close();
        sc.close();
    }
}       