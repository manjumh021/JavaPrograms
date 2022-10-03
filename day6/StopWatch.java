/*
Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/

import java.util.Scanner;

public class StopWatch {
    static String getUserInput(){
        System.out.print("Enter the start or stop: ");
        Scanner scanner = new Scanner(System.in);
        String track = scanner.next();
        if ( track.equals("start")  || track.equals("stop") ){
        }
        else{
            track = getUserInput();
        }
        return track;
    }
    static long getTime(){
        return System.currentTimeMillis();
    }
    public static void main(String[] args) {
        System.out.println("Stopwatch Program..:");
        long startTime = 0 ;
        long stopTime = 0 ;
        boolean isBegining = true;
        while(true){
            String track = getUserInput();
            if (track.equals("start")){
                System.out.println("Stop watch started: 0");
                startTime = getTime();
            }
            //to override 'stop' input at the begining of the program
            else if(isBegining){
                break;
            }
            else{
                System.out.println("Stop watch stopped.");
                stopTime = getTime();
                break;
            }
            isBegining = false;
        }
        long elapsedTime = stopTime - startTime;
        System.out.println("Time: " + (elapsedTime/1000) + "  seconds.");
    }
}