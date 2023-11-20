import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);
        System.out.println(getInt(scan, "Please enter an int value."));
        System.out.println(getInt);
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
}