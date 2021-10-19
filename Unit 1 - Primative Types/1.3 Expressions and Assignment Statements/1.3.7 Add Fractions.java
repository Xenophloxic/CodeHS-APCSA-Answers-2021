public class AddFractions
{
    public static void main(String[] args)
    {
        // declare all the variables needed
        int firstNum = 1;
        int secondNum = 2;
        int firstDen = 2;
        int secondDen = 5;
        // do some math
        int answer1 = firstNum * secondDen + firstDen * secondNum;
        int answer2 = firstDen * secondDen;
        // print out the answers
        System.out.printf("The numerator of the first fraction is %d%n", firstNum);
        System.out.printf("The denominator of the first fraction is %d%n", firstDen);
        System.out.printf("The numerator of the second fraction is %d%n", secondNum);
        System.out.printf("The denominator of the second fraction is %d%n", secondDen);
        System.out.println("The sum of" + firstNum + "/" + firstDen + " + " + secondNum + "/" + secondDen + " = " + answer1 + "/" + answer2);
    }
}