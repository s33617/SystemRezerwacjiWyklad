import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen = new ArrayList<>();
    private ArrayList<Klient> listaKlient = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie w){
        listaWydarzen.add(w);
    }
    public void dodajWydarzenie(String nazwa, double cena){
        Wydarzenie w = new Wydarzenie(nazwa, cena);
        listaWydarzen.add(w);
    }
    public void dodajKlienta(Klient k){
        listaKlient.add(k);
    }
    public void dodajKlienta(String imie, String nazwisko){
        Klient k = new Klient(imie, nazwisko);
        listaKlient.add(k);
    }
    public Wydarzenie znajdzWydarzenie(String nazwa){
        for (Wydarzenie w : listaWydarzen) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String nazwisko){
        for (Klient k : listaKlient) {
            if (k.getImie().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena){
        Wydarzenie w =znajdzWydarzenie(nazwa);
        if (w==null){
            throw new RuntimeException("Wydarzenie nie istnieje");
        }
        w.setCena(nowaCena);
    }
    public void dokonajRezerwacji(Klient k , Wydarzenie w){
        this.listaWydarzen.add(w);
        this.listaKlient.add(k);
        w.zarezerwujMiejsce();
        k.dodajRezerwacje(w);
    }
}