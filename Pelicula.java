public class Pelicula extends Video implements IVisualizable{

  public Pelicula(){
  }

  public Pelicula(String titulo, String creador){
    super(titulo, creador);
  }

  public Pelicula(String titulo, String genero, String creador, int año, int duracion){
    super(titulo, genero, creador, año, duracion);
  }

  @Override
  public String toString(){
    return super.toString().concat(" mins.");
  }

  @Override
  public void marcarVisto(){
    this.visto = true;
  }

  @Override
  public boolean esVisto(){
    return this.visto;
  }

  @Override
  public void tiempoVisto(){
    if(esVisto() == true){
      int mins = (int) ((Math.random() * getDuracion())+1);
      System.out.println(" - - " + mins +  " mins vistos." + " - - ");
    }
    else{
      System.out.println("Sin reproducir.");
    }
  }

}