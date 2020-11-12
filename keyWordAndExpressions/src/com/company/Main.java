package com.company;

public class Main {

    public static void main(String[] args) {
		boolean gameOver= true;
		int score = 800;
		int levelCompleted = 5;
		int bouns = 100;
		int highScore =calculateScore();
		System.out.println(" your final score is :" + highScore);

		score = 1000;
		levelCompleted = 8;
		bouns = 200;
		int highScore = calculateScore();
		System.out.println(" your final score is :" + highScore);




    }
public static void calculateScore(boolean gameOver,int score,int levelCompleted, int bonus){

	if (gameOver) {
		int finalScore = score + ( levelCompleted * bonus);
		finalScore +=2000;
		finalScore +=2000;
		return finalScore;
	}
	return -1;
}
}
