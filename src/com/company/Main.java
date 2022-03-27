package com.company;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        System.out.println(sumOfArray(array, 0));

//        int n = 4;
//        System.out.println(factorial(n));

//        int n = 10;
//        System.out.println(fibonacci(n));

//        int number = 12355;
//        System.out.println(sumOfDigits(number));

//        int n = 717;
//        System.out.println(countOfTheGivenDigit(n));

//        String string = "xxhixx";
//        System.out.println(countX(string, 0));

//        String string = "xxhixxas";
//        System.out.println(removeX(string, 0));

//        String string = "hello";
//        System.out.println(reverse(string));

//        String string = "xxhixxas";
//        System.out.println(move_X_ToTheEnd(string));

//        String string = "yyzzza";
//        System.out.println(stringClean(string, 0));

//        int number = 231;
//        System.out.println(isPrime(number));

//        String string = "1178029";
//        try {
//            System.out.println(findLargestDigit(string));
//        } catch (Exception e) {
//            System.out.println("findLargestDigit null pointer");
//        }
//
        //String string1 = "sDkS62sd333SFGx9";
//        String string1 = "";
//        try {
//
//            System.out.println(numberOfDigits(string1));
//        } catch (Exception e) {
//            System.out.println("numberOfDigits can't count digits");
//        }

//        String string = "LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO";
//        System.out.println(addAsterisk(string));

//        String string = "LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO";
//        String string1 = "abcdef";
//        System.out.println(addParentheses(string1));

//        String string = "(abc(def(g";
//        System.out.println(mirror(string));

//        String string = "abcdbe";
//        System.out.println(cutIdenticalFromCenter(string));

    }

    public static int sumOfArray(int[] arr, int index) {
        //check null pointer
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumOfArray(arr, index + 1);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    public static int countOfTheGivenDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 == 7 ? 1 + countOfTheGivenDigit(num / 10) : countOfTheGivenDigit(num / 10);
    }

    public static int countX(String num, int size) {
        if (size == num.length()) {
            return 0;
        }
        return num.charAt(size) == 'x' ? 1 + countX(num, size + 1) : countX(num, size + 1);
    }

    public static String removeX(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        return str.charAt(index) == 'x' ? removeX(str.substring(1), index + 1) : str.charAt(index) + removeX(str, index + 1);
    }


    public static String reverse(String str) {

        return reverseHelper(str, str.length() - 1);
    }

    static String reverseHelper(String s, int index) {
        if (index < 0) {
            return "";
        }
        return s.charAt(index) + reverseHelper(s, index - 1);
    }


    static String move_X_ToTheEnd(String str) {
        return move_X_helper(str, 0);
    }

    static String move_X_helper(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        return s.charAt(index) == 'x' ?
                move_X_helper(s, index + 1) + s.charAt(index) :
                s.charAt(index) + move_X_helper(s, index + 1);
    }


    static String stringClean(String s, int index) {
        if (index == s.length() - 1) {
            return s.charAt(index) + "";
        }
        return s.charAt(index) == s.charAt(index + 1) ?
                stringClean(s, index + 1) :
                s.charAt(index) + stringClean(s, index + 1);
    }


    static boolean isPrime(int number) {
        if (number == 1 || number == 2 || number == 3) {
            return true;
        }
        if (number < 1 || number % 2 == 0) {
            return false;
        }
        return isPrimeHelper(number, 3);
    }

    static boolean isPrimeHelper(int num, int index) {
        if (index >= Math.sqrt(num)) {
            return true;
        }
        return num % index != 0 && isPrimeHelper(num, index + 2);
    }

    static char findLargestDigit(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        return findLargestDigitHelper(str, str.charAt(0), 1);
    }

    static char findLargestDigitHelper(String s, char max, int index) {
        if (index == s.length()) {
            return max;
        }
        if (s.charAt(index) > max) {
            max = s.charAt(index);
        }
        return findLargestDigitHelper(s, max, index + 1);

    }

    static int numberOfDigits(String str) throws Exception {
        if (str == null) {
            throw new Exception();
        }
        return numberOfDigitsHelper(str, 0, 0);
    }

    static int numberOfDigitsHelper(String str, int count, int index) {
        if (index == str.length()) {
            return count;
        }
        return Character.isDigit(str.charAt(index)) ?
                numberOfDigitsHelper(str, count + 1, index + 1) :
                numberOfDigitsHelper(str, count, index + 1);
    }

    static String addAsterisk(String str) {
        //nul pointer exception
        if (str.length() == 1) {
            return "length must be more than 1";
        }
        return addAsteriskHelper(str, 0);
    }

    static String addAsteriskHelper(String s, int index) {
        if (index == s.length() - 1) {
            return String.valueOf(s.charAt(index));
        }
        return s.charAt(index) + "*" + addAsteriskHelper(s, index + 1);
    }

    static String addParentheses(String str) {
        if (str == null) {
            return "String is null";
        }
        return addParenthesesHelper(str);
    }

    static String addParenthesesHelper(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return "(" + s + ")";
        }

        int index = s.length() - 1;

        return "(" + s.charAt(0) +
                addParenthesesHelper(s.substring(1, index)) +
                s.substring(index) + ")";
    }

    static String mirror(String str) {
        //check str null
        return mirrorHelper(str, 0);
    }

    static String mirrorHelper(String s, int index) {
        if (index == s.length()) {
            return s;
        }
        return s.charAt(index) == '(' ?
                mirrorHelper(s, index + 1) + ")" :
                mirrorHelper(s, index + 1) + s.charAt(index);
    }

    static String cutIdenticalFromCenter(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.length() == 2) {
            return str.charAt(0) == str.charAt(1) ? cutIdenticalFromCenter(str) : str;
        }
        int index = str.length() - 1;
        return str.charAt(0) == str.charAt(index) ?
                cutIdenticalFromCenter(str.substring(1, index)) :
                str.charAt(0) + cutIdenticalFromCenter(str.substring(1, index)) + str.charAt(index);
    }
}

