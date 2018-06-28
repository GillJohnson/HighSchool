/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author 1johnsongil1
 */
public class DatabaseClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File( "album_info.txt" );
        file.delete();
        
        Database db = new Database();
        AlbumRecord ar = new AlbumRecord();
        AlbumRecord a1 = new AlbumRecord("Kanye West", "Graduation", 12, 05, 0.87, 'o', true);
        AlbumRecord a2 = new AlbumRecord("Taylor Swift", "Reputation", 10, 18, 0.76, 'a', false);
        
        //TEST #1 - INVALID ALBUM
        db.open();
        db.save(ar);
        assert(db.getFileLength() == 0);
        db.close();
        
        
        // TEST #2 - UNOPENED FILE
        db.save(a1);
        assert(db.getFileLength() == 0);
        
        
        //TEST #3 - OPENED FILE
        db.open();
        db.save(a1);
        //assert(db.get(1).equals(a1));
        assert(db.getFileLength() == 1);
        
            //ALBUM ALREADY EXISTS IN FILE
            db.save(a1);
            assert(db.getFileLength() == 1);

            //ABLBUM DOES NOT EXIST IN FILE
            db.save(a2);
            assert(db.getFileLength() == 2);
            db.close();
        
            
        //TEST #4 - GET ALBUM FROM ID
        
            //ID DOES NOT EXIST
            db.get(3);
            System.out.println(db.get(3).toString());

            //ID DOES EXIST
            System.out.println(db.get(2).toString());
            assert(db.get(2).equals(a2));
            
        
    }
    
}
