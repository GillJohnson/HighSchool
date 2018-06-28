/*
 *
 */
package edu.hdsb.gwss.gillian.ics4u.u1;

import java.io.File;

/**
 * Movie Review Assignment
 *
 * @author 
 * @version 2017-18.S2
 */
public class MovieReviewTester {

    public static void main( String[] args ) throws Exception {

        String word;

        // MOVIE REVIEW FILE
        File reviews = new File( ".\\data\\movie.review\\example.txt" );

        // ********************************************************************
        // PART 1: Word Review
        word = "fantastic";
        System.out.println( "********************************" );
        System.out.println( "PART 1: Word Review - " + word );

        double wordCount = MovieReview.wordCount( word, reviews );
        double wordAverage = MovieReview.wordAverage( word, reviews );

        System.out.println( "Word Count     : " + wordCount );
        System.out.println( "Word Average   : " + wordAverage );
        assert (wordCount == 13);
        assert (wordAverage == 2.8461538461538463);
        
    }

}
