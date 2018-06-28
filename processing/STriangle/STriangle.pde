
//void setup() {
  
//  size (600, 600);
//  background (255, 255, 255);
//  rectMode(CENTER);
  
//  fractureSquare( width/2, height/2, 200, 200);
  
  
//}

//void fractureSquare(int x, int y, int w, int h) {
  
//  //BIG RECTANGLE
//  fill((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
//  rect( x, y, w, h);
  
//  //FRACTURE!
//  if(w/3 > 2) {
//  fractureSquare(x - w/2, y - h/2, w/2, h/2);
//  fractureSquare(x + w/2, y - h/2, w/2, h/2);
//  fractureSquare(x - w/2, y + h/2, w/2, h/2);
//  fractureSquare(x + w/2, y + h/2, w/2, h/2);
  
//  }
//}  



void setup() {
 
  size(600, 600);
  background (255, 255, 255);
  
  fractureTriangle( width/2, 0, width);
  
  int sideLength = width;
  int h = (int) Math.sqrt((sideLength)*(sideLength) - (sideLength/2)*(sideLength/2));
  
  fractureTriangle ( 
  (sideLength/2), 0, sideLength
  );
  
}

void fractureTriangle(int x, int y, int sideLength) {
  
  int h = (int) Math.sqrt((sideLength)*(sideLength) - (sideLength/2)*(sideLength/2));
  


  //FRACTURE!
  if (sideLength > 1) {
    int newH = (int) Math.sqrt((sideLength/2.0)*(sideLength/2.0) - (sideLength/4.0)*(sideLength/4.0));
    
    //TOP CENTRE
    fractureTriangle( x, y, sideLength/2);
    
    //BOTTOM LEFT
    fractureTriangle( x-(sideLength/4), y+newH, sideLength/2);
    
    //BOTTOM RIGHT
    fractureTriangle( x+(sideLength/4), y+newH, sideLength/2);
    
  }  
  else {
       triangle ( 
    x, y, //TOP, CENTRE
    x - (sideLength/2), y+h, // BOTTOM, LEFT
    x + (sideLength/2), y+h   // BOTTOM, RIGHT
    ); 
  }
  
}