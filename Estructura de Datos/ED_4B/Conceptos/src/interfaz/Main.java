package interfaz;

public class Main {
    public static void main(String[]args){
        suma s=new suma();
        s.sumar(50, 20);
        System.out.println("el resultado de la suma es:"+s.resultado());

        MostrarResultado mr=new MostrarResultado();
        mr.imprimir(s, 50, 20);
        System.out.println("el resultado de la suma2 es:"+ S.mr.imprimir(s, a:50, b:20))
    }
}
