public class Serie extends Video implements IVisualizable{
  
  private int noTemporadas;

  public Serie(){
    this.noTemporadas = 1;
  }

  public Serie(String titulo, String creador){
    super(titulo, creador);
  }

  public Serie(String titulo, String genero, String creador, String año, String duracion){
    super(titulo, genero, creador, año, duracion);
  }

  public int getTemporadas(){
    return noTemporadas;
  }

  public void setTemporadas(int noTemporadas){
    this.noTemporadas = noTemporadas;
  }

  @Override
  public String toString(){
    return super.toString().concat(" No. Temporadas: ").concat(String.valueOf(noTemporadas));
  }

  @Override
  public void marcarVisto(){
    this.visto = true;
    System.out.println("Serie Vista.");
  }

  @Override
  public boolean esVisto(){
    return this.visto;
  }

  @Override
  public void tiempoVisto(){
    System.out.println("3 hrs visto de esta Serie.");
  }
  
}