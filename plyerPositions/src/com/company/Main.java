package com.company;

public class Main {
    /*create a method called displayHighScorePosition
    -it should the player names as a parameter and 2d parameter as a position
    -create a 2d method called calculateHighScorePosition -it should sent an argument
    only the player score and it should return as int .
    -the return data should be : 1- score > 1000  // 2 score > 500 < 1000
     3 score >100 < 500 // 4 all other cases .
    */
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition( "Tim " , highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition( "Bob " , highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition( "Percy " , highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition( "Gilbert " , highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition( "Jakob " , highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition( "Christine " , highScorePosition);



    }

    public static void displayHighScorePosition(String playerName ,int highScorePosition){
        System.out.println( playerName + " manage to get into position " +
                highScorePosition + " on the high score position");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }else if (playerScore >=500 && playerScore< 1000){
            return 2;

        }else if (playerScore >=100 && playerScore < 500){
            return 3;
        }else; {
            return 4;
        }
        /*

        another way
        int postion = 4 ; // assuming position
        if ( playerScore > = 100) {
            position = 1;
            }else if ( playerScore >= 500){
            position = 2 ;
            }else if ( playerScore >= 100){
            position = 3 ;
            }
            return position;

        */

    }
}
