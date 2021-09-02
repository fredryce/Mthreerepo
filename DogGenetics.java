
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
public class DogGenetics {
    
     public static void main(String[] args){
         System.out.println("Whats the name of your dog?");
         
         Scanner myScan = new Scanner(System.in);
         SecureRandom myrand = new SecureRandom();
         
         String dogName = myScan.nextLine();
         System.out.println("Well then, I have this highly reliable report on "+ dogName + "'s prestigious background right here.");
         System.out.println(dogName+" is:\n");
         int total = 0;
         String[] myBreed = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"}; 
         int[] perc = new int[myBreed.length];
         for(int i=0;i<myBreed.length;i++){
             int sb = myrand.nextInt(100) + 1;
             perc[i] = sb;
             total+=sb;
         }
         for(int i=0;i<myBreed.length;i++){
             float percTemp = ((float)perc[i]/total)*100;
             System.out.println(percTemp + "% " + myBreed[i]);
             
         }
         
         
         System.out.println("Wow, that's QUITE the dog!");
         
     }
    
}
