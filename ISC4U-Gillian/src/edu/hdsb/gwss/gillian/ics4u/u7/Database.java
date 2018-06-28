/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1johnsongil1
 */
public class Database implements DatabaseInterface{

    private boolean isOpen = false;
    RandomAccessFile recordFile;
    private int fileLength = 0;

    public Database() throws FileNotFoundException, IOException {
        this.recordFile = new RandomAccessFile( "album_info.txt","rw" );
    }

    public int getFileLength() {
        return fileLength;
    }
    
    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public AlbumRecord save(AlbumRecord ar) {
        if (isOpen && ar.isValid() ) {
            try {
                //ADDING RECORD
                if (ar.getId() == -1) {
                    recordFile.seek((recordFile.length() / ar.RECORD_SIZE) * ar.RECORD_SIZE);
                    this.writingToFile(ar);
                    ar.setId((int) (recordFile.length()) / ar.RECORD_SIZE);
                    this.fileLength++;
                } 
                
                //UPDATING RECORD
                else {
                    recordFile.seek((ar.getId() - 1) * ar.RECORD_SIZE);
                    this.writingToFile(ar);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ar;
    }

    @Override
    public AlbumRecord get(long dbID) {
        AlbumRecord ar = new AlbumRecord();
        int filePointer = (int) ((dbID - 1) * ar.RECORD_SIZE);
        
        try {
            if (dbID <= fileLength) {
            recordFile.seek( filePointer);
            
            char singerName[] = new char[ar.SINGER_LENGTH];
            for (int i = 0; i < ar.SINGER_LENGTH; i++) {
                singerName[i] = recordFile.readChar();
            }
            ar.setSingerName(new String(singerName));

            char albumName[] = new char[ar.ALBUM_LENGTH];
            for (int i = 0; i < ar.ALBUM_LENGTH; i++) {
                albumName[i] = recordFile.readChar();
            }
            ar.setAlbumName(new String(albumName));

            ar.setNumberOfSongs(recordFile.readInt());
        
            ar.setYearOfRelease(recordFile.readInt());

            ar.setPercentageEarned(recordFile.readDouble());

            ar.setMiddleInitial(recordFile.readChar());

            ar.setIsRapper(recordFile.readBoolean());
            }
        } catch( IOException e ) {
            e.printStackTrace();
        }
        
        return ar;
    }
    
    public void writingToFile(AlbumRecord ar) throws IOException {
        recordFile.writeChars(ar.getSingerName());
        recordFile.writeChars(ar.getAlbumName());
        recordFile.writeInt(ar.getNumberOfSongs());
        recordFile.writeInt(ar.getYearOfRelease());
        recordFile.writeDouble(ar.getPercentageEarned());
        recordFile.writeChar(ar.getMiddleInitial());
        recordFile.writeBoolean(ar.isRapper());
    }
    
    
}
