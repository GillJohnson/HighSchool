/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u7;

/**
 *
 * @author 1johnsongil1
 */
public interface DatabaseInterface {
    
    public void open();

    public void close();

    public AlbumRecord save( AlbumRecord ar );

    public AlbumRecord get( long dbID );
}
