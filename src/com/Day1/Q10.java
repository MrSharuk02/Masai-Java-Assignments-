package com.Day1;

public class Q10 {
	public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Expression 1: Logical AND (&&)
        boolean result1 = a && b;
        System.out.println("Expression 1 (a && b): " + result1);

        // Expression 2: Logical OR (||)
        boolean result2 = a || b;
        System.out.println("Expression 2 (a || b): " + result2);

        // Expression 3: Logical NOT (!)
        boolean result3 = !b;
        System.out.println("Expression 3 (!b): " + result3);

        // Expression 4: Combination of logical operators
        boolean result4 = (a && c) || !b;
        System.out.println("Expression 4 ((a && c) || !b): " + result4);

        // Expression 5: Another combination
        boolean result5 = (a || b) && !c;
        System.out.println("Expression 5 ((a || b) && !c): " + result5);
    }

}
