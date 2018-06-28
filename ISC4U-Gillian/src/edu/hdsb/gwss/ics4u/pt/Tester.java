package edu.hdsb.gwss.ics4u.pt;

/**
 * Open Hash Table Tester
 *
 * @version v2016.S2
 */
public class Tester {

    /**
     */
    public static void main( String[] args ) {

        CSStudent studentAA1 = new CSStudent( "Arielle", "A", 11, 11 );
        CSStudent studentAA2 = new CSStudent( "Ali", "A", 22, 12 );
        CSStudent studentJB = new CSStudent( "James", "B", 2332, 12 );
        CSStudent studentRD = new CSStudent( "Raidi", "D", 1443, 12 );
        CSStudent studentAE = new CSStudent( "Ahmad", "E", 2554, 12 );
        CSStudent studentJG = new CSStudent( "Gillian", "J", 6665, 12 );
        CSStudent studentYK = new CSStudent( "Yulia", "K", 7976, 12 );
        CSStudent studentRL = new CSStudent( "Ryan", "L", 8387, 12 );
        CSStudent studentRM = new CSStudent( "Ruiling", "M", 9098, 11 );
        CSStudent studentYM = new CSStudent( "Youssef", "M", 1120, 12 );
        CSStudent studentFS = new CSStudent( "Faisal", "S", 2231, 12 );
        CSStudent studentKSE = new CSStudent( "Karim", "SE", 8695, 12 );
        CSStudent studentMS = new CSStudent( "Matthew", "S", 3695, 12 );
        CSStudent studentCW = new CSStudent( "Christiana", "W", 2691, 12 );
        CSStudent studentEX = new CSStudent( "Ellie", "X", 1234, 11 );
        CSStudent studentIY = new CSStudent( "Irmak", "Y", 1234, 12 );
        
        OpenHashTable ht = new OpenHashTable();
        assert(ht.size() == 0);
        assert(ht.isEmpty());
        assert(ht.capacity() == Integer.MAX_VALUE);
        assert(!ht.containsKey(0));
        assert(ht.get(0) == null);
        ht.put(studentAA1);
        System.out.println( ht.toString() );
        
        assert(ht.size() == 1);
        assert(!ht.isEmpty());
        assert(ht.capacity() == Integer.MAX_VALUE);
        assert(ht.containsKey(studentAA1.getKey()));
        assert(ht.get(studentAA1.getKey()).equals(studentAA1));
        System.out.println( ht.toString() );
        
        ht.put(studentAA2);
        System.out.println( ht.toString() );
        
        ht.put(studentJB);
        System.out.println( ht.toString() );
        
        ht.put(studentRD);
        System.out.println( ht.toString() );
        
        ht.put(studentAE);
        System.out.println( ht.toString() );
        
        ht.put(studentJG);
        System.out.println( ht.toString() );
        
        ht.put(studentYK);
        System.out.println( ht.toString() );
        
        ht.put(studentRL);
        System.out.println( ht.toString() );
        
        ht.put(studentRM);
        System.out.println( ht.toString() );
        
        ht.put(studentYM);
        System.out.println( ht.toString() );
        
        ht.put(studentFS);
        System.out.println( ht.toString() );
        
        ht.put(studentKSE);
        System.out.println( ht.toString() );
        
        ht.put(studentMS);
        System.out.println( ht.toString() );
        
        ht.put(studentCW);
        System.out.println( ht.toString() );
        
        ht.put(studentEX);
        System.out.println( ht.toString() );
        
        ht.put(studentIY);
        System.out.println( ht.toString() );

    }

}
