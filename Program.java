package pl.imiajd.pakoca;

public class Program {

    public static void main(String[] args) {
        GetType("Tekst");
        GetType('C');
        GetType(5);
        GetType(5.2);
        GetType(true);

    }
    public static void GetType(String n) {
        System.out.println("String");
    }

    public static void GetType(char n) {
        System.out.println("char");
    }

    public static void GetType(byte n) {
        System.out.println("byte");
    }

    public static void GetType(int n) {
        System.out.println("int");
    }

    public static void GetType(float n) {
        System.out.println("float");
    }

    public static void GetType(double n) {
        System.out.println("double");
    }
    public static void GetType(Boolean n) {
        System.out.println("bool");
    }

}



