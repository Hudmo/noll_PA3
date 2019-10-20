import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        Random rdm = new Random();
        //may need to edit, "Program stores student response in double precision floating-point variable"
        // and "Program uses floating-point comparison to determine if the students answer is correct"
        int mathType;
        int lvlSelect;
        int lvlMeasure = 0;

        int i;
        int j;

        int rdmInt1;
        int rdmInt2;
        int rdmInt3;
        int rdmInt4;
        double answer = 0;
        double userMath = 0;                        //if query, right answer?, returns correctly, fixed ~
        double userDivisionTest;            //ensures decimal difference ignored after 3rd place (+-0.001)
        int rdmMath;
        double rdmSolution = 1;

        int rdmResponses;
        String right = null;
        String wrong = null;
        int numRight = 0;
        int numWrong = 0;
        double score = 0.0;
        //String[] right = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        //String[] wrong = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
        for(i = 0; i < 10; ++i) {
            System.out.println("Welcome, new student! Select a type of arithmetic problem; 1 for addition, 2 for multiplication, "
                    + "3 for subtraction, 4 for division, and 5 for a random mix of all the previous:");
            mathType = scnr.nextInt();
            if (mathType > 5 || mathType < 1) {                 //ensures user can only enter 1 - 5 ~
                System.out.println("Try again; respond with the number 1, 2, 3, 4, or 5 ONLY.");
                mathType = scnr.nextInt();
            }
            System.out.println("Now select a difficulty between 0 (easy) and 3 (hard):");
            lvlSelect = scnr.nextInt();
            if (lvlSelect > 3 || lvlSelect < 0) {               //ensures user can only enter 0 - 3 ~
                System.out.println("Try again; respond with the number 0, 1, 2, or 3 ONLY.");
                lvlSelect = scnr.nextInt();
            }
            switch(lvlSelect) {                     //changes math problem number range based on user difficulty select ~
                case 0:
                    lvlMeasure = 10;
                    break;
                case 1:
                    lvlMeasure = 100;
                    break;
                case 2:
                    lvlMeasure = 1000;
                    break;
                case 3:
                    lvlMeasure = 10000;
                    break;
            }
            System.out.println("Tip: Assume that (thing)(thing) is simply (thing) * (thing).");
            for(j = 0; j < 10; ++j) {               //loops through 10 problems, once each ~
                rdmInt1 = rdm.nextInt(lvlMeasure);
                rdmInt2 = rdm.nextInt(lvlMeasure);        //determines math problem ~
                rdmInt3 = rdm.nextInt(lvlMeasure);
                rdmInt4 = rdm.nextInt(lvlMeasure);
                //A separate method should be used to generate each new question. This method should be called
                //once when the application begins execution and each time the user answers the question correctly. ::
                if(mathType == 1) {                     //addition ~
                    System.out.println("How much is " + rdmInt1 + " plus " + rdmInt2 + "?");
                    userMath = scnr.nextInt();
                    answer = rdmInt1 + rdmInt2;
                }
                else if(mathType == 2) {                //multiplication ~
                    System.out.println("How much is " + rdmInt1 + " times " + rdmInt2 + "?");
                    userMath = scnr.nextInt();
                    answer = rdmInt1 * rdmInt2;
                }
                else if(mathType == 3) {                //subtraction ~
                    System.out.println("How much is " + rdmInt1 + " minus " + rdmInt2 + "?");
                    userMath = scnr.nextInt();
                    answer = rdmInt1 - rdmInt2;
                }
                else if(mathType == 4) {                //division ~
                    System.out.println("How much is " + rdmInt1 + " divided by " + rdmInt2 + "?");
                    userMath = scnr.nextDouble();
                    answer = (double) rdmInt1 / (double) rdmInt2;
                }
                else if (mathType == 5) {               //random mix ~
                    rdmMath = rdm.nextInt(7);       //7 so it doesn't break immediately ~
                    //System.out.println("Assume that (thing)(thing) is simply (thing) * (thing).");
                    //System.out.println("Given that a = " + rdmInt1 + ", b = " + rdmInt2 + ", c = " + rdmInt3 + ", and d = "
                            //+ rdmInt4 + ", Solve: ");
                    switch (rdmMath) {                       //rS init. to 1 so first case != 0, fixed ~
                        case 0:
                            System.out.print("(" + rdmInt1 + " + " + rdmInt2 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt1 + rdmInt2);
                            //continue;         //breaks 10-Q quiz for loop and continues to next Q, not next switch, therefore X ~
                        case 1:
                            System.out.print("(" + rdmInt1 + " - " + rdmInt4 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt1 - rdmInt4);
                            //continue;
                        case 2:
                            System.out.print("(" + rdmInt3 + " - " + rdmInt4 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt3 - rdmInt4);
                            //continue;
                        case 3:
                            System.out.print("(" + rdmInt3 + " + " + rdmInt1 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt3 + rdmInt1);
                            //continue;
                        case 4:
                            System.out.print("(" + rdmInt2 + " - " + rdmInt1 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt2 - rdmInt1);
                            //continue;
                        case 5:
                            System.out.print("(" + rdmInt4 + " + " + rdmInt1 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt4 + rdmInt1);
                            //continue;
                        case 6:
                            System.out.print("(" + rdmInt3 + " - " + rdmInt1 + ")");
                            rdmMath = rdm.nextInt(10);
                            rdmSolution = rdmSolution * (rdmInt3 - rdmInt1);
                            //continue;
                        case 7:
                            break;
                        case 8:                     //30% chance each time of breaking switch, works well ~
                            break;
                        case 9:
                            break;
                    }
                    rdmMath = rdm.nextInt(4);           //prefer case where rdmInt's are used, bound: 4 ~
                    switch (rdmMath) {
                        case 0:
                            if (rdmInt1 != 0) {
                                System.out.println(" / " + rdmInt1);
                                rdmSolution = rdmSolution / rdmInt1;
                                break;
                            }
                            else {
                                rdmMath = rdm.nextInt(5);
                            }
                        case 1:
                            if (rdmInt2 != 0) {
                                System.out.println(" / " + rdmInt2);
                                rdmSolution = rdmSolution / rdmInt2;
                                break;
                            }
                            else {
                                rdmMath = rdm.nextInt(5);
                            }
                        case 2:
                            if (rdmInt3 != 0) {
                                System.out.println(" / " + rdmInt3);
                                rdmSolution = rdmSolution / rdmInt3;
                                break;
                            }
                            else {
                                rdmMath = rdm.nextInt(5);
                            }
                        case 3:
                            if (rdmInt4 != 0) {
                                System.out.println(" / " + rdmInt4);
                                rdmSolution = rdmSolution / rdmInt4;
                                break;
                            }
                            else {
                                rdmMath = rdm.nextInt(5);
                            }
                        case 4:                                         //5th case for if all rdmInt's = 0, then / 2 ~
                            System.out.println(" / 2");
                            rdmSolution = rdmSolution / 2;
                            break;
                    }
                    System.out.println("Write your solution:");
                    userMath = scnr.nextDouble();
                    if (rdmSolution == 0.0) {
                        answer = Math.abs(rdmSolution);     //prevent -0.0 tested against user answer; discovered, unnecessary ~
                    }
                    else {
                        answer = rdmSolution;
                    }
                }
                rdmResponses = rdm.nextInt(4);      //determines random responses ~
                switch (rdmResponses) {
                    case 0:
                        right = "Very good!";
                        wrong = "No. Please try again.";
                        break;
                    case 1:
                        right = "Excellent!";
                        wrong = "Wrong. Try once more.";
                        break;
                    case 2:
                        right = "Nice work!";
                        wrong = "Don't give up!";
                        break;
                    case 3:
                        right = "Keep up the good work!";
                        wrong = "No. Keep trying.";
                        break;
                }
                userDivisionTest = Math.abs(userMath - answer);
                if ((userMath == answer) || (userDivisionTest < 0.001)) { //query, right answer?, fixed uMD = aD
                    System.out.println(right);
                    numRight = numRight + 1;            //compares user input to solution ~
                }
                else {
                    System.out.println(wrong);
                    numWrong = numWrong + 1;
                }
            }
            score = (double)(numRight) / 10.0;
            score = score * 100.0;                      //creates % correct from average ~
            System.out.println("Incorrect: " + numWrong + ", Correct: " + numRight + ", Score: " + score + "%");
            if(score < 75.0) {
                System.out.println("Please ask your teacher for extra help.");
            }                                           //determines pass/fail ~
            else if(score >= 75.0) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            score = 0;
            numRight = 0;
            numWrong = 0;                   //ensures data is cleared before next student begins ~
        }
    }
}
