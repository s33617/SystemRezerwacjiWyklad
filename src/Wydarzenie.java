public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;


    //KONSTRUKTORY
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.setCena(cena);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.setCena(cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, String data, double cena, String miejsce) {
        this.nazwa = nazwa;
        this.data = data;
        this.setCena(cena);
        this.miejsce = miejsce;
    }

    //METODY
    public String toString(){
        return this.nazwa;
    }

    public boolean zarezerwujMiejsce(){
        if (dostępneMiejsca <= 0) {
            System.out.println("brak wolnych miejsc");
            return false;
        } else {
            this.dostępneMiejsca--;
            return true;
        }
    }

    public void setDostępneMiejsca(int dostępneMiejsca) {
        if (dostępneMiejsca <= 0){
            throw new IllegalArgumentException("Nie ma wolnych miejsc");
        }
        if (dostępneMiejsca > maxLiczbaMiejsc){
            throw new IllegalArgumentException("Liczba dostepnych miejsc nie moze byc wieksza od ilosci max liczby miejsc");
        }
        this.dostępneMiejsca = dostępneMiejsca;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena < 0){
            throw new IllegalArgumentException("Cena nie moze byc mniejsza od 0");
        }
        this.cena = cena;
    }

    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
