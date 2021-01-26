class Main {
  public static void main(String[] args) {
    // Peliculas
    Pelicula peli1 = new Pelicula("Batman", "Christopher Nolan");
    Pelicula peli2 = new Pelicula("Avatar", "James Cameron");
    Pelicula peli3 = new Pelicula("Avengers: Endgame", "Ciencia Ficcion", "Anthony y Joe Russo", 2019, 181);
    Pelicula peli4 = new Pelicula("Titanic", "Drama", "James Cameron", 1997, 195);
    Pelicula peli5 = new Pelicula("Jurassic World", "Ciencia Ficcion", "Colin Trevorrow", 2015, 124);

    // Series
    Serie serie1 = new Serie("Stranger Things", "Matt y Ross Duffer");
    Serie serie2 = new Serie("The Umbrella Academy", "Steve Blackman");
    Serie serie3 = new Serie("La Casa de Papel", 4, "Thriller-Accion", "Alex Pina", 2017, 31);
    Serie serie4 = new Serie("You", 2, "Suspenso-Drama", "Greg Berlanti y Sera Gamble", 2018, 20);
    Serie serie5 = new Serie("The protector", 3, "Accion", "Jason George, Özge Bağdatlıoğlu y Binnur Karaevli", 2019, 32);

    // Arreglos de Peliculas y Series
    Pelicula[] arrPelis = {peli1, peli2, peli3, peli4, peli5};
    Serie[] arrSeries = {serie1, serie2, serie3, serie4, serie5};

    for(int i = 0; i < 5; i++){
      if(i > 1){ // No ha visto peli1, peli2, serie1 y serie2
        arrPelis[i].marcarVisto();
        arrSeries[i].marcarVisto();
      }
    }

    for(int i = 0; i < 5; i++){
      if(arrPelis[i].esVisto() == true){
        System.out.println("\n" + arrPelis[i]);
        arrPelis[i].tiempoVisto();
      }
      if(arrSeries[i].esVisto() == true){
        System.out.println("\n" + arrSeries[i]);
        arrSeries[i].tiempoVisto();
      }
    }

    int añoMasR = 0;
    int peliMasR = 0;
    int masTemp = 0;
    int serieMasT = 0;
    for(int i = 0; i < 5; i++){
      int temp = arrSeries[i].getTemporadas();
      if(temp > masTemp){
        masTemp = arrSeries[i].getTemporadas();
        serieMasT = i;
      }
      if(arrPelis[i].getAño() > añoMasR){
        añoMasR = arrPelis[i].getAño();
        peliMasR = i;
      }
    }

    System.out.println("\n SERIE CON MAS TEMPORADAS: " + arrSeries[serieMasT]);
    System.out.println("\n PELICULA MAS RECIENTE: " + arrPelis[peliMasR]);
  }
}