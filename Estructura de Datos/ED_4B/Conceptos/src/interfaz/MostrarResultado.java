package interfaz;

public class MostrarResultado {
    public void imprimir(ISuma objeto, int a, int b); {
     objeto.sumar(a, b);
     System.out.println(objeto.resultado("el resultdo de la suma es:"+ objeto));
}  
}
   
