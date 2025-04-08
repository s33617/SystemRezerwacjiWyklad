import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> ListaRezerwacji = new ArrayList<>();

    //Konstruktory
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    //METODY
    public boolean dodajRezerwacje(Wydarzenie w) {
        ListaRezerwacji.add(w);
        return true;
    }
    public void wyswietlRezerwacje(){
        for (int i = 0; i < ListaRezerwacji.size(); i++) {
            System.out.println(ListaRezerwacji.get(i));
        }
    }
    public void anulujRezerwacje(String nazwaWydarzenia){
        for (int i = 0; i < ListaRezerwacji.size(); i++) {
            Wydarzenie w = ListaRezerwacji.get(i);
            if (w.getNazwa().equals(nazwaWydarzenia));
            ListaRezerwacji.remove(i);
            return;
        }
    }

    //Gettery i Settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
