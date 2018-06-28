/*
 * 'Merica
 * 2017-18.S2
 */
import java.util.Scanner;
import java.util.StringTokenizer;

final static String[] FILE_NAMES_ELECTIONS = {
  "USA1960.txt", "USA1964.txt", "USA1968.txt", "USA1972.txt", "USA1976.txt", 
  "USA1980.txt", "USA1984.txt", "USA1988.txt", "USA1992.txt", "USA1996.txt", 
  "USA2000.txt", "USA2004.txt", "USA2008.txt", "USA2012.txt", "USA2016.txt"
};

int value;
String fileName;
String[][] electionResults;

/*
 * SETUP; CALLED ONCE @ STARTUP
 */
void setup() {

  size( 1200, 600 );
  
  background(100,149,237);
  
  // DEFAULT MAP
  fileName = FILE_NAMES_ELECTIONS[0];

  // ELECTION RESULTS
  electionResult();
  
      stroke( 1 );
    textSize(50);
    fill(0);
    text(fileName.substring(3,7), 1000, 400);
}

/*
 * ELECTION RESULTS
 * - parse election file INTO electionResults[][] 2D-Array, or data structure of your choice.
 */
void electionResult( ) {
  try {

    // ELECTION RESULT DATA
    Scanner data = new Scanner( new File( dataPath("") + "/" + fileName ) );

    electionResults = new String[51][4];
    data.nextLine();

    //PARSE FILE INTO TOKENS
    int row = 0;
    while( data.hasNextLine() ) {
      StringTokenizer st = new StringTokenizer(data.nextLine(), ",");
      for (int col = 0; col < 4; col++) {
        electionResults[row][col] = st.nextToken();
      }
      row++;
    }
    drawMap();
    data.close();
  }




  catch (Exception e ) {
    e.printStackTrace();
  }
}



/*
 * DRAW MAP OFF USA w/ Election Results
 */
void drawMap() {
  // MAP
  try {

    // USA MAP DATA
    
    //OBJECTS
    Scanner data = new Scanner( new File( dataPath("") + "/USA.txt" ) );
    
    //VARIABLES
    float minLongitude = data.nextFloat();
    float minLatitude =  data.nextFloat();
    data.nextLine();
    float maxLongitude = data.nextFloat();
    float maxLatitude = data.nextFloat();
    data.nextLine();
    int regions = data.nextInt();
    data.nextLine();
    float latitudeRange = Math.abs(maxLatitude - minLatitude);
    float longitudeRange = Math.abs(maxLongitude - minLongitude);
    float a = 0, b = 0, c = 0;
    float stretch = 0;
    String state;
    float latitude, longitude;


    //SOLVE FOR STRETCH VALUE
    if (600/latitudeRange >= 1200/longitudeRange) {
      stretch = (600/latitudeRange) - 5;
    } else if (1200/longitudeRange > 600/latitudeRange) {
      stretch = (1200/longitudeRange) - 5;
    }  

    // DRAW EACH REGION
    for ( int r = 0; r < regions; r++ ) {
      data.nextLine();
      state = data.nextLine();

      // LINEAR SEARCH FOR THE STATE
      boolean stateFound = false;
      for (int i = 0; i < electionResults.length; i++) {
        if ( state.equalsIgnoreCase(electionResults[i][0])) { 
          stateFound = true;
          a = Integer.parseInt(electionResults[i][1]);
          b = Integer.parseInt(electionResults[i][3]);
          c = Integer.parseInt(electionResults[i][2]);
          i = electionResults.length;
        }
      }
      
      // SET COLOUR
      if( stateFound ) {
        fill( (( a / (a+b+c))*255), (( b / (a+b+c))*255), (( c / (a+b+c))*255));
      }
      else {
         fill( 100, 100, 100 ); 
      }


      data.nextLine();
      int pointAmount = data.nextInt();
      
      //DRAW POINTS
      beginShape();
      for (int count = 0; count < pointAmount; count++) {
        longitude = data.nextFloat();
        latitude = Float.parseFloat(data.nextLine());
        strokeWeight(0.5);
        vertex((longitude + Math.abs(minLongitude) + 12) * (stretch-5), 600 - (latitude - minLatitude + 2) * stretch);
      }

      endShape(CLOSE);
    }


    data.close();
  }
  catch (Exception e ) {
    e.printStackTrace();
  }
}

void draw() {
}

void keyPressed() {
  if ( key >= 'a' && key <= ( 'a' + FILE_NAMES_ELECTIONS.length - 1 )  ) {
    fileName = FILE_NAMES_ELECTIONS[key-'a'];
    electionResult();
    
    noStroke();
    fill( 100,149,237 );
    rect( 1000, 350, 150, 60 );
    
    stroke( 1 );
    textSize(50);
    fill(0);
    text(fileName.substring(3,7), 1000, 400);

  }
}