/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

import java.io.*;
/**
 *
 * @author Gill_Johnson
 */
public class AlbumStore {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
    
        System.out.println("Creating 8 Album Records");
        AlbumRecord a1 = new AlbumRecord("Kanye West", "Graduation", 12, 05, 0.87, 'o', true);
        AlbumRecord a2 = new AlbumRecord("Taylor Swift", "Reputation", 10, 18, 0.76, 'a', false);
        AlbumRecord a3 = new AlbumRecord("Justin Bieber", "Purpose", 9, 17, 0.88, 'd', false);
        AlbumRecord a4 = new AlbumRecord("Beyonce", "Lemonade", 13, 17, 0.90, 'g', false);
        AlbumRecord a5 = new AlbumRecord("Rihanna", "Anti", 7, 02, 0.68, 'r', false);
        AlbumRecord a6 = new AlbumRecord("Maroon 5", "V", 11, 11, 0.82, (char)0, false);
        AlbumRecord a7 = new AlbumRecord("One Direction", "Four", 10, 13, 0.91, (char)0, false);
        AlbumRecord a8 = new AlbumRecord("Kelly Clarkson", "Meaning of Life", 11, 17, 0.56, 'b', false);
        System.out.println("*********************");

        RandomAccessFile recordFile = new RandomAccessFile( "album_info.txt","rw" );
        
        recordFile.seek(0);
        recordFile.writeChars(a1.getSingerName());
        recordFile.writeChars(a1.getAlbumName());
        recordFile.writeInt(a1.getNumberOfSongs());
        recordFile.writeInt(a1.getYearOfRelease());
        recordFile.writeDouble(a1.getPercentageEarned());
        recordFile.writeChar(a1.getMiddleInitial());
        recordFile.writeBoolean(a1.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a2.getSingerName());
        recordFile.writeChars(a2.getAlbumName());
        recordFile.writeInt(a2.getNumberOfSongs());
        recordFile.writeInt(a2.getYearOfRelease());
        recordFile.writeDouble(a2.getPercentageEarned());
        recordFile.writeChar(a2.getMiddleInitial());
        recordFile.writeBoolean(a2.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a3.getSingerName());
        recordFile.writeChars(a3.getAlbumName());
        recordFile.writeInt(a3.getNumberOfSongs());
        recordFile.writeInt(a3.getYearOfRelease());
        recordFile.writeDouble(a3.getPercentageEarned());
        recordFile.writeChar(a3.getMiddleInitial());
        recordFile.writeBoolean(a3.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a4.getSingerName());
        recordFile.writeChars(a4.getAlbumName());
        recordFile.writeInt(a4.getNumberOfSongs());
        recordFile.writeInt(a4.getYearOfRelease());
        recordFile.writeDouble(a4.getPercentageEarned());
        recordFile.writeChar(a4.getMiddleInitial());
        recordFile.writeBoolean(a4.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a5.getSingerName());
        recordFile.writeChars(a5.getAlbumName());
        recordFile.writeInt(a5.getNumberOfSongs());
        recordFile.writeInt(a5.getYearOfRelease());
        recordFile.writeDouble(a5.getPercentageEarned());
        recordFile.writeChar(a5.getMiddleInitial());
        recordFile.writeBoolean(a5.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a6.getSingerName());
        recordFile.writeChars(a6.getAlbumName());
        recordFile.writeInt(a6.getNumberOfSongs());
        recordFile.writeInt(a6.getYearOfRelease());
        recordFile.writeDouble(a6.getPercentageEarned());
        recordFile.writeChar(a6.getMiddleInitial());
        recordFile.writeBoolean(a6.isRapper());
        System.out.println( recordFile.length() );
        
        recordFile.writeChars(a7.getSingerName());
        recordFile.writeChars(a7.getAlbumName());
        recordFile.writeInt(a7.getNumberOfSongs());
        recordFile.writeInt(a7.getYearOfRelease());
        recordFile.writeDouble(a7.getPercentageEarned());
        recordFile.writeChar(a7.getMiddleInitial());
        recordFile.writeBoolean(a7.isRapper());
        System.out.println( recordFile.length() );
        
        
        recordFile.writeChars(a8.getSingerName());
        recordFile.writeChars(a8.getAlbumName());
        recordFile.writeInt(a8.getNumberOfSongs());
        recordFile.writeInt(a8.getYearOfRelease());
        recordFile.writeDouble(a8.getPercentageEarned());
        recordFile.writeChar(a8.getMiddleInitial());
        recordFile.writeBoolean(a8.isRapper());
        System.out.println( recordFile.length() );
    }
    
    
}
