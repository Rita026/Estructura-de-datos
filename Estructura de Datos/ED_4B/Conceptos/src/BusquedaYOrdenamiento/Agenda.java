package BusquedaYOrdenamiento;

public class Agenda {
    public static void main(String[] args) {
        Contact[]friends=new Contact[7];

        // asignar los valores del arreglo
        friends[0]=new Contact("Sergio", "Mendez", "23812345");
        friends[1]=new Contact("Dulce", "Acevedo", "238123456");
        friends[2]=new Contact("Marco Antonio", "Aguilar", "2381234567");
        friends[3]=new Contact("Karla", "Rojas", "2381234568");
        friends[4]=new Contact("Arturo", "Catañeda", "2381234569");
        friends[5]=new Contact("Kevin", "Rojas", "2381234564");
        friends[5]=new Contact("Cleber", "Bolaños", "2381234566");

        StortingAndSearch<Contact> lista=new StortingAndSearch<>();


        //ordenar seleccion
        lista.selecctionSort(friends);

        System.out.println("Ordenacion por seleccion");
        for(int i=0; i< friends.length; i++){
            System.out.println(friends[i]);
        }
    }
}
