public class Pelicula extends Video implements IVisualizable{

  public Pelicula(){
  }

  public Pelicula(String titulo, String creador){
    super(titulo, creador);
  }

  public Pelicula(String titulo, String genero, String creador, String año, String duracion){
    super(titulo, genero, creador, año, duracion);
  }

  @Override
  public void marcarVisto(){
    this.visto = true;
    System.out.println("Pelicula Vista.");
  }

  @Override
  public boolean esVisto(){
    return this.visto;
  }

  @Override
  public void tiempoVisto(){
    System.out.println("3 hrs visto de esta Pelicula.");
  }

}