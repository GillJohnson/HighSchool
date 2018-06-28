/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

import java.util.Objects;

/**
 *
 * @author Gill_Johnson
 */
public final class AlbumRecord {
    
    protected static final int RECORD_SIZE = 89;
    
    private int id = -1;
    protected final int SINGER_LENGTH = 15;
    protected final int ALBUM_LENGTH = 20;
    protected final int SONGS_LENGTH = 1;
    protected final int YEAR_LENGTH = 1;
    protected final int EARNINGS_LENGTH = 1;
    protected final int INITIAL_LENGTH = 1;
    protected final int RAPPER_LENGTH = 1;
    
    private String singerName; 
    private String albumName; 
    private int numberOfSongs;
    private int yearOfRelease;
    private double percentageEarned;
    private char middleInitial;
    private boolean isRapper;
    

    public AlbumRecord() {
        numberOfSongs = -1;
        yearOfRelease = -1;
        percentageEarned = -1.0;
    }
    
    
    
    public AlbumRecord( String singerName, String albumName, int numberOfSongs, int yearOfRelease, double percentageEarned, char middleInitial, boolean isRapper) {
    
        setSingerName(singerName);
        setAlbumName(albumName);
        setNumberOfSongs(numberOfSongs);
        setYearOfRelease(yearOfRelease);
        setPercentageEarned(percentageEarned);
        setMiddleInitial(middleInitial);
        setIsRapper(isRapper);
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getPercentageEarned() {
        return percentageEarned;
    }

    public void setPercentageEarned(double percentageEarned) {
        this.percentageEarned = percentageEarned;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public boolean isRapper() {
        return isRapper;
    }

    public void setIsRapper(boolean isRapper) {
        this.isRapper = isRapper;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        StringBuilder temp = new StringBuilder();

        if ( singerName != null ) {
            temp.append( singerName.trim() );
        } else {
            temp.append( "Unknown" );
        }
        // trucates or pads the string
        temp.setLength( SINGER_LENGTH );
        this.singerName = temp.toString();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        StringBuilder temp2 = new StringBuilder();

        if ( albumName != null ) {
            temp2.append( albumName.trim() );
        } else {
            temp2.append( "Unknown" );
        }
        // trucates or pads the string
        temp2.setLength( ALBUM_LENGTH );
        this.albumName = temp2.toString();
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }
    
    public boolean isValid() {
        if( this.singerName == null ) return false;
        return true;
    }

    @Override
    public String toString() {
        return "AlbumRecord{" + "singerName=" + singerName + ", albumName=" + albumName + ", numberOfSongs=" + numberOfSongs + ", yearOfRelease=" + yearOfRelease + ", percentageEarned=" + percentageEarned + ", middleInitial=" + middleInitial + ", isRapper=" + isRapper + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlbumRecord other = (AlbumRecord) obj;
        if (this.numberOfSongs != other.numberOfSongs) {
            return false;
        }
        if (this.yearOfRelease != other.yearOfRelease) {
            return false;
        }
        if (Double.doubleToLongBits(this.percentageEarned) != Double.doubleToLongBits(other.percentageEarned)) {
            return false;
        }
        if (this.middleInitial != other.middleInitial) {
            return false;
        }
        if (this.isRapper != other.isRapper) {
            return false;
        }
        if (!Objects.equals(this.singerName, other.singerName)) {
            return false;
        }
        if (!Objects.equals(this.albumName, other.albumName)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
