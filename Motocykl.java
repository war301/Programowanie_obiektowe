public class Motocykl {
    private float pojemnośćSilnika;
    private String nrVIN;
    public int rocznik;
    public String nazwa;
    public float średnieSpalanie;
    private Motocykl(float pojemnośćSilnika,String nrVIN,int rocznik, String nazwa,float średnieSpalanie){
        this.nazwa=nazwa;
        this.nrVIN=nrVIN;
        this.pojemnośćSilnika=pojemnośćSilnika;
        this.rocznik=rocznik;
        this.średnieSpalanie=średnieSpalanie;
    }
    public Object Create(){
        Motocykl clone=new Motocykl(this.pojemnośćSilnika,this.nrVIN,this.rocznik,this.nazwa,this.średnieSpalanie);
        return clone;
    }
    public enum typTrasy {
    }
    public int ObliczSpalanie(){
        return średnieSpalanie*długośćTrasy*typTrasy;
    }
}
