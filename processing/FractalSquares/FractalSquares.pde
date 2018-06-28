void setup() {
  size(800, 800);
  background(255, 255, 255);
  int fractalWidth = 700;
  
  fractureSquare((height-fractalWidth)/2, (width-fractalWidth)/2, fractalWidth, fractalWidth);
  
}

void fractureSquare(int x, int y, int w, int h) {
  
  //DRAW SQUARE
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+w/4, y, w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+w/2, y, w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x, y+w/4, w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x, y+w/2, w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+w/4, y+(3*w/4), w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+w/2, y+(3*w/4), w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+(3*w/4), y+w/4, w/4, h/4);
  fill((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
  rect(x+(3*w/4), y+w/2, w/4, h/4);
 
  //FRACTURE
  if (w > 20) {
    fractureSquare(x+w/4, y, w/4, h/4);
    fractureSquare(x+w/2, y, w/4, h/4);
    fractureSquare(x, y+w/4, w/4, h/4);
    fractureSquare(x, y+w/2, w/4, h/4);
    fractureSquare(x+w/4, y+(3*w/4), w/4, h/4);
    fractureSquare(x+w/2, y+(3*w/4), w/4, h/4);
    fractureSquare(x+(3*w/4), y+w/4, w/4, h/4);
    fractureSquare(x+(3*w/4), y+w/2, w/4, h/4);
    
  }
}