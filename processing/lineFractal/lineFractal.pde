


void setup() {
  
   size( 600, 600 );
   
   line(width / 2,  height-10,  width / 2,  height-100  );
   fractlLine( width / 2,  height-100, 400 );
  
}

void fractlLine( int x, int y, int len ) {
  
    
    // TRUNK
    //line( x,  y,  x, y-len  );
    
    // LEFT BRANCH
    line( x,  y,  x-len/2, y-len/2  );
    
    // LEFT BRANCH
    line( x,  y,  x+len/2, y-len/2  );
    
    if( len > 5 ) {
      fractlLine( x-len/2, y-len/2, len / 2 );
      fractlLine(  x+len/2, y-len/2, len / 2 );
    }
  
}