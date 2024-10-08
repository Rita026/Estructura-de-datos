package BusquedaYOrdenamiento;

public class Main {
    public static void main(String[] args){
        //busqueda lineal
        Integer[] numeros={2,5,8,6,4,3,0,9};
        StortingAndSearch<Integer> s=new StortingAndSearch<>();
        System.out.println(s.linealSearch(numeros, 0, numeros.length-1, 5));

        String[]nombres={"Juan","Maria","Hugo","Paco", "Luis"};
        StortingAndSearch<String> n=new StortingAndSearch<>();
        System.out.println(n.linealSearch(nombres, 0, nombres.length-1, "Paco"));

        //busqueda binaria
        //regla: el arreglo debe estar ordenado
        Integer[]numeros2={2,5,8,16,24,31,40,49,65,78,122};
        System.out.println(s.binarySearch(numeros2, 0, numeros2.length-1, 100));


        //ordenamiento
        //seleccion
        n.selecctionSort(nombres);
        for (int 1=0; i<numeros.length);
        System.out.println("ordenacion x seleccion:" + numeros[i]);{

        }

        //insercion

        s.insertionSort(numeros);
        for (int i = 0; i<numeros.length; i++){
            System.out.println("ordenacion x insercion:" + numeros[i]);
        }
    }

    //metodo burbuja
     s.insertionSort(numeros);
     for (int i = 0; i<numeros.length; i++){
     System.out.println("ordenacion x metodo burbuja:" + numeros[i]);
            }
        }


            s.quicksort(numeros, min:0, numeros.length-1);
            for (int i = 0; i<numeros.length; i++){
                System.out.println("ordenacion x metodo burbuja:" + numeros[i]);
                       }
}
