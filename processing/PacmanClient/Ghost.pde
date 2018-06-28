public class Ghost {

  //CLASS CONSTANTS
  private static final int STEP_SIZE = 10;
  private static final int DIRECTION_UP = 0;
  private static final int DIRECTION_RIGHT = 1;
  private static final int DIRECTION_DOWN = 2;
  private static final int DIRECTION_LEFT = 3;

  //CLASS VARIABLES
  
  //OBJECT VARIABLES
  int xLoc = 12;
  int yLoc = 13;

  //Three constructors: Empty, Primary Key, Secondary Key
  public Ghost() {
    this.xLoc = (int)(Math.random() * width);
    this.yLoc = (int)(Math.random() * height);
  }


  //Getters / Setters
  public int getXLocation() {
    return this.xLoc;
  }
  public int getYLocation() {
    return this.yLoc;  
  }

  //verbs; things you can do to your class/object

  //toString()

  //.equals()

  public void draw(int color1, int color2, int color3) {
    
      fill(color1, color2, color3);
      rect(xLoc, yLoc, 30, 30);
      noStroke();
      fill(color1, color2, color3);
      ellipse(xLoc + 15, yLoc, 30, 30);}
    

  public void move( int direction ) {

    switch( direction ) {
    case DIRECTION_UP:
      this.yLoc = this.yLoc - STEP_SIZE;
      break;
    case DIRECTION_RIGHT:
      this.xLoc = this.xLoc + STEP_SIZE;
      break;
    case DIRECTION_DOWN:
      this.yLoc = this.yLoc + STEP_SIZE;
      break;
    case DIRECTION_LEFT:
    this.xLoc = this.xLoc - STEP_SIZE;
    break;
    }
  }
} 
