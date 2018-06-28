/*
 * Mountain Paths - Greedy Algorithm
 * Mr. Muir
 * 2018.03.26 - v1.0
 */
package edu.hdsb.gwss.gillian.ics4u.u3;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MountainPaths {

    /**
     * Mount Paths
     */
    public static void main( String[] args ) throws Exception {

        // ***********************************
        // TASK 1:  read data into a 2D Array
        // 
        System.out.println( "TASK 1: READ DATA" );
        int[][] data = read( "Colorado.844x480.dat" );

//        // ***********************************
//        // Construct DrawingPanel, and get its Graphics context
//        //
        DrawingPanel panel = new DrawingPanel( data[0].length, data.length );
        Graphics g = panel.getGraphics();
//
//        // ***********************************
//        // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
//        //
        System.out.println( "TASK 2: HIGHEST / LOWEST ELEVATION" );
        int min = findMinValue( data );
        System.out.println( "\tMin: " + min );

        int max = findMaxValue( data );
        System.out.println( "\tMax: " + max );
//
//        // ***********************************
//        // TASK 3:  Draw The Map
//        //
        System.out.println( "TASK 3: DRAW MAP" );
        drawMap( g, data );
//
//        // ***********************************
//        // TASK 4A:  implement indexOfMinInCol
//        //
        System.out.println( "TASK 4A: INDEX OF MIN IN COL 0" );
        int minRow = indexOfMinInCol( data, 0 );
        System.out.println( "\tRow with lowest Col 0 Value: " + minRow );
//
//        // ***********************************
//        // TASK 4B:  use minRow as starting point to draw path
//        //
        System.out.println( "TASK 4B: PATH from LOWEST STARTING ELEVATION" );
        g.setColor( Color.RED );
        int totalChange = drawLowestElevPath( g, data, minRow, 0 ); //
        System.out.println( "\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange );
//
//        // ***********************************
//        // TASK 5:  determine the BEST path
//        //
        g.setColor( Color.RED );
        int bestRow = indexOfLowestElevPath( g, data );
//
//        // ***********************************
//        // TASK 6:  draw the best path
//        //
        System.out.println( "TASK 6: DRAW BEST PATH" );
        // //use this to get rid of all red lines
        g.setColor( Color.GREEN ); //set brush to green for drawing best path
        totalChange = drawLowestElevPath( g, data, bestRow, 0 );
        System.out.println( "\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange );

    }

    /**
     * This method reads a 2D data set from the specified file. The Graphics'
     * industry standard is width by height (width x height), while programmers
     * use rows x cols / (height x width).
     *
     * @param fileName the name of the file
     * @return a 2D array (rows x cols) of the data from the file read
     */
    public static int[][] read( String fileName ) {
        try {

            File file = new File( ".\\data\\mountain.paths" + fileName );
            
            Scanner input = new Scanner( file );
            
            StringTokenizer st = new StringTokenizer(input.nextLine());
            int col = st.countTokens();
            int row = 1;
            
            //COME BACK TO!!
            while (input.hasNextLine()) {
                row++;
                input.nextLine();
            }
            
            input = new Scanner( file );
            int[][] data = new int[row][col];
            
            for (int r = 0; r < data.length; r++) {
                StringTokenizer st2 = new StringTokenizer(input.nextLine());
                for (int c = 0; c < data[r].length; c++) {
                    data[r][c] = Integer.parseInt(st2.nextToken());
                }
            }
            return data;

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MountainPaths.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @param grid a 2D array from which you want to find the smallest value
     * @return the smallest value in the given 2D array
     */
    public static int findMinValue( int[][] grid ) {
        int minValue = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y < grid[i].length; y++) {
                if (grid[i][y] < minValue) {
                    minValue = grid[i][y];
                }
            }
        }
        return minValue;

    }

    /**
     * @param grid a 2D array from which you want to find the largest value
     * @return the largest value in the given 2D array
     */
    public static int findMaxValue( int[][] grid ) {

        int maxValue = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y < grid[i].length; y++) {
                if (grid[i][y] > maxValue) {
                    maxValue = grid[i][y];
                }
            }
        }
        return maxValue;

    }

    /**
     * Given a 2D array of elevation data create a image of size rows x cols,
     * drawing a 1x1 rectangle for each value in the array whose color is set to
     * a a scaled gray value (0-255). Note: to scale the values in the array to
     * 0-255 you must find the min and max values in the original data first.
     *
     * @param g a Graphics context to use
     * @param grid a 2D array of the data
     */
    public static void drawMap( Graphics g, int[][] data ) {
        int min = findMinValue(data);
        int max = findMaxValue(data);
        double difference = (max - min);
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data[x].length; y++) {
                double c = (data[x][y]-min)*(255/difference);
                int color = (int) c;
                g.setColor(new Color(color, color, color));
                g.fillRect(y,x,1,1);
            }
        }
        
    }

    /**
     * Scan a single column of a 2D array and return the index of the row that
     * contains the smallest value
     *
     * @param grid a 2D array
     * @col the column in the 2D array to process
     * @return the index of smallest value from grid at the given col
     */
    public static int indexOfMinInCol( int[][] grid, int col ) {
        
        int minValue = grid[0][0];
        int row = 0;
        
        for(int r = 0; r < grid.length; r++) {
            if (minValue > grid[r][col]) {
                minValue = grid[r][col];
                row = r;
            }
        }
        return row;
    }

    /**
     * Find the minimum elevation-change route from West-to-East in the given
     * grid, from the given starting row, and draw it using the given graphics
     * context
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @param row - the starting row for traversing to find the min path
     * @return total elevation of the route
     */
    public static int drawLowestElevPath(Graphics g, int[][] data, int row, int col) {

        //VARIABLES
        int totalElevationChange = 0;
        int upDiagonal, downDiagonal, straight;
        int random = (int) (Math.random() * 2) + 1;

        // BASE CASE!  You are in the last COL!  No where to move!
        if (col == data[row].length - 1) {
            return 0;
        }

        //CHOOSING PATH
        if (row == 0) {
            upDiagonal = Integer.MAX_VALUE;
            downDiagonal = Math.abs(data[row][col] - data[row + 1][col + 1]);
        } else if (row == data.length - 1) {
            downDiagonal = Integer.MAX_VALUE;
            upDiagonal = Math.abs(data[row][col] - data[row - 1][col + 1]);
        } else {
            upDiagonal = Math.abs(data[row][col] - data[row - 1][col + 1]);
            downDiagonal = Math.abs(data[row][col] - data[row + 1][col + 1]);
        }
        straight = Math.abs(data[row][col] - data[row][col + 1]);
        
        
        if (straight <= upDiagonal && straight <= downDiagonal) {
            g.fillRect(col + 1, row, 1, 1);
            totalElevationChange = straight + drawLowestElevPath(g, data, row, col + 1);
        } else if (upDiagonal < straight && upDiagonal < downDiagonal) {
            totalElevationChange += straight;
            g.fillRect(col + 1, row - 1, 1, 1);
            totalElevationChange = upDiagonal + drawLowestElevPath(g, data, row - 1, col + 1);
        } else if (downDiagonal < upDiagonal && downDiagonal < straight) {
            g.fillRect(col + 1, row + 1, 1, 1);
            totalElevationChange = downDiagonal + drawLowestElevPath(g, data, row + 1, col + 1);
        } else if (upDiagonal == downDiagonal) {
            if (random == 1) {
                totalElevationChange += upDiagonal;
                g.fillRect(col + 1, row - 1, 1, 1);
                totalElevationChange = upDiagonal + drawLowestElevPath(g, data, row - 1, col + 1);
            } else {
                totalElevationChange += downDiagonal;
                g.fillRect(col + 1, row + 1, 1, 1);
                totalElevationChange = downDiagonal + drawLowestElevPath(g, data, row + 1, col + 1);
            }
        }

        return totalElevationChange;
    }

    /**
     * Generate all west-to-east paths, find the one with the lowest total
     * elevation change, and return the index of the row that path starts on.
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @return the index of the row where the lowest elevation-change path
     * starts.
     */
    public static int indexOfLowestElevPath( Graphics g, int[][] data ) {

        int row = 1;
        int col = 0;
        int minElevation = drawLowestElevPath(g, data, 0, col);
        int elevationChange;
        int minRow = 0;
        
        while (row < data.length) {
            elevationChange = drawLowestElevPath(g, data, row, col);
            if (elevationChange < minElevation) {
                minRow = row;
                minElevation = elevationChange;
            }
            row++;
        }
        return minRow;
    }

}
