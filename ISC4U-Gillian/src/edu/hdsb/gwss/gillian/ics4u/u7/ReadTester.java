/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

/**
 *
 * @author 1johnsongil1
 */
public class ReadTester {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        RandomAccessFile raf = new RandomAccessFile( "album_info.txt","rw" );
        
        int id = 1;
        long filePointer = (id - 1) * AlbumRecord.RECORD_SIZE;
        
        raf.seek(filePointer);
        AlbumRecord ar = new AlbumRecord();
        
        for (int x = 0; x < raf.length() / ar.RECORD_SIZE; x++) {
            
            System.out.println("************************************************");
            char singerName[] = new char[ar.SINGER_LENGTH];
            for (int i = 0; i < ar.SINGER_LENGTH; i++) {
                singerName[i] = raf.readChar();
            }
            ar.setSingerName(new String(singerName));
            System.out.println(ar.getSingerName());

            char albumName[] = new char[ar.ALBUM_LENGTH];
            for (int i = 0; i < ar.ALBUM_LENGTH; i++) {
                albumName[i] = raf.readChar();
            }

            ar.setAlbumName(new String(albumName));
            System.out.println(ar.getAlbumName());

            ar.setNumberOfSongs(raf.readInt());
            System.out.println(ar.getNumberOfSongs());

            ar.setYearOfRelease(raf.readInt());
            System.out.println(ar.getYearOfRelease());

            ar.setPercentageEarned(raf.readDouble());
            System.out.println(ar.getPercentageEarned());

            ar.setMiddleInitial(raf.readChar());
            System.out.println(ar.getMiddleInitial());

            ar.setIsRapper(raf.readBoolean());
            System.out.println(ar.isRapper());
            
            System.out.println("************************************************");
            System.out.println(" ");
        }
        
    }
    
}
