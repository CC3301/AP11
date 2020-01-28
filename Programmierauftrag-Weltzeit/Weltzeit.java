public class Weltzeit {

  public String bestimmeMucZeit(String ort, String zeit) {

    // bekomme den zeit unterschied
    int unterschied = bekommeZeitdifferenz(ort);
    
    // return wenn unterschied groesser gleich 25
    if (unterschied >= 25) {
      return "keine Zeitinformation fuer " + ort + " vorhanden";
    }

    // zeit aufteilen und in integer umwandeln, muc stunden berechnen
    String stdStr = zeit.substring(0,2);
    int    stdInt = Integer.parseInt(stdStr);
    String min    = zeit.substring(3);
    int    mucStd = stdInt - unterschied;

    // mucStd weiter bearbeiten
    if (mucStd > 24) {
      mucStd = mucStd - 24;
    }
    if (mucStd < 0) {
      mucStd = 24 + mucStd;
    }

    // muc zeit basteln
    String mucZeit = "";
    if (mucStd < 10) {
      mucZeit = "0" + mucStd + ":" + min;
    } else {
      mucZeit = mucStd + ":" + min;
    }
    
    // gebe muc zeit zurueck
    return mucZeit;

  }

  private int bekommeZeitdifferenz(String ort) {

    // ziele array
    String ziele[][] = new String[12][2];
    ziele [0][0]  = "Fortaleza";      ziele [0][1]  = "-5";
    ziele [1][0]  = "Natal";		      ziele [1][1]  = "-5";
    ziele [2][0]  = "Recife";		      ziele [2][1]  = "-5";
    ziele [3][0]  = "Salvador";		    ziele [3][1]  = "-5";
    ziele [4][0]  = "Belo Horizonte";	ziele [4][1]  = "-5";
    ziele [5][0]  = "Rio de Janeiro";	ziele [5][1]  = "-5";
    ziele [6][0]  = "Sao Paulo ";		  ziele [6][1]  = "-5";
    ziele [7][0]  = "Curitiba";		    ziele [7][1]  = "-5";
    ziele [8][0]  = "Porto Alegre";		ziele [8][1]  = "-5";
    ziele [9][0]  = "Brasilia";		    ziele [9][1]  = "-5";
    ziele [10][0] = "Cuiaba";		      ziele [10][1] = "-6";
    ziele [11][0] = "Manaus";		      ziele [11][1] = "-6";

    // ziele array
    for (int z = 0; z < ziele.length; z++) {
      if (ort.equalsIgnoreCase(ziele[z][0])) {
        return Integer.parseInt(ziele[z][1]);
      }
    }

    return 25;
  }

  // bekomme zeit von einem bestimmten ort
  public String bestimmeOrtsZeit(String zielOrt, String mucZeit) {

    // unterschied holen
    int unterschied = bekommeZeitdifferenz(zielOrt);

    // information fuer zielort
    if (unterschied >= 25) {
      return "keine Zeitinformation fuer " + zielOrt + " vorhanden";
    }

    // zeit aufteilen und in integer umwandeln, muc stunden berechnen
    String stdStr  = mucZeit.substring(0,2);
    int    stdInt  = Integer.parseInt(stdStr);
    String min     = mucZeit.substring(3);
    int    zielStd = stdInt + unterschied;

    // ziel zeit basteln
    String zielZeit = "";
    if (zielStd < 10) {
      zielZeit = "0" + zielStd + ":" + min;
    } else {
      zielZeit = zielStd + ":" + min;
    }


    return zielZeit;

  }

}