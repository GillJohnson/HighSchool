/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1johnsongil1
 */
public class Merica {

    /**
     * @param args the command line arguments
     */
    
    /*
     * 'Merica
     * 2017-18.S2
     */


    final static String[] FILE_NAMES_ELECTIONS = {
      "USA1960.txt", "USA1964.txt", "USA1968.txt", "USA1972.txt", "USA1976.txt", 
      "USA1980.txt", "USA1984.txt", "USA1988.txt", "USA1992.txt", "USA1996.txt", 
      "USA2000.txt", "USA2004.txt", "USA2008.txt", "USA2012.txt", "USA2016.txt"
    };

    int value;
    String fileName;
    String[][] electionResults;

    /*
     * SETUP; CALLED ONCE @ STARTUP
     */
    void setup() {

      //size( 1200, 600 );

      // DEFAULT MAP
      fileName = FILE_NAMES_ELECTIONS[0];

      // ELECTION RESULTS
      electionResult();

    }

    /*
     * ELECTION RESULTS
     * - parse election file INTO electionResults[][] 2D-Array, or data structure of your choice.
     */
    void electionResult( ) {
      try {

        // ELECTION RESULT DATA
//        Scanner data = new Scanner( new File( dataPath("") + "\\" + fileName ) );
//        String[][] electionResults = new String[50][4];
//        
//        for (int row = 0; row < 50; row++) {
//            StringTokenizer st = new StringTokenizer(data.nextLine());
//            for (int col = 0; col < 4; col++) {
//                electionResults[row][col] = st.nextToken();
//            }
//        }
//
//        data.close();

      }
      catch (Exception e ) {
        e.printStackTrace();
      }
    }

    /*
     * DRAW MAP OFF USA w/ Election Results
     */
    void drawMap() {
      // MAP
      try {

        // USA MAP DATA
//        Scanner data = new Scanner( new File( dataPath("") + "\\USA.txt" ) );
//
//        data.close();
      }
      catch (Exception e ) {
        e.printStackTrace();
      }
    }

    /*
     * Draw State
     */
    void drawState( ) {
    }

    /*
     */
    void keyPressed() {
//      if ( key >= 'a' && key <= ( 'a' + FILE_NAMES_ELECTIONS.length - 1 )  ) {
//        fileName = FILE_NAMES_ELECTIONS[key-'a'];
//        System.out.print( fileName );
//        electionResult();
//      }
    }
    
}
