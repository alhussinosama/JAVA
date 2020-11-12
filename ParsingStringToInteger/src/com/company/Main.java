package com.company;
/*
- write a method named canPack with three parameters int bigcount,smallcount and goal
-the parameters bigcount represents the count of big flour bags 5kg.
-small parameters represents the count of small flour bags 1kg
- the goal represent the gol amount kilos of the flour needed to assemble a package.
-therefore the sum of the kilos sof bigcount and smallcount must
 be at least equal to the value of goal.
*/

public class Main {

    public static void main ( String[] args){
            canPack(4,0,3);
            canPack(0,0,3);
             canPack(-2,0,3);
    }
        public static void canPack(int bigCount , int smallCount , int goal) {
            if (bigCount < 0 | smallCount < 0 | goal < 0) {
                System.out.println(" the can Packs negativ are not correct");
            }
            if ((5 * bigCount) + smallCount >= goal) {
                System.out.println(" the can packs are correct ");
            } else {
                System.out.println(" there are some wrong in the packs");
            }

        }
    }

