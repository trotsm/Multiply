/**
 * class that multiply the integers, that have 4 digits e.g. 1234*1234
 */
public class multiplyFourNumbers {
    // multipliedNumber is sum of two digits
    // if we have 42 and 56, it is 6*2, 6*4, 5*2, 5*4
    int multipliedNumber = 0;

    /**
     * create and print first line of the result
     *
     * @param array1   integer array of first input parameters
     * @param array2   integer array of second input parameters
     * @param digitOne array for first divided numbers, e.g. [25,34] from input - [5,4] in digitOne[]
     * @param digitTwo array for second divided numbers, e.g. [25,34] from input - [2,3] in digitTwo[]
     */
    void firstLine(int[] array1, int[] array2, int[] digitOne, int[] digitTwo) {
        int[] firstLine = new int[array1.length]; // create array that show integers in first line of multiplication
        // we have to divide multipliedNumber to separate digits
        // because if we have 6*2 as a result we have 12, we need to write down 2 and then add 1 to next digit
        for (int i = array1.length - 1; i >= 0; i--) {
            multipliedNumber = array2[3] * array1[i]; // multiply last int from array2([3]) to all digits in array1
            digitOne[i] = multipliedNumber % 10; // divide integer for 2 digits, e.g. from 12 we have 2
            multipliedNumber /= 10;
            digitTwo[i] = multipliedNumber % 10; // e.g. from 12 we have 1

            if (i == 0) { // array to show first line
                firstLine[0] = digitOne[0] + digitTwo[1]; // show the first digit
                String nFirst = String.valueOf(digitTwo[0] + "" + firstLine[0]);
                firstLine[0] = Integer.parseInt(nFirst); //e.g. if nFirst is higher than 9, show that 5*62345 is 311725, not 11725
                if (firstLine[0] > 99) { //if nFirst by adding is e.g. 310(3+10) digitTwo[0]=3 firstLine[0] = 10
                    firstLine[0] = digitTwo[1] + digitOne[0];
                    int secondN = firstLine[0] % 10;
                    firstLine[0] /= 10;
                    int firstN = firstLine[0] % 10;
                    firstLine[0] = digitTwo[0] + firstN;
                    String nSecond = String.valueOf(firstLine[0] + "" + secondN);
                    firstLine[0] = Integer.parseInt(nSecond); //digit will be e.g. 411 instead of 3111
                }
            } else if (i == 1) {
                firstLine[1] = digitTwo[2] + digitOne[1];
            } else if (i == 2) {
                firstLine[2] = digitTwo[3] + digitOne[2];
            } else if (i == 3) {
                firstLine[3] = digitOne[3]; // show the last digit
            }
        }
        System.out.print("          ");
        // check if item in secondLine is higher than 9
        // if yes, divide this item to 2 digits
        // if it is 13 - 3 show, and 1 add to next integer
        for (int l = firstLine.length - 1; l >= 0; l--) {
            // and check if first number is not higher than 9 (we need to show entire first number (5*62345 is 311725, not 11725)
            if (firstLine[l] > 9 && l != 0) {
                int firstNumber = firstLine[l] % 10; //get the second digit(from 12 it is 2)
                firstLine[l] /= 10;
                int secondNumber = firstLine[l] % 10; // get the first digit(from 12 it is 1)
                firstLine[l] = firstNumber; // instead 12 show only 2
                firstLine[l - 1] = firstLine[l - 1] + secondNumber; // add 1 (from 12) to next item in the array
            }
        }
        for (int line = 0; line < firstLine.length; line++)
            System.out.print(firstLine[line]); //print first line in right order
        System.out.println();
    }

    /**
     * create and print second line of the result
     *
     * @param array1   integer array of first input parameters
     * @param array2   integer array of second input parameters
     * @param digitOne array for first divided numbers, e.g. [25,34] from input - [5,4] in digitOne[]
     * @param digitTwo array for second divided numbers, e.g. [25,34] from input - [2,3] in digitTwo[]
     */
    void secondLine(int[] array1, int[] array2, int[] digitOne, int[] digitTwo) {
        int[] secondLine = new int[array1.length]; // create array that show integers in second line of multiplication
        for (int i = array1.length - 1; i >= 0; i--) {
            multipliedNumber = array2[2] * array1[i]; // multiply third int from array2([2]) to all digits in array1
            digitOne[i] = multipliedNumber % 10;  // divide integer for 2 digits, e.g. from 12 we have 2
            multipliedNumber /= 10;
            digitTwo[i] = multipliedNumber % 10;

            if (i == 0) { // array to show second line
                secondLine[0] = digitOne[0] + digitTwo[1]; // show the first digit
                String nFirst = String.valueOf(digitTwo[0] + "" + secondLine[0]);
                secondLine[0] = Integer.parseInt(nFirst);//if nFirst is higher than 9, show that 5*62345 is 311725, not 11725
                if (secondLine[0] > 99) { //if nFirst by adding is e.g. 310(3+10) digitTwo[0]=3 firstLine[0] = 10
                    secondLine[0] = digitTwo[1] + digitOne[0];
                    int secondN = secondLine[0] % 10;
                    secondLine[0] /= 10;
                    int firstN = secondLine[0] % 10;
                    secondLine[0] = digitTwo[0] + firstN;
                    String nSecond = String.valueOf(secondLine[0] + "" + secondN);
                    secondLine[0] = Integer.parseInt(nSecond); //digit will be e.g. 411 instead of 3111
                }
            } else if (i == 1) {
                secondLine[1] = digitTwo[2] + digitOne[1];
            } else if (i == 2) {
                secondLine[2] = digitTwo[3] + digitOne[2];
            } else if (i == 3) {
                secondLine[3] = digitOne[3]; // show the last digit
            }
        }
        System.out.print("         ");
        // check if item in thirdLine is higher than 9
        // if yes, divide this item to 2 digits
        //if it is 13 - 3 show, and 1 add to next integer
        for (int l = secondLine.length - 1; l >= 0; l--) {
            // and check if first number is not higher than 9 (we need to show entire first number)
            if (secondLine[l] > 9 && l != 0) {
                int firstNumber = secondLine[l] % 10; //get the second digit(from 12 it is 2)
                secondLine[l] /= 10;
                int secondNumber = secondLine[l] % 10; // get the first digit(from 12 it is 1)
                secondLine[l] = firstNumber; // instead 12 show only 2
                secondLine[l - 1] = secondLine[l - 1] + secondNumber; // add 1 (from 12) to next item in the array
            }
        }
        for (int line = 0; line < secondLine.length; line++)
            System.out.print(secondLine[line]); //print second line in right order
        System.out.println();
    }

    /**
     * create and print third line of the result
     *
     * @param array1   integer array of first input parameters
     * @param array2   integer array of second input parameters
     * @param digitOne array for first divided numbers, e.g. [25,34] from input - [5,4] in digitOne[]
     * @param digitTwo array for second divided numbers, e.g. [25,34] from input - [2,3] in digitTwo[]
     */
    void thirdLine(int[] array1, int[] array2, int[] digitOne, int[] digitTwo) {
        int[] thirdLine = new int[array1.length];  // create array that show integer in third line of multiplication
        for (int i = array1.length - 1; i >= 0; i--) {
            multipliedNumber = array2[1] * array1[i]; // multiply second int from array2([2]) to all digits in array1
            digitOne[i] = multipliedNumber % 10; // divide integer for 2 digits, e.g. from 12 we have 2
            multipliedNumber /= 10;
            digitTwo[i] = multipliedNumber % 10;

            if (i == 0) { // array to show third line
                thirdLine[0] = digitOne[0] + digitTwo[1];  // show the first digit
                String nFirst = String.valueOf(digitTwo[0] + "" + thirdLine[0]);
                thirdLine[0] = Integer.parseInt(nFirst); //if nFirst is higher than 9, show that 5*62345 is 311725, not 11725
                if (thirdLine[0] > 99) { //if nFirst by adding is e.g. 310(3+10) digitTwo[0]=3 firstLine[0] = 10
                    thirdLine[0] = digitTwo[1] + digitOne[0];
                    int secondN = thirdLine[0] % 10;
                    thirdLine[0] /= 10;
                    int firstN = thirdLine[0] % 10;
                    thirdLine[0] = digitTwo[0] + firstN;
                    String nSecond = String.valueOf(thirdLine[0] + "" + secondN);
                    thirdLine[0] = Integer.parseInt(nSecond); //digit will be e.g. 411 instead of 3111
                }
            } else if (i == 1) {
                thirdLine[1] = digitTwo[2] + digitOne[1];
            } else if (i == 2) {
                thirdLine[2] = digitTwo[3] + digitOne[2];
            } else if (i == 3) {
                thirdLine[3] = digitOne[3];  // show the last digit
            }
        }
        System.out.print("        ");
        // check if item in thirdLine is higher than 9
        // if yes, divide this item to 2 digits
        //if it is 13 - 3 show, and 1 add to next integer
        for (int l = thirdLine.length - 1; l >= 0; l--) {
            // and check if first number is not higher than 9 (we need to show entire first number)
            if (thirdLine[l] > 9 && l != 0) {
                int firstNumber = thirdLine[l] % 10; //get the second digit(from 12 it is 2)
                thirdLine[l] /= 10;
                int secondNumber = thirdLine[l] % 10; // get the first digit(from 12 it is 1)
                thirdLine[l] = firstNumber; // instead 12 show only 2
                thirdLine[l - 1] = thirdLine[l - 1] + secondNumber; // add 1 (from 12) to next item in the array
            }
        }
        for (int line = 0; line < thirdLine.length; line++)
            System.out.print(thirdLine[line]); //print third line in right order
        System.out.println();
    }

    /**
     * create and print fourth line of the result
     *
     * @param array1   integer array of first input parameters
     * @param array2   integer array of second input parameters
     * @param digitOne array for first divided numbers, e.g. [25,34] from input - [5,4] in digitOne[]
     * @param digitTwo array for second divided numbers, e.g. [25,34] from input - [2,3] in digitTwo[]
     */
    void fourthLine(int[] array1, int[] array2, int[] digitOne, int[] digitTwo) {
        int[] fourthLine = new int[array1.length]; // create array that show integer in fourth line of multiplication
        for (int i = array1.length - 1; i >= 0; i--) {  // multiply first int from array2([0]) to all digits in array1
            multipliedNumber = array2[0] * array1[i];
            digitOne[i] = multipliedNumber % 10; // divide integer for 2 digits, e.g. from 12 we have 2
            multipliedNumber /= 10;
            digitTwo[i] = multipliedNumber % 10;

            if (i == 0) { // array to show fourth line
                fourthLine[0] = digitOne[0] + digitTwo[1];
                String nFirst = String.valueOf(digitTwo[0] + "" + fourthLine[0]);
                fourthLine[0] = Integer.parseInt(nFirst);//if nFirst is higher than 9, show that 5*62345 is 311725, not 11725
                if (fourthLine[0] > 99) { //if nFirst by adding is e.g. 310(3+10) digitTwo[0]=3 firstLine[0] = 10
                    fourthLine[0] = digitTwo[1] + digitOne[0];
                    int secondN = fourthLine[0] % 10;
                    fourthLine[0] /= 10;
                    int firstN = fourthLine[0] % 10;
                    fourthLine[0] = digitTwo[0] + firstN;
                    String nSecond = String.valueOf(fourthLine[0] + "" + secondN);
                    fourthLine[0] = Integer.parseInt(nSecond); //digit will be e.g. 411 instead of 3111
                }
            } else if (i == 1) {
                fourthLine[1] = digitTwo[2] + digitOne[1];
            } else if (i == 2) {
                fourthLine[2] = digitTwo[3] + digitOne[2];
            } else if (i == 3) {
                fourthLine[3] = digitOne[3]; // show the last digit
            }
        }
        System.out.print("       ");
        // check if item in fourthLine is higher than 9
        // if yes, divide this item to 2 digits
        //if it is 13 - 3 show, and 1 add to next integer
        for (int l = fourthLine.length - 1; l >= 0; l--) {
            // and check if first number is not higher than 9 (we need to show entire first number)
            if (fourthLine[l] > 9 && l != 0) {
                int firstNumber = fourthLine[l] % 10; //get the second digit(from 12 it is 2)
                fourthLine[l] /= 10;
                int secondNumber = fourthLine[l] % 10; // get the first digit(from 12 it is 1)
                fourthLine[l] = firstNumber; // instead 12 show only 2
                fourthLine[l - 1] = fourthLine[l - 1] + secondNumber; // add 1 (from 12) to next item in the array
            }
        }
        for (int line = 0; line < fourthLine.length; line++)
            System.out.print(fourthLine[line]); //print fourth line in right order
        System.out.println();
    }
}
