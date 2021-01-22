public class Video{
  private String titulo;
  private String genero;
  private String creador;
  private String año;
  private String duracion;
  private boolean visto;

  public Video(){
  }

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

  public String toString(){
    return super.toString().concat(" con duracion de: ").concat ( getDuracion() );
  }

  public void mostrarDatos(){
    System.out.println(this.toString());
    System.out.println("D A T O S");
    System.out.println("Nombre: " + titulo);
    System.out.println("Genero: " + genero);
    System.out.println("Creador: " + creador);
    System.out.println("Año: " + año);
    System.out.println("Duracion: " + duracion);
  }

}

