import java.util.Scanner;

public class Bonus_1350 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu building.

        while (true) {
            System.out.println("Welcome to this menu driven program.");
            System.out.println("Enter the corresponding number to select an option ");
            System.out.println("1. Print menu");
            System.out.println("2. Sum n numbers");
            System.out.println("3. Multiply n numbers");
            System.out.println("4. Substring");
            System.out.println("5. Convert Fahrenheit to Celsius");
            System.out.println("6. Convert Celsius to Fahrenheit");
            System.out.println("7. Multiplication Table");
            System.out.println("8. Random number in given range");
            System.out.println("9. Factorial");
            System.out.println("10. Sort 3 numbers");
            System.out.println("11. Lexicographically sort 3 strings (all lowercase)");
            System.out.println("12. Exit");
            System.out.print("Option: ");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    printMenu();
                case 2:
                    sumNumbers();
                case 3:
                    multiplyNumbers();
                case 4:
                    subString();
                case 5:
                    fahrenheitToCelsius();
                case 6:
                    celsiusTofahrenheit();
                case 7:
                    multiplicationTable();
                case 8:
                    randomNum();
                case 9:
                    factorial();
                case 10:
                    sortThreeNumbers();
                case 11:
                    lexicorgraphically();
                case 12:
                    System.out.println("Exiting...");
                    break;
            }
        }
    }

    // Method for printing the menu.
    public static void printMenu() {
        System.out.println("");
    }

    // Method for the sum of n numbers.
    public static void sumNumbers() {
        System.out.print("n: ");
        int n = in.nextInt();
        int sum = 0;
        int numbers = 0;
        while (true) {
            System.out.print("num: ");
            int num = in.nextInt();
            numbers++;
            sum += num;
            if (numbers == n) {
                break;
            }
            ;
        }
        System.out.println("The Sum is: " + sum);
    }

    // Method for the product of n numbers.
    public static void multiplyNumbers() {
        System.out.print("n: ");
        int n = in.nextInt();
        int product = 1;
        int numbers = 0;
        while (true) {
            System.out.print("num: ");
            int num = in.nextInt();
            product *= num;
            numbers++;
            ;
            if (numbers == n) {
                break;
            }
            ;
        }
        System.out.println("The product is: " + product);
    }

    // Method for Substring.
    public static void subString() {
        // Getting String.
        System.out.print("Input: ");
        String input = in.next();

        // Getting index.
        int indexOne = in.nextInt();
        int indexTwo = in.nextInt();

        String result = input.substring(indexOne, indexTwo);
        System.out.println("Substring: " + result);
    }

    // Method for Converting Fahrenheit to Celsius.
    public static void fahrenheitToCelsius() {
        // prompt for fahrenheit.
        System.out.print("Input: ");
        double fahrenheit = in.nextInt();

        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temp in Celsius: " + celsius);
    }

    // Method for Converting Celsius to Fahrenheit.
    public static void celsiusTofahrenheit() {
        // prompt for celsius.
        System.out.print("Input: ");
        double celsius = in.nextInt();

        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("The Temp in Fahrenheit: " + fahrenheit);
    }

    // Method for Multiplication Table.
    public static void multiplicationTable() {
        // Prompt for input.
        System.out.println("Enter n number greater than 3 and less than 15.");
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.println(); // adding space.

        // main loop / if
        if (n > 3 && n < 15) {
            System.out.print("Multiplication Table for " + n + ".");
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    System.out.println();
                    System.out.printf("%-4d", i * j);
                    ;
                }
            }
        } else if (n < 3 || n > 15) {
            while (true) {
                if (n < 3 || n > 15) {
                    System.out.println("Enter a number greater than 3 and less than 15.");
                    System.out.print("n: ");
                    int num = in.nextInt();
                    System.out.println(); // adding space.
                    if (num > 3 && num < 15) {
                        System.out.print("Multiplication table for " + num + ".");
                        for (int i = 0; i <= num; i++) {
                            for (int j = 0; j <= num; j++) {
                                System.out.println();
                                System.out.printf("%-4d", i * j);
                                ;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    // Method for generating Random number in a given range.
    public static void randomNum() {
        System.out.print("min: ");
        int min = in.nextInt();
        System.out.print("max: ");
        int max = in.nextInt();

        int result = (int) ((Math.random() * (max - min)) + min);
        System.out.println("Here is Your Random Number: " + result);
    }

    // Method for Factorial.
    public static void factorial() {
        System.out.print("n: ");
        int n = in.nextInt();
        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    // Method for sorting 3 numbers
    public static void sortThreeNumbers() {
        System.out.print("Enter 3 numbers to sort (with space between): ");
        int numOne = in.nextInt();
        int numTwo = in.nextInt();
        int numThree = in.nextInt();

        if (numOne >= numTwo) {
            if (numTwo >= numThree) {
                System.out.println("In order " + numThree + " " + numOne + " " + numTwo);
            } else if (numThree >= numOne) {
                System.out.println("In order " + numTwo + " " + numOne + " " + numThree);
            } else if (numOne > numThree) {
                System.out.println("In order " + numTwo + " " + numThree + " " + numOne);
            }
        }
        if (numTwo > numOne) {
            if (numThree >= numTwo) {
                System.out.println("In order " + numOne + " " + numTwo + " " + numThree);
            } else if (numThree >= numOne) {
                System.out.println("In order " + numTwo + " " + numOne + " " + numThree);
            } else if (numOne > numThree) {
                System.out.println("In order " + numThree + " " + numOne + " " + numTwo);
            }
        }
    }

    // Method for Lexicographically.
    public static void lexicorgraphically() {
        System.out.print("String One: ");
        String strOne = in.next();
        System.out.print("String Two: ");
        String strTwo = in.next();
        System.out.print("String Three: ");
        String strThree = in.next();

        // saving values to a string array.
        String[] arr = { strOne, strTwo, strThree };

        // Comparing each string and sorting..
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String tempVariable = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVariable;
                }
            }
        }

        // printing each value out of the sorted array.
        System.out.println("Here is your sorted Strings: ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
