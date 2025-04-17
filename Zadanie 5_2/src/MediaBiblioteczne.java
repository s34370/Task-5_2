public class MediaBiblioteczne {
    public class MediaBiblioteczne {
        protected String tytul;
        protected int rokWydania;
        protected boolean dostepny;

        public MediaBiblioteczne(String tytul, int rokWydania) {
            this.tytul = tytul;
            this.rokWydania = rokWydania;
            dostepny = true;
        }

        public void wypozycz(){
            if(dostepny == true){
                dostepny = false;
                System.out.println("wypożyczono pomyślnie");
            }
            else{
                System.out.println("medium jest już wypożyczone");
            }
        }

        public void zwroc(){
            if(dostepny == false){
                dostepny = true;
                System.out.println("zwrócono pomyślnie");
            }
            else {
                System.out.println("medium nie było wypożyczone");
            }
        }

        public void wyswietlInformacje(){
            String dostepnosc = dostepny ? "Dostępne" : "Wypożyczone";
            System.out.println("tytul: " + tytul + " rok Wydania: " + rokWydania + " dostepnosc: " + dostepnosc );
        }
    }
}
