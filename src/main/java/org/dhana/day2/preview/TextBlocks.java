package org.dhana.day2.preview;

public class TextBlocks {
    public static void main(String[] args) {
        String firstName = "Lord";
        String lastName = "Meher";
        float salary = 123.54322f;
        boolean married = true;

        System.out.println(String.format("""
                First Name is %s
                Last Name is %s
                Salary is %.5f
                Married is %b
                """, firstName, lastName, salary, married));
    }
}
