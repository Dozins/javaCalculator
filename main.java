import java.util.Scanner;


class Main {


    private static int operation;
    private static float firstNumber;
    private static float secondNumber;
    public static void main(String args[]){
        while (true){
            System.out.println("\nWelcome to my calculator");
            System.out.println("What operation would you like to perform?\n");

            
            System.out.println("type 1 for addition");
            System.out.println("type 2 for subtraction");
            System.out.println("type 3 for multiplication");
            System.out.println("type 4 for division");
            Scanner inputoperator = new Scanner(System.in);



            operation = inputoperator.nextInt();
            calc();

            

        }
    }
    public static void calcaddition(){
        System.out.println("The result is " + (firstNumber + secondNumber));
    }
    public static void calcsubtraction(){
        System.out.println("The result is " + (firstNumber - secondNumber));
    }
    public static void calcmultiplication(){
        System.out.println("The result is " + (firstNumber * secondNumber));
    }
    public static void calcdivision(){
        System.out.println("The result is " + (firstNumber / secondNumber));
    }

    public static void calc(){
        Scanner inputnumber = new Scanner(System.in);
        System.out.println("What is the first number you want to use?");
        firstNumber = inputnumber.nextFloat();
        System.out.println("What is the second number you want to use?");
        secondNumber = inputnumber.nextFloat();
        if(operation == 1){
            System.out.println("Your operation is addition");
            calcaddition();
        }
        if(operation == 2){
            System.out.println("Your operation is subtraction");
            calcsubtraction();
        }
        if(operation == 3){
            System.out.println("Your operation is multiplication");
            calcmultiplication();
        }
        if(operation == 4){
            System.out.println("Your operation is division");
            calcdivision();
        }

    }
}