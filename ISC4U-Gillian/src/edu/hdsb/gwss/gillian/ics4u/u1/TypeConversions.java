/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u1;

/**
 *
 * @author 1johnsongil1
 */
public class TypeConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FROM BOOLEAN TO:

        //CHAR
        // N/A
        //INT
        // N/A
        //LONG
//        boolean x = true;
//        long x1 = (long) x;
        // N/A
        //DOUBLE
//        boolean x = true;
//        double x1 = (double) x;
        // N/A
        //STRING
        boolean x = true;
        String x1 = Boolean.toString(x);

        //FROM CHAR TO:
        //BOOLEAN
//       char x2 = 'A';
//       boolean x3 = (boolean) x2;
        // N/A
        //INT
        char x2 = 'A';
        int x3 = (int) x2;

        //LONG
        char x4 = 'A';
        long x5 = (long) x4;

        //DOUBLE
        char x6 = 'A';
        double x7 = (double) x6;

        //STRING
        char x8 = 'A';
        String x9 = "" + x8;

        //FROM INT TO:
        //BOOLEAN
//       int y = 5;
//       boolean y1 = (boolean) y;
        // N/A
        //CHAR
        int y = 5;
        char y1 = (char) y;

        //LONG
        int y2 = 5;
        long y3 = (long) y2;

        //DOUBLE
        int y4 = 5;
        double y5 = (double) y4;

        //STRING
        int y6 = 5;
        String y7 = Integer.toString(y6);

        //FROM LONG TO:
        //BOOLEAN
//       long z = 12345;
//       boolean z1 = (boolean) z;
        // N/A
        //CHAR
        long z = 12345;
        char z1 = (char) z;

        //INT
        long z2 = 12345;
        long z3 = (long) z2;

        //DOUBLE
        long z4 = 12345;
        double z5 = (double) z4;

        //STRING
        long z6 = 12345;
        String z7 = Long.toString(z6);

        //FROM DOUBLE TO:
        //BOOLEAN
//       double s = 1.5;
//       boolean s1 = (boolean) s;
        // N/A
        //CHAR
        double s = 1.5;
        char s1 = (char) s;

        //INT
        double s2 = 1.5;
        long s3 = (long) s2;

        //LONG
        double s4 = 1.5;
        double s5 = (double) s4;

        //STRING
        double s6 = 1.5;
        String s7 = Double.toString(s6);

        //FROM STRING TO:
        //BOOLEAN
        String d = "true";
        boolean d1 = Boolean.parseBoolean(d);

        //CHAR
        String d2 = "true";

        //INT
        String d4 = "true";

        //LONG
        String d6 = "true";

        //DOUBLE
        String d8 = "true";

    }

}
