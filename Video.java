public class Video{
  private String titulo;
  private String genero;
  private String creador;
  private String año;
  private String duracion;
  protected boolean visto;

  public Video(){
    this.titulo = "titulo";
    this.genero = "genero";
    this.creador = "creador";
    this.año = "año";
    this.duracion = "duracion";
    this.visto = false;
  }

  public Video(String titulo, String creador){
    this.titulo = titulo;
    this.creador = creador;
    this.visto = false;
  }

  public Video(String titulo, String genero, String creador, String año, String duracion){
    this.titulo = titulo;
    this.genero = genero;
    this.creador = creador;
    this.año = año;
    this.duracion = duracion;
    this.visto = false;
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
    return super.toString().concat(" \nTitulo: ").concat(titulo).concat(" Genero: ").concat(genero).concat(" Creador: ").concat(creador).concat("\nAño: ").concat(año).concat(" Duracion: ").concat(duracion);
  }

}

