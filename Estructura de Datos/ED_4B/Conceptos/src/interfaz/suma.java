package interfaz;

public class suma implements ISuma {
    private int resultado;

    public void sumar(int a,int b){
        resultado=a+b;
    }
    
    public int resultado(){
        return resultado;
    }
}
