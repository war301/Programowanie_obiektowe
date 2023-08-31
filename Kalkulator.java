import static java.lang.Math.sqrt;

public class Kalkulator {

    int dodawanie(int a,int b){
        return a+b;
    }
    int odejmowanie(int a,int b){
        return a-b;
    }
    int dzielenie(int a,int b){
        return a/b;
    }
    int mnożenie(int a,int b){
        return a*b;
    }
}
class DziwnyKalkulator extends Kalkulator{
    int dodawaniemodulo(int a,int b){
        return a%23+b%23;
    }
    double pierwiastkowanie(int a){
        return sqrt(a);
    }
    double potrójnedodawanie(int a,int b,int c){
        return a+b+c;
    }
}