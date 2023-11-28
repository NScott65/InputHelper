import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);




        System.out.println(getYNConfirm(scan, "Please enter \"Y\" or \"N\"."));


    }

    //This Method Loops until a valid integer input is received. Returns int value.
    public static int getInt(Scanner in, String prompt){
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextInt()){
                x = in.nextInt();
                done = true;
            }else{
                System.out.println("Invalid input. Do better.");
            }
            in.nextLine(); //clear buffer
        }while(!done);
        return x;
    }

    public static int getRangedInt(Scanner in, String prompt, int min, int max){
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextInt()){
                x = in.nextInt();
                //check to see if value is in range.
                if(x <= max && x >= min){
                    done = true;
                }else{
                    System.out.println("Invalid input. Do better.");
                }
            }else{
                System.out.println("Invalid input. Do better.");
            }
            in.nextLine(); //clear buffer
        }while(!done);
        return x;
    }

    public static String getRegExString(Scanner in, String prompt, String regEx){
        String input;
        boolean valid = false;

        do {
            System.out.println(prompt);
            input = in.nextLine();
            if (input.matches(regEx)){
                valid = true;
            }else{
                System.out.println("Invalid Input.");
            }
        }while(!valid);

        return input;
    }

    public static String getNonZeroLengString(Scanner in, String prompt){
        String input = " ";
        boolean valid = false;

        System.out.println(prompt);
        do {
            if (in.hasNextLine()) {
                input = in.nextLine();
                if (input.length() > 0) {
                    valid = true;
                } else {
                    System.out.println("Your String is less than one.");
                }
            } else {
                System.out.println("Your input is invalid.");
            }
        }while(!valid);
        return input;
    }

    public static String getYNConfirm(Scanner in, String prompt){
        String input = " ";
        boolean yn = false;
        boolean valid = false;
        String end = "";

        System.out.println(prompt);

        do{
            if(in.hasNextLine()){
                input = in.nextLine();
                if(input.equalsIgnoreCase("Y")){
                    yn = true;
                    valid = true;
                }else if(input.equalsIgnoreCase("N")){
                    yn = false;
                    valid = true;
                }else{
                    System.out.println("Your input is invalid.");
                }
            }else{
                System.out.println("Your input is invalid.");
            }
        }while(!valid);

        if(yn == true){
            input = "true";
        }else if(yn == false){
            input = "false";
        }

        return input;
    }
}