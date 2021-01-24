class Main {
  public static void main(String[] args) {
    //Video miVideo = new Video("Batman", "Accion", "C. Nolan", "2008", "2 hrs");
    //Video miVideo = new Video("Batman", "C. Nolan");
    Pelicula peli1 = new Pelicula();
    Pelicula peli2 = new Pelicula();
    Pelicula peli3 = new Pelicula();
    Pelicula peli4 = new Pelicula();
    Pelicula peli5 = new Pelicula();

    Pelicula serie1 = new Serie();
    Pelicula serie2 = new Serie();
    Pelicula serie3 = new Serie();
    Pelicula serie4 = new Serie();
    Pelicula serie5 = new Serie();

    Pelicula[] arrPelis = {peli1, peli2, peli3, peli4};
    Serie[] arrSeries = {serie1, serie2, serie3, serie4};

    Pelicula miPeli = new Pelicula();
    Serie miSerie = new Serie();
    System.out.println(miPeli.toString());
    System.out.println("Visto = " + miPeli.esVisto());
    miPeli.marcarVisto();
    System.out.println("Visto = " + miPeli.esVisto());
    miPeli.tiempoVisto();
    System.out.println("\n" + miSerie.toString());
    System.out.println("Visto = " + miSerie.esVisto());
    miSerie.marcarVisto();
    System.out.println("Visto = " + miSerie.esVisto());
    miSerie.tiempoVisto();
  }
}