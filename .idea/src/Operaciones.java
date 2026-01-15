public class Operaciones {
    public int sumar(int n, int x){
        return n+x;
    }
    public int restar(int n, int x){
        return n-x;
    }

    public static void main(String[] args) {
        Operaciones ops = new Operaciones();
        int suma = ops.sumar(10,5);
        System.out.println("El resultado de la suma es: " + suma);
        int resta = ops.restar(10,5);
        System.out.println("El resultado de la resta es: " + resta);
    }
}