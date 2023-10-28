import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        numberSystemConverter program1 = new numberSystemConverter();
        program1.start();
    }
}
class numberSystemConverter{
    Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean flag = true;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("Choose what operation you want to perform:\n");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");
            flag = checkAnswerFromUser();
        } while (flag);
    }
    public boolean checkAnswerFromUser(){
        String answerFromUser = scanner.nextLine();
        switch (answerFromUser){
            case "A":
                answerA();
                return true;
            case "B":
                answerB();
                return true;
            case "C":
                answerC();
                return true;
            case "D":
                answerD();
                return true;
            case "E":
                answerE();
                return true;
            case "F":
                answerF();
                return true;
            case "W":
                System.out.println("Goodbye!");
                return false;
            default:
                System.out.println("Something is wrong");
                return false;
        }
    }



    public String chooseSystem(){
        System.out.println("Please choose system:");
        System.out.println("A. Binary");
        System.out.println("B. Octal");
        System.out.println("C. Hexadecimal");
        String userSystem = scanner.nextLine();
        switch (userSystem){
            case "A":
                return "Binary";
            case "B":
                return "Octal";
            case "C":
                return "Hexadecimal";
            default:
                return "Something is wrong";
        }
    }
    public void answerA(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the number: ");
        String userInput = scanner.nextLine();
        if(userSystem.equals("Binary")){
            System.out.printf("Binary %s to decimal is: %d %n",userInput,Integer.parseInt(userInput,2));
        }
        else if (userSystem.equals("Octal")){
            System.out.printf("Octal %s to decimal is: %d %n",userInput,Integer.parseInt(userInput,8));
        }
        else if(userSystem.equals("Hexadecimal")){
            System.out.printf("Hexadecimal %s to decimal is: %d %n",userInput,Integer.parseInt(userInput,16));
        }
        else{
            System.out.println("Choose correct letter");
        }
    }
    public void answerB(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the number: ");
        String userInput = scanner.nextLine();
        if(userSystem.equals("Binary")){
            System.out.printf("Decimal %s to binary is: %s %n",userInput,Integer.toBinaryString(Integer.parseInt(userInput)));
        }
        else if (userSystem.equals("Octal")){
            System.out.printf("Decimal %s to octal is: %s %n",userInput,Integer.toOctalString(Integer.parseInt(userInput)));
        }
        else if(userSystem.equals("Hexadecimal")){
            System.out.printf("Decimal %s to hexadecimal is: %s %n",userInput,Integer.toHexString(Integer.parseInt(userInput)));
        }
        else{
            System.out.println("Choose correct letter");
        }
    }
    public void answerC(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the first number: ");
        String userInputFirst = scanner.nextLine();
        System.out.println("Please enter the second number: ");
        String userInputSecond = scanner.nextLine();
        int userInputFirstInteger;
        int userInputSecondInteger;
        int resultInt;
        String resultStrInSystem;
        if(userSystem.equals("Binary")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,2);
            userInputSecondInteger = Integer.parseInt(userInputSecond,2);
            resultInt = userInputFirstInteger+userInputSecondInteger;
            resultStrInSystem = Integer.toBinaryString(resultInt);
            System.out.printf("The result of summation %s + %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if (userSystem.equals("Octal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,8);
            userInputSecondInteger = Integer.parseInt(userInputSecond,8);
            resultInt = userInputFirstInteger+userInputSecondInteger;
            resultStrInSystem = Integer.toOctalString(resultInt);
            System.out.printf("The result of summation %s + %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if(userSystem.equals("Hexadecimal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,16);
            userInputSecondInteger = Integer.parseInt(userInputSecond,16);
            resultInt = userInputFirstInteger+userInputSecondInteger;
            resultStrInSystem = Integer.toHexString(resultInt);
            System.out.printf("The result of summation %s + %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
    }
    public void answerD(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the first number: ");
        String userInputFirst = scanner.nextLine();
        System.out.println("Please enter the second number: ");
        String userInputSecond = scanner.nextLine();
        int userInputFirstInteger;
        int userInputSecondInteger;
        int resultInt;
        String resultStrInSystem;
        if(userSystem.equals("Binary")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,2);
            userInputSecondInteger = Integer.parseInt(userInputSecond,2);
            resultInt = userInputFirstInteger-userInputSecondInteger;
            resultStrInSystem = Integer.toBinaryString(resultInt);
            System.out.printf("The result of summation %s - %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if (userSystem.equals("Octal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,8);
            userInputSecondInteger = Integer.parseInt(userInputSecond,8);
            resultInt = userInputFirstInteger-userInputSecondInteger;
            resultStrInSystem = Integer.toOctalString(resultInt);
            System.out.printf("The result of summation %s - %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if(userSystem.equals("Hexadecimal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,16);
            userInputSecondInteger = Integer.parseInt(userInputSecond,16);
            resultInt = userInputFirstInteger-userInputSecondInteger;
            resultStrInSystem = Integer.toHexString(resultInt);
            System.out.printf("The result of summation %s - %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
    }
    public void answerE(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the first number: ");
        String userInputFirst = scanner.nextLine();
        System.out.println("Please enter the second number: ");
        String userInputSecond = scanner.nextLine();
        int userInputFirstInteger;
        int userInputSecondInteger;
        int resultInt;
        String resultStrInSystem;
        if(userSystem.equals("Binary")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,2);
            userInputSecondInteger = Integer.parseInt(userInputSecond,2);
            resultInt = userInputFirstInteger*userInputSecondInteger;
            resultStrInSystem = Integer.toBinaryString(resultInt);
            System.out.printf("The result of summation %s * %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if (userSystem.equals("Octal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,8);
            userInputSecondInteger = Integer.parseInt(userInputSecond,8);
            resultInt = userInputFirstInteger*userInputSecondInteger;
            resultStrInSystem = Integer.toOctalString(resultInt);
            System.out.printf("The result of summation %s * %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if(userSystem.equals("Hexadecimal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,16);
            userInputSecondInteger = Integer.parseInt(userInputSecond,16);
            resultInt = userInputFirstInteger*userInputSecondInteger;
            resultStrInSystem = Integer.toHexString(resultInt);
            System.out.printf("The result of summation %s * %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
    }
    public void answerF(){
        String userSystem = chooseSystem();
        System.out.println("Please enter the first number: ");
        String userInputFirst = scanner.nextLine();
        System.out.println("Please enter the second number: ");
        String userInputSecond = scanner.nextLine();
        int userInputFirstInteger;
        int userInputSecondInteger;
        int resultInt;
        String resultStrInSystem;
        if(userSystem.equals("Binary")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,2);
            userInputSecondInteger = Integer.parseInt(userInputSecond,2);
            resultInt = userInputFirstInteger/userInputSecondInteger;
            resultStrInSystem = Integer.toBinaryString(resultInt);
            System.out.printf("The result of summation %s / %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if (userSystem.equals("Octal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,8);
            userInputSecondInteger = Integer.parseInt(userInputSecond,8);
            resultInt = userInputFirstInteger/userInputSecondInteger;
            resultStrInSystem = Integer.toOctalString(resultInt);
            System.out.printf("The result of summation %s / %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
        else if(userSystem.equals("Hexadecimal")){
            userInputFirstInteger = Integer.parseInt(userInputFirst,16);
            userInputSecondInteger = Integer.parseInt(userInputSecond,16);
            resultInt = userInputFirstInteger/userInputSecondInteger;
            resultStrInSystem = Integer.toHexString(resultInt);
            System.out.printf("The result of summation %s / %s = %s %n",userInputFirst,userInputSecond,resultStrInSystem);
        }
    }
}
