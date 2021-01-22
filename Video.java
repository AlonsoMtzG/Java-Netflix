public class Video{
  private String titulo;
  private String genero;
  private String creador;
  private String año;
  private String duracion;
  private boolean visto;

  public Video(String titulo, String creador){
    this.titulo = titulo;
    this.creador = creador;
  }

  public Video(String titulo, String genero, String creador, String año, String duracion){
    this.titulo = titulo;
    this.genero = genero;
    this.creador = creador;
    this.año = año;
    this.duracion = duracion;
  }

  public String getTitulo(){
    return titulo;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public String getGenero(){
    return genero;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }

  public String getCreador(){
    return creador;
  }

  public void setCreador(String creador){
    this.creador = creador;
  }

  public String getAño(){
    return año;
  }

  public void setAño(String año){
    this.año = año;
  }

  public String getDuracion(){
    return duracion;
  }

  public void setDuracion(String duracion){
    this.duracion = duracion;
  }

}

/* Crea una clase llamada Pelicula con las siguientes características:
     • Atributos: titulo, genero, creador, año, duracion y visto.

    • Constructores:

         • Un constructor default.

         • Un constructor con el titulo y creador. Los demás campos tendrán su valor                        default por tipo de dato. Visto tendrá false por defecto.

         •	Un constructor con todos los atributos, excepto visto.

    • Métodos:

         • Métodos get de todos los atributos, excepto visto.

         • Métodos set de todos los atributos, excepto visto.

         • Sobreescribe el método toString.*/

