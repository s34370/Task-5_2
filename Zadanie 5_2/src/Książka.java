public class Książka {

    public class Ksiazka extends MediaBiblioteczne {
        private String autor;
        private int liczbaStron;


        public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
            super(tytul, rokWydania);
            this.autor = autor;
            this.liczbaStron = liczbaStron;
        }
        @Override
        public void wyswietlInformacje(){
            super.wyswietlInformacje();
            System.out.println("autor: " + autor + " liczbaStron: " + liczbaStron);
        }
        public void sprawdzLiczbeStron(){
            if(liczbaStron > 500){
                System.out.println("ksiazka jest dluga, liczba stron: " + liczbaStron);
            }
            else{
                System.out.println("ksiazka jest standardowa, liczba stron: " + liczbaStron);
            }
        }
    }}
