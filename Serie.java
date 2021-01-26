public class Serie extends Video implements IVisualizable{
  
  private int noTemporadas;

  public Serie(){
    this.noTemporadas = 1;
  }

  public Serie(String titulo, String creador){
    super(titulo, creador);
    this.noTemporadas = 1;
  }

  public Serie(String titulo, int noTemporadas, String genero, String creador, int año, int duracion){
    super(titulo, genero, creador, año, duracion);
    this.noTemporadas = noTemporadas;
  }

  public int getTemporadas(){
    return noTemporadas;
  }

  public void setTemporadas(int noTemporadas){
    this.noTemporadas = noTemporadas;
  }

  @Override
  public String toString(){
    return super.toString().concat(" episodios / No. Temporadas: ").concat(String.valueOf(noTemporadas));
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
      System.out.println(" - - " + mins +  " episodios vistos." + " - - ");
    }
    else{
      System.out.println("Sin reproducir.");
    }
  }
  
}