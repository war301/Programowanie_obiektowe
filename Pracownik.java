public class Pracownik {
    private String imie;
    private String nazwisko;
    private double zarobki;

    public Pracownik(double zarobki,String imie, String nazwisko) {
        this.zarobki = zarobki;
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    String pracuj(){
        return "Pracownik teraz pracuje";
    }

    public String getImie() {
        return imie;
    }
}
class Muzyk extends Pracownik{
    public Muzyk(double zarobki, String imie, String nazwisko) {
        super(zarobki, imie, nazwisko);
    }
    String pracuj(){
        return "Muzyk spiewa";
    }
}
class  Księgowa extends Pracownik{

    public Księgowa(double zarobki, String imie, String nazwisko) {
        super(zarobki, imie, nazwisko);
    }
    String pracuj(){
        return "Ksiegowa księguję ";
    }

    @Override
    public String getImie() {
        return super.getImie();
    }
}
class Sprzedawca extends  Pracownik{

    public Sprzedawca(double zarobki, String imie, String nazwisko) {
        super(zarobki, imie, nazwisko);
    }
    String pracuj(){
        return "Sprzedawca sprzedaje";
    }

    @Override
    public String getImie() {
        return super.getImie();
    }
}