public class Punkt implements Cloneable{
    String nazwa;
    int X;
    int Y;
    public Punkt(String nazwa,int Y,int X) {
        this.nazwa = nazwa;
        this.X=X;
        this.Y=Y;
    }
    public Object clone() throws CloneNotSupportedException {return super.clone();}

    @Override
    public String toString() {
        return "Punkt{" +
                "nazwa='" + nazwa + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                '}';
    }
}

