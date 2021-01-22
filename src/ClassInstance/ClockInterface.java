package ClassInstance;

import java.util.Scanner;

public class ClockInterface {
    public static void main(String[]args) throws InterruptedException {
        Clock currentTime = new Clock(0,0,0,0);
        Clock newTime = new Clock(1,0,0,0);
        System.out.println(currentTime);
        System.out.println("time passed: "+ currentTime.timePassed(newTime));
        Scanner input = new Scanner(System.in);
        String val = "";
        while(!val.equals("stop")){
            input.nextLine();
            if(input.equals("Update Time")){
                int day = input.nextInt();
            }
        }

    }

}
