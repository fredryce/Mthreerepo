
import java.security.SecureRandom;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xwang2945
 */
public class HealthyHearts {
    public static void main(String[] args){
         System.out.println("What is your age?");
         Scanner myScan = new Scanner(System.in);
         SecureRandom myrand = new SecureRandom();
         int age = myScan.nextInt();
         int healthy = (220-age);
         int low = (int) (healthy*0.5);
         int upper = (int) (healthy*0.85);
         System.out.println("Your maximum heart rate should be " + healthy +" beats per minute");
         System.out.println("Your target HR Zone is " + low +" - " + upper + " beats per minute");
    }
    
}
