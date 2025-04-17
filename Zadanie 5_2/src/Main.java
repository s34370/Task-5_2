public class TestBiblioteki{
    public static void main(String[] args) {
        // Tworzenie obiektów różnych typów
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", 1990, "Andrzej Sapkowski", 320);
        Film film1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);
        Ksiazka ksiazka2 = new Ksiazka("Słownik", 1999, "Antoni Jankowski", 999);
        Film film2 = new Film("Goonville", 1200, "Marcin Klinke", 60);
// Demonstracja polimorfizmu - przechowywanie różnych typów w tablicy typu nadrzędnego
        MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[4];
        mediaArray[0] = ksiazka1; // Obiekt// Ksiazka przechowywany jako MediaBiblioteczne
        mediaArray[1] = film1; // Obiekt Film przechowywany jako MediaBiblioteczne
        mediaArray[2] = ksiazka2;
        mediaArray[3] = film2;
// Demonstracja polimorfizmu - wywołanie metod na obiektach różnych typów
        System.out.println("===== INFORMACJE O WSZYSTKICH MEDIACH =====");
        for (MediaBiblioteczne media : mediaArray) {
// Ta sama nazwa metody, ale wywołana zostanie odpowiednia implementacja
// w zależności od rzeczywistego typu obiektu (polimorfizm)
            media.wyswietlInformacje();
            System.out.println("--------------------");
        }
// Demonstracja operacji wypożyczania i zwracania
        System.out.println("\n===== OPERACJE WYPOŻYCZANIA I ZWRACANIA =====");
        ksiazka1.wypozycz(); // Wypożyczenie książki
        ksiazka1.wypozycz(); // Próba ponownego wypożyczenia - powinienbyć komunikat, że jest już wypożyczona
        ksiazka1.zwroc(); // Zwrot książki
// Wywołanie metod specyficznych dla poszczególnych typów
        System.out.println("\n===== METODY SPECYFICZNE DLA TYPÓW =====");
        ksiazka1.sprawdzLiczbeStron(); // Metoda specyficzna dla klasy Ksiazka
        film1.sprawdzCzasTrwania(); // Metoda specyficzna dla klasy Film
// Demonstracja rzutowania do wywołania metod specyficznych poprzez referencję typu bazowego
        System.out.println("\n===== RZUTOWANIE TYPÓW =====");
        for (MediaBiblioteczne media : mediaArray) {
            if (media instanceof Ksiazka) {
// Rzutowanie i wywołanie metody specyficznej dla Ksiazka
                Ksiazka k = (Ksiazka) media;
                k.sprawdzLiczbeStron();
// Alternatywnie można użyć rzutowania w jednej linii:
// ((Ksiazka) media).sprawdzLiczbeStron();
            } else if (media instanceof Film) {
// Rzutowanie i wywołanie metody specyficznej dla Film
                ((Film) media).sprawdzCzasTrwania();
            }
        }
    }

}