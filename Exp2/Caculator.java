/* Name: Khadija Taranawala
   UIN: 251P025
*/
// Calculator class to demonstrate constructor overloading
// and method overloading in Java
public class Calculator {

    // Instance variables
    int a;
    int b;

    // Default constructor
    // Initializes values of a and b to 0
    Calculator() {
        a = 0;
        b = 0;
    }

    // Parameterized constructor
    // Initializes a and b with user-provided values
    Calculator(int i, int j) {
        a = i;
        b = j;
    }

    // Overloaded add() method for integer values
    void add(int p, int q) {
        int sum = p + q;
        System.out.println("Sum Integer: " + sum);
    }

    // Overloaded add() method for double values
    void add(double p, double q) {
        double sum = p + q;
        System.out.println("Sum double: " + sum);
    }
}
