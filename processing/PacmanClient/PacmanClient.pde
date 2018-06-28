Pacman p;
Ghost inky;
Ghost blinky;
Ghost pinky;
Ghost clyde;

void setup() {
  size(600, 600);
  p = new Pacman();
  inky = new Ghost();
  blinky = new Ghost();
  pinky = new Ghost();
  clyde = new Ghost();
}

void draw() {
  
  clear();
  
  p.draw();
  //if (p.getXLocation() < width - 40 ) {
  //  p.move( Pacman.DIRECTION_RIGHT );
  //}
  //if (p.getYLocation() < height - 40  ) {
  //  p.move(Pacman.DIRECTION_DOWN);
  //}
  
  
  inky.draw(234,130,229);
  if (inky.getXLocation() < width - 40) {
      inky.move(Ghost.DIRECTION_RIGHT);
  }
  else if (inky.getXLocation() >= width - 40) {
    inky.move(Ghost.DIRECTION_LEFT);
  }
  if (inky.getXLocation() <= 0) {
      inky.move(Ghost.DIRECTION_RIGHT);
  }
  //else if (inky.getXLocation() > 0) {
  //    inky.move(Ghost.DIRECTION_LEFT);
  //}
  
  
  
  blinky.draw(70,191,238);
  pinky.draw(208,62,25);
  clyde. draw(219,133,28);
  
}  
