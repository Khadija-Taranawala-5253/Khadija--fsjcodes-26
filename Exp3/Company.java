package exp3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Company {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Manager details:");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter department: ");
            String department = sc.nextLine();

            System.out.print("Enter employee ID: ");
            int employeeId = sc.nextInt();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter team name: ");
            String team_name = sc.nextLine();

            System.out.print("Enter team size: ");
            int team_size = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter projects: ");
            String projects = sc.nextLine();

            System.out.println("Manager details entered successfully!");

            Manager m1 = new Manager(
                name, age, gender, department,
                employeeId, salary, team_name,
                team_size, projects
            );

            m1.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}

