
public class Film extends MediaBiblioteczne {
    private String rezyser;
    private int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rezyser: " + rezyser + "czas trwania: " + czasTrwania);
    }

    public void sprawdzCzasTrwania(){
        if(czasTrwania > 120){
            System.out.println("film jest długi, czas trwania w minutach: " + czasTrwania);
        }
        else{
            System.out.println("film jest standardowy, czas trwania w minutach: " + czasTrwania);
        }
    }
}