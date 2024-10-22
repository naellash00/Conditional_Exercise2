import java.util.Scanner;

public class Conditional_Exercise2 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        //1.Write a program that checks the role of the user
        System.out.print("Please, Enter your role: ");
        String role = input.nextLine();
        if(role.equalsIgnoreCase("admin"))
            System.out.println("welcome " + role);
        else if(role.equalsIgnoreCase("superuser"))
            System.out.println("welcome " + role);
        else
            System.out.println("welcome " + role);


        System.out.println("********************************************");

        //2.Take three numbers from the user and print the greatest number.
        System.out.println("Input the 1st number: ");
        int number1 = input.nextInt();
        System.out.println("Input the 2nd number: ");
        int number2 = input.nextInt();
        System.out.println("Input the 3rd number: ");
        int number3 = input.nextInt();
        int max;
        if(number1 > number2 && number1 > number3)
            max = number1;
        else if(number2 > number1 && number2 > number3)
            max = number2;
        else
            max = number3;
        System.out.println("The greatest: " + max);


        System.out.println("********************************************");

        //3.Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.
        int randomNumber = 1 + (int) (Math.random() * 7);
        //System.out.print(randomNumber);
        switch(randomNumber){
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Teusady"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday"); break;
            case 7:
                System.out.println("Saturday"); break;
            default:
                System.out.print("You entered a wrong value, try again.");
        }


        System.out.println("********************************************");

        //4. Write a program that takes a numeric score as input and prints
        //the corresponding letter grade using the following grading scale:
        System.out.println("Enter your numeric score: ");
        int score = input.nextInt();
        System.out.println("Numeric Score: " + score);
        if(score>=90 && score<=100)
            System.out.println("Letter Grade: A");
        else if(score>=80 && score<=89)
            System.out.println("Letter Grade: B");
        else if(score>=70 && score <= 79)
            System.out.println("Letter Grade: C");
        else if(score>=60 && score<69)
            System.out.println("Letter Grade: D");
        else
            System.out.println("Letter Grade: F");


        System.out.println("********************************************");

        //5. Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age<13)
            System.out.println("You are a Child");
        else if(age>=13 && age<=19)
            System.out.println("You are a Teenager");
        else
            System.out.println("You are an Adult");

    } //end main
}
