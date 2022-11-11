/**
 * @author Giuseppe Rondelli
 * in this class we test all the methods of the class
 *  "ArithmeticOperators" to see if they work
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators aritOper = new ArithmeticOperators();
        System.out.println(aritOper.sum(104,67));
        System.out.println(aritOper.sub(100,71));
        System.out.println(aritOper.mul(5,14));
        System.out.println(aritOper.div(64,2));
    }
}