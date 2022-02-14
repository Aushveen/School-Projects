import java.math.BigDecimal;

public class LabFour {

    public static void main(String[] args) {
        LabFour.one();
        LabFour.two();
        LabFour.three();
        LabFour.four();
        LabFour.five();
        LabFour.six();
        LabFour.seven();
        LabFour.eight();
        LabFour.nine();
        LabFour.ten();
        LabFour.eleven();
        LabFour.twelve();
        LabFour.thirteen();
        LabFour.fourteen();
        LabFour.fifteen();
        LabFour.sixteen();
        LabFour.seventeen();
        LabFour.eighteen();
        LabFour.nineteen();
        LabFour.twenty();
        LabFour.twentyOne();
        LabFour.twentyTwo();
        LabFour.twentyThree();
        LabFour.twentyFour();
        LabFour.twentyFive();
        LabFour.twentySix();
        LabFour.twentySeven();
        LabFour.twentyEight();
        LabFour.twentyNine();
        LabFour.thirty();
        LabFour.thirtyOne();
        LabFour.thirtyTwo();
        LabFour.thirtyThree();
        LabFour.thirtyFour();
        LabFour.thirtyFive();
        LabFour.thirtySix();
        LabFour.thirtySeven();
        LabFour.thirtyEight();
        LabFour.thirtyNine();
        LabFour.forty();
        LabFour.fortyOne();
        LabFour.fortyTwo();
        LabFour.fortyThree();
        LabFour.fortyFour();
        LabFour.fortyFive();
        LabFour.fortySix();
        LabFour.fortySeven();
        LabFour.fortyEight();
        LabFour.fortyNine();
        LabFour.fifty();
        System.out.println("For 51, I do not know the answer");
        LabFour.fiftyTwo();
    }


    public static void one() {
        System.out.println("1. What does this line of code print: System.out.println(\"+---+\\n| |\\n+---+\");");
        // expected output is printing a square shape
        System.out.println("+---+\n| |\n+---+");
    }

    public static void two() {
        System.out.println("2. Write code to calculate the following expression with BigDecimal objects: 4.35 * 100");
        // After using BigDecimal, 4.35 * 100 should be 435.00
        BigDecimal a = new BigDecimal(4.35), b = new BigDecimal(100);
        BigDecimal c = a.multiply(b);
        System.out.println(c);
    }

    public static void three() {
        System.out.println("3. 3 - 4 + 5");
        // Should be 4
        System.out.println(3 - 4 + 5);
    }

    public static void four() {
        System.out.println("4. 3 – 4 * 5");
        // Should be -17
        System.out.println(3 - 4 * 5);
    }

    public static void five() {
        System.out.println("5. 2 / 3 * 4");
        // Should be 0 since it is an int type, and 2/3 is 0
        System.out.println(2 / 3 * 4);
    }

    public static void six() {
        System.out.println("6. 2 * 3 / 4");
        // Should be 1
        System.out.println(2 * 3 / 4);
    }

    public static void seven() {
        System.out.println("7. 3 % 5");
        // should be 3 since the remainder is 3
        System.out.println(3 % 5);
    }

    public static void eight() {
        System.out.println("8. -3 % 5");
        // Should be -3, first number determines if positive or negative
        System.out.println(-3 % 5);

    }

    public static void nine() {
        System.out.println("9. 5 % 3");
        // Should be 2
        System.out.println(5 % 3);

    }

    public static void ten() {
        System.out.println("10. 5 % -3");
        // Should be 2
        System.out.println(5 % (-3));

    }

    public static void eleven() {
        System.out.println("11. 3 % -5");
        // Should be 3
        System.out.println(3 % -5);

    }

    public static void twelve() {
        System.out.println("12. 49 / 17 % 5");
        // Should be 2
        System.out.println(49 / 17 % 5);
    }

    public static void thirteen() {
        System.out.println("13. 49 / (17 % 5)");
        // Should be 24
        System.out.println(49 / (17 % 5));

    }

    public static void fourteen() {
        System.out.println("14. ('a' + 'b') % 2");
        // Should be 1
        System.out.println(('a' + 'b') % 2);

    }

    public static void fifteen() {
        System.out.println("15. false || true");
        // Should be true
        System.out.println(false || true);
    }

    public static void sixteen() {
        System.out.println("16. ! true && false");
        // Should be false
        System.out.println(!true && false);

    }

    public static void seventeen() {
        System.out.println("17. ! (true && false)");
        // Should be true
        System.out.println(!(true && false));

    }

    public static void eighteen() {
        int n = 3;
        System.out.println("18. n > ++n");
        // Should be false
        System.out.println(n > ++n);
    }

    public static void nineteen() {
        int n = 3;
        System.out.println("19. ++n – n");
        // Should be 0 since the new value of n is not stored anywhere
        System.out.println(++n - n);

    }

    public static void twenty() {
        int n = 3;
        System.out.println("20. n++ == n++");
        // should be false because having the ++ after n makes it store the new value in n
        System.out.println(n++ == n++);
    }

    public static void twentyOne() {
        int n = 3;
        System.out.println("21. ++n == n++");
        // Should be true, since 4 = 4
        System.out.println(++n == n++);

    }

    public static void twentyTwo() {
        int n = 3;
        System.out.println("22. n++");
        // Should be 3 since ++ is after n
        System.out.println(n++);

    }

    public static void twentyThree() {
        int n = 3;
        System.out.println("23. ++n");
        // Should be 4
        System.out.println(++n);

    }

    public static void twentyFour() {
        int n = 3;
        System.out.println("24. ( n = n++ - ++n ) < 0");
        // Should be true
        System.out.println((n = n++ - ++n) < 0);

    }

    public static void twentyFive() {
        int n = 3;
        System.out.println("25. What is n now?");
        n = n++ - ++n;
        System.out.println(n);

    }

    public static void twentySix() {
        System.out.println("26. \"1\" + (2 + 3)");
        // should be 15
        System.out.println("1" + (2 + 3));

    }

    public static void twentySeven() {
        System.out.println("27. \"1\" + 2 + 3");
        // should be 123, since there is no parenthesis
        System.out.println("1" + 2 + 3);

    }

    public static void twentyEight() {
        System.out.println("28. 1 + \"2\" + 3");
        // Should be 123
        System.out.println(1 + "2" + 3);

    }

    public static void twentyNine() {
        System.out.println("29. 1 + 2 + \"3\"");
        // Should be 33
        System.out.println(1 + 2 + "3");

    }

    public static void thirty() {
        System.out.println("30. \"tomato\".charAt(2) - \"potato\".charAt(5)");
        // Should be 'm' - 'o' which is -2
        System.out.println("tomato".charAt(2) - "potato".charAt(5));

    }

    public static void thirtyOne() {
        System.out.println("31. \"eggplant\".length()");
        // Should be 8
        System.out.println("eggplant".length());
    }

    public static void thirtyTwo() {
        System.out.println("32. \"eggplant\".substring(\"kale\".length())");
        // Should be lant
        System.out.println("eggplant".substring("kale".length()));
    }

    public static void thirtyThree() {
        System.out.println("33. \"kale\".charAt(3)");
        // Should be e
        System.out.println("kale".charAt(3));
    }

    public static void thirtyFour() {
        System.out.println("\"eggplant\".substring(\"eggplant\".length()-1)");
        // Should be t
        System.out.println("eggplant".substring("eggplant".length() - 1));
    }

    public static void thirtyFive() {
        System.out.println("35. \"beans\".substring(1, 4)");
        // Should be ean
        System.out.println("beans".substring(1, 4));
    }

    public static void thirtySix() {
        System.out.println("36. Proving that !a == (!a == true)");
        boolean a; // declaration
        a = true; // initialization
        System.out.println("When a is " + a + " !a is " + (!a) + " and (!a == true) is " + (!a == true));
        a = false; // assignment
        System.out.println("When a is " + a + " !a is " + (!a) + " and (!a == true) is " + (!a == true));
    }

    public static void thirtySeven() {
        System.out.println("37. !a != false ");
        // a should be a false value for this to work
        boolean a;
        a = true;
        System.out.println("When a is " + a + " !a is " + (!a) + " and (!a != false) is " + (!a != false));
        a = false;
        System.out.println("When a is " + a + " !a is " + (!a) + " and (!a != false) is " + (!a != false));
    }

    public static void thirtyEight() {
        System.out.println("38. true && !a");
        // a should be a false value
        boolean a;
        a = true;
        System.out.println("When a is " + a + " !a is " + (!a) + " and (true && !a) is " + (true && !a));
        a = false;
        System.out.println("When a is " + a + " !a is " + (!a) + " and (true && !a) is " + (true && !a));
    }

    public static void thirtyNine() {
        System.out.println("39. if (n == 3) a = true ; else a = false;");
        int n = 3;
        boolean a;
        a = true;
        System.out.println("When a is " + a + " n is " + n + " and (n == 3) is " + (n == 3));
        n = 4;
        a = false;
        System.out.println("When a is " + a + " n is not 3 and (n == 3) is " + (n == 3));
    }

    public static void forty() {
        System.out.println("40. if (n != 3) a = false; else a = true ;");
        int n = 3;
        boolean a = true;
        System.out.println("When a is " + a + " n is " + n + " and (n != 3) is " + (n != 3));
        n = 4;
        a = false;
        System.out.println("When a is " + a + " n is not 3 and (n != 3) is " + (n != 3));
    }

    public static void fortyOne() {
        System.out.println("41. a = false; if (n > 3) if (n < 5) a = true;");
        int n = 6;
        boolean a = false;
        System.out.println("When a is " + a + " n is greater than 3 and (n > 3) is " + (n > 3));
        n = 4;
        a = true;
        System.out.println("When a is " + a + " n is less than 5 and (n < 5) is " + (n < 5));
    }

    public static void fortyTwo() {
        System.out.println("42. if (n < 0) a = true; else a = (n > 1);");
        int n = -2;
        boolean a = true;
        System.out.println("When a is " + a + " n is less than 0 and (n < 0) is " + (n < 0));
        n = 3;
        a = n > 1;
        System.out.println("When a is " + a + " n is greater than 1 and (n > 1) is " + (n > 1));
    }

    public static void fortyThree() {
        System.out.println("43. n < 5 || n > 3");
        int n = 5;
        boolean a = n < 5 || n > 3;
        System.out.println("When a is " + a + " n is less than 5 or greater than 3 (n < 0) is " + (n < 5 || n > 3));
        // a can never be false
    }

    public static void fortyFour() {
        System.out.println("44. n < 3 && n > 5");
        int n = 6;
        boolean a = n < 3 && n > 5;
        // a can never be true
        System.out.println("When a is " + a + " n is greater than 5 and less than 3 (n < 0) is " + (n < 3 && n > 5));

    }

    public static void fortyFive() {
        System.out.println("45. Can every while loop be expressed as a for loop and if so how?");
        // Yes it can, and here is how
        int index = 2;
        int iWhile = 0;
        for (int i = 0; i <= index; i++)
            System.out.println(i);
        while (iWhile <= index) {
            System.out.println(iWhile);
            iWhile++;
        }
    }

    public static void fortySix() {
        System.out.println("46. Can every while loop be expressed as a do-while loop and if so how?");
        // Yes it can, and here is how
        int index = 2;
        int indexTwo = 2;
        while (index != 0) {
            System.out.println(index);
            index--;
        }
        do {
            System.out.println(indexTwo);
            indexTwo--;
        } while (indexTwo != 0);
    }

    public static void fortySeven() {
        System.out.println("47. int m = 18, n = 10; if (m > 10) { if (m > 5) n = 1; } else n = 2;");
        int n = 10;
        int m = 18;
        if (m > 10) {
            if (m > 5)
                n = 1;
        }
        else
            n = 2;

        System.out.println("n is " + n);
    }

    public static void fortyEight() {
        System.out.println("48. int m = 18, n = 10; if (m > 10) if (m > 5) n = 1; else n = 2;");
        int n = 10;
        int m = 18;
        if (m > 10)
            if (m > 5)
                n = 1;
            else
                n = 2;
        System.out.println("n is " + n);
    }

    public static void fortyNine() {
        System.out.println("49. int m = 18, n = 10; if (m < 10) { if (m > 5) n = 1; } else n = 2;");
        int n = 10;
        int m = 18;
        if (m < 10) {
            if (m > 5)
                n = 1;
        } else
            n = 2;
        System.out.println("n is "+n);
    }
    public static void fifty(){
        System.out.println("50. int m = 18, n = 10; if (m < 10) if (m > 5) n = 1; else n = 2;");
        int n = 10;
        int m = 18;
        if (m < 10)
            if (m > 5)
                n = 1;
            else
                n = 2;
        System.out.println("n is " + n);
    }
    public static void fiftyTwo(){
        double grade = 2;
        if(grade >= 1.5 && grade < 2)
            System.out.println("probation");
        else if (grade < 1.5)
            System.out.println("failing");
        else
            System.out.println("Passing");
    }


}
