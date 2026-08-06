/* Name: Khadija Taranawala
   UIN: 251P025
*/
public class CalculatorTest {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println("A:" + c1.a + ", B:" + c1.b);

        Calculator c2 = new Calculator(3, 4);
        System.out.println("A:" + c2.a + ", B:" + c2.b);

        // Call the add() method with integer arguments
        c1.add(2, 5);

        // Call the overloaded add() method with double arguments
        c1.add(2.5, 4.5);
    }
}
