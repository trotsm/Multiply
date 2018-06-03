/**
 * class that multiply the integers,e.g. 12345*12345, 1234*1234, 123*123, 23*23
 */
public class Multiply {
    public static void main(String[] args) {
        String s = mult("12345", "12345");// call the method
        System.out.printf("%15s", s);//print result of 2 integers
    }

    /**
     * mult is called to multiply 2 integers
     *
     * @param s1 is integer input
     * @param s2 is second integer input
     * @return result of multiplication
     */
    static String mult(String s1, String s2) {
        System.out.printf("%15s", s1); System.out.println(); // print the first integer
        System.out.printf("%15s", s2); System.out.println(); //print the second integer
        // splits each integer into a String array
        String[] integerStrings1 = s1.split("");
        String[] integerStrings2 = s2.split("");
        //convert String array of input parameters to long to multiply 2 integers
        long resultFirstArray = Long.parseLong(s1); // convert first String array to long because result can be higher than INT_MAX
        long resultSecondArray = Long.parseLong(s2); // convert second String array to long because result can be higher than INT_MAX
        int[] array1 = new int[integerStrings1.length]; // creates the integer array of first input parameters
        for (int i = 0; i < array1.length; i++) { // array1 in reverse because we multiply from the end
            array1[i] = Integer.parseInt(integerStrings1[i]);
        }
        int[] array2 = new int[integerStrings2.length]; // creates the integer array of second input parameters
        for (int i2 = 0; i2 < array2.length; i2++) { // array2 in reverse order because we multiply from the end
            array2[i2] = Integer.parseInt(integerStrings2[i2]);
        }
        int[] digitOne = new int[array1.length];// create an array for first divided numbers, e.g. [25,34] from input - [5,4] in digitOne[]
        int[] digitTwo = new int[array1.length];// create an array for second divided numbers, e.g. [25,34] from input - [2,3] in digitTwo[]

        multiplyFiveNumbers fiveLines = new multiplyFiveNumbers(); // create an object
        if (array1.length == 5) { // call this methods if input has 5 items
            System.out.println("          _____");
            // call the method that create first line
            fiveLines.firstLine(array1, array2, digitOne, digitTwo);
            // call the method that create second line
            fiveLines.secondLine(array1, array2, digitOne, digitTwo);
            // call the method that create third line
            fiveLines.thirdLine(array1, array2, digitOne, digitTwo);
            // call the method that create fourth line
            fiveLines.fourthLine(array1, array2, digitOne, digitTwo);
            // call the method that create fifth line
            fiveLines.fifthLine(array1, array2, digitOne, digitTwo);
        }
        multiplyFourNumbers fourLines = new multiplyFourNumbers(); // create an object
        if (array1.length == 4) { // call this methods if input has 4 items
            System.out.println("           ____");
            fourLines.firstLine(array1, array2, digitOne, digitTwo);  // call the method that create first line
            fourLines.secondLine(array1, array2, digitOne, digitTwo); // call the method that create second line
            fourLines.thirdLine(array1, array2, digitOne, digitTwo);  // call the method that create third line
            fourLines.fourthLine(array1, array2, digitOne, digitTwo); // call the method that create fourth line
        }
        multiplyThreeNumbers threeLines = new multiplyThreeNumbers(); // create an object
        if (array1.length == 3) { // call this methods if input has 3 items
            System.out.println("            ___");
            threeLines.firstLine(array1, array2, digitOne, digitTwo); // call the method that create third line
            threeLines.secondLine(array1, array2, digitOne, digitTwo); // call the method that create fourth line
            threeLines.thirdLine(array1, array2, digitOne, digitTwo); // call the method that create fifth line
        }
        multiplyTwoNumbers twoLines = new multiplyTwoNumbers(); // create an object
        if (array1.length == 2) { // call this methods if input has 2 items
            System.out.println("             __");
            twoLines.firstLine(array1, array2, digitOne, digitTwo); // call the method that create fourth line
            twoLines.secondLine(array1, array2, digitOne, digitTwo);  // call the method that create fifth line
        }
        System.out.println("_______________");
        long result = resultFirstArray * resultSecondArray; // multiply first integer by the second
        return String.valueOf(result); // show result

    }
}
