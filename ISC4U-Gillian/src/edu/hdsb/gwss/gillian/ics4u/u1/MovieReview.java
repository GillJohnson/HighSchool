/*
 * Name: Gillian Johnson
 * Date: February 20, 2018
 * Version: 1.0
 * Description: Determines different score configurations based on methods chosen through user input.
 */
package edu.hdsb.gwss.gillian.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Movie Review Assignment
 *
 * @author Gillian Johnson
 * @version 2017-18.S2
 */
public class MovieReview {
    
    public static void main( String[] args ) throws Exception {

        //OBJECT
        Scanner input = new Scanner(System.in);
        
        //VARIABLES
        int taskNumber;
        int loop = 0;
        String keyWord;
        String file;
        
        // MOVIE REVIEW FILE
        File reviews = new File(".\\data\\movie.review\\MovieReviews.txt");
        
        while (loop == 0) {
            
            //MENU
        System.out.print("\nWhat would you like to know?\n 1: The score of the word\n 2: Average score of words in a file (one word per line)\n 3: The highest/lowest scoring words in a file\n 4: The words sorted into positive.txt and negative.txt\n 5: Exit the program\n Enter the task number: ");
        taskNumber = input.nextInt();
        input.nextLine();
        
            switch (taskNumber) {
                case 1:
                    System.out.println("\nEnter the word: ");
                    keyWord = input.nextLine();
                    System.out.println(keyWord + " appears: " + wordCount(keyWord, reviews) + " times");
                    System.out.println("The score of the word: " + wordAverage(keyWord, reviews));
                    break;
                case 2:
                    System.out.println("\nEnter the name of file to find the average score of all words: ");
                    String fileName = input.nextLine();
                    File wordList = new File( ".\\data\\movie.review\\" + fileName);
                    System.out.println("The average score of words: " + sentenceAverage(wordList, reviews));
                    if (sentenceAverage(wordList, reviews) > 2.01) {
                        System.out.println("The overall sentiment is positive");
                    }
                    else if (sentenceAverage(wordList, reviews) < 1.99) {
                        System.out.println("The overall sentiment is negative");
                    }
                    break;
                case 3:
                    System.out.println("\nEnter the name of file to find the highest/lowest word by their score: ");
                    String fileName2 = input.nextLine();
                    File wordList2 = new File( ".\\data\\movie.review\\" + fileName2);
                    System.out.println("The most positive word: " + wordOrder(wordList2, reviews)[0]);
                    System.out.println("Score: " + wordAverage(wordOrder(wordList2, reviews)[0], reviews));
                    System.out.println("The most negative word: " + wordOrder(wordList2, reviews)[1]);
                    System.out.println("Score: " + wordAverage(wordOrder(wordList2, reviews)[1], reviews));
                    break;
                case 4:
                    System.out.println("\nEnter the name of file to sort words into two files; positive.txt and negative.txt");
                    String fileName3 = input.nextLine();
                    File wordList3 = new File( ".\\data\\movie.review\\" + fileName3);
                    
                    wordOrder(wordList3, reviews);
                    break;
                case 5:
                    loop = 1;
                    break;
                default:
                    System.out.println("\nPlease enter a VALID number.");
                    break;
            }
        }
        
       
    }

    /**
     * This method will count the number of reviews that contain the key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the number of reviews that contain the key work at least once.
     */
    public static double wordCount( String word, File reviews ) throws Exception {
       
       //TOTAL WORD COUNT
       double[] wordTotal = wordCalculator(word, reviews); 
       return wordTotal[0];
       
    }

    /**
     * This method will accumulate the the movie review scores that contain the
     * key word.
     *
     * @param word the key word the review must contain.
     * @param reviews the file that contains the movie reviews.
     * @return the sum of the scores for reviews that contain the key work at
     * least once.
     */
    public static double wordTotalScore( String word, File reviews ) throws Exception {
        
        //TOTAL WORD RATING
        double[] ratingTotal = wordCalculator(word, reviews);
        return ratingTotal[1];
    }

    /**
     * Average score of reviews containing that word, given the specified file.
     *
     * @param word the key word the review must contain.
     * @param reviews reviews the file that contains the movie reviews.
     * @return the average score for the key word. Word Total Score / Word Count
     */
    public static double wordAverage( String word, File reviews ) throws Exception {
       
       //CALCULATION
       double[] wordCalculator = wordCalculator(word, reviews);
       double wordAverage = (wordCalculator[1] / (wordCalculator[0]));
       
       return wordAverage;
       
    }

    /**
     * This method returns the average movie review score of the words in the
     * file, given th specified movie review file.
     */
    public static double sentenceAverage( File wordList, File reviews ) throws Exception {
        
        //OBJECTS
        Scanner input = new Scanner(wordList);
        
        //VARIABLES
        double totalRatings = 0;
        double lineTotalCount;
        double sentenceAverage;
        double totalCount = 0;
        
        //CALCULATIONS
        while (input.hasNextLine()) {
            String line = input.nextLine();
            double[] sentenceCalculator = wordCalculator(line, reviews);
            lineTotalCount = sentenceCalculator[0];
            
            if (lineTotalCount > 0) {
                totalRatings += sentenceCalculator[1];
                totalCount += lineTotalCount;
            }
           
        }

        sentenceAverage = totalRatings / totalCount;
        
        return sentenceAverage;

    }

    
    public static double[] wordCalculator(String word, File reviews) throws FileNotFoundException {
        //OBJECT
        Scanner input = new Scanner(reviews);
        
        //VARIABLES
        int count = 0;
        int totalRatings = 0;
        int rating;
        String line;
        
        //READ LINES
        while (input.hasNextLine()) {
            rating = input.nextInt();
            line = input.nextLine();
            line = line.toLowerCase();
            if (line.contains(" " + word.toLowerCase() + " ")) {
                
                //RETRIEVE RATING
                totalRatings += rating;
                
                count++;

            }
        }
        
        return new double[] {count, totalRatings};
    }
    
    public static String[] wordOrder(File wordList, File reviews) throws FileNotFoundException {
        
        //OBJECTS
        Scanner input = new Scanner(wordList);
        
        //CREATE FILES
        File positive = new File("positive.txt");
        PrintWriter outputPositive = new PrintWriter(positive);
        File negative = new File("negative.txt");
        PrintWriter outputNegative = new PrintWriter(negative);
        
        //VARIABLES
        double lineTotalRatings;
        double lineTotalCount;
        double positiveWordScore = 0;
        double negativeWordScore = Double.MAX_VALUE;
        String positiveWord = null;
        String negativeWord = null;
        
        //FINDING HIGHEST AND LOWEST WORD
        while (input.hasNextLine()) {
            String line = input.nextLine();
            double[] sentenceCalculator = wordCalculator(line, reviews);
            lineTotalCount = sentenceCalculator[0];
            lineTotalRatings = sentenceCalculator[1];

            if ((lineTotalRatings / lineTotalCount) > positiveWordScore) {
                positiveWord = line;
                positiveWordScore = lineTotalRatings / lineTotalCount;
            }
            if ((lineTotalRatings / lineTotalCount) < negativeWordScore) {
                negativeWord = line;
                negativeWordScore = lineTotalRatings / lineTotalCount;

            }
            
            //WRITING TO FILE
            if ((lineTotalRatings / lineTotalCount) > 2.1) {
                outputPositive.println(line);
            }
            else if ((lineTotalRatings / lineTotalCount) < 1.9) {
                outputNegative.println(line);
            }
                       
        }
        
        //CLOSING FILES
        outputPositive.close();
        outputNegative.close();
        
            
        return new String[] {positiveWord, negativeWord};
    }
    
}
