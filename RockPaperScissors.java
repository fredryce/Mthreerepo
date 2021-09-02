
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
public class RockPaperScissors {
    
    
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        SecureRandom myrand = new SecureRandom();
        int tie = 0, win=0, loss = 0;
        String[] rpcList = {"Rock" ,"Paper" ,"Scissor"}; //rock paper sci
        int[] result = new int[2];
        System.out.println("How many rounds do you want to play?");
        int roundNum = myScan.nextInt();
        while(true){
            for(int i=0;i<roundNum;i++){
                System.out.println("Choose your move: \n1 for Rock\n2 for Paper\n3 for Scissor");
                int choice = myScan.nextInt();
                int randomChoice = myrand.nextInt(3) + 1;
                System.out.println("Your choice is "+ rpcList[choice-1]);
                System.out.println("Computer choice is " + rpcList[randomChoice-1]);

                if(choice==randomChoice){
                    tie++;
                    System.out.println("Tied!!");
                    continue;
                }

                result[0] = choice;
                result[1] = randomChoice;
                int largeIndex = getIndexOfLargest(result);

                if(largeIndex==0){
                    System.out.println("You won!!!");
                    win++;
                }else{
                    System.out.println("Computer Won!!");
                    loss++;
                }
                //System.out.println("result is "+largeIndex);
                System.out.println("");


            }
            System.out.println("Games over!!\nWins:"+win+ " Loss:"+loss+" Ties:"+tie);
            System.out.println("");
            myScan.nextLine();
            System.out.println("Do you want to play again? Yes or No");
            String again = myScan.nextLine();
            System.out.println("Your choose " + again);
            if(again.toUpperCase().equals("NO") || again.toUpperCase().equals("N")){
                break;
            }
        }
        
        
    }
    public static int getIndexOfLargest( int[] array )
    {
      if ( array == null || array.length == 0 ) return -1; // null or empty

      int largest = 0;
      for ( int i = 1; i < array.length; i++ )
      {
          if ( array[i] > array[largest] ) largest = i;
          
      }
       
      if(array[0] == 3 && array[1]==1){ 
          largest = 1;
      }
      if(array[0] == 1 && array[1]==3){
          largest = 0;
      }
      
      return largest; // position of the first largest found
    }
    
    
}
