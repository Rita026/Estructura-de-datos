package Recursividad;

public class Recursiva {

    public int sumar(int num){
        int resultado;
        if(num==1){
            resultado=1;
        }else{
            resultado=num+sumar(num-1);
    }
        return resultado;
        

    }
}

//sumatoria de factorial
public int factorial(int num){
    int resultado;
    if(num==1){
        resultado=1;
    }else{
        resultado=num+sumar(num-1);
    }
    return resultado;
}