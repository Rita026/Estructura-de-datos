public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Bienvenido a Estructura de datos!");

        Coin coin = new Coin();
        System.out.println(coin);

        //Variables primitivas
        int num1 = 5;
        int num2 = 2;

        num2 = num1;
        num1 = 10;

        System.out.println("******** Variables Primitivas ********");
        System.out.println("El valor de num 1 es:" + num1);
        System.out.println("El valor de num 2 es:" + num2);

        //Variables de objecto
        Numero n1 = new Numero();
        n1.numero = 5;

        Numero n2 = new Numero();
        n2.numero = 10;
    
        n2 = n1;
        System.out.println("******** Variables de Objeto ********");
        System.out.println("El valor de n1 es:" + n1);
        System.out.println("El valor de n2 es:" + n2);
        Numero.nombre = "Maria";
        System.out.println("El valor de nombre es: " + Numero.nombre);


        //Variables estaticas
        Estaticas.numero = 5;
        System.out.println("******** Variables Estaticas ********");
        System.out.println("El valor de num 1 es:" + Estaticas.numero);
        Numero.nombre = "juan";
        System.out.println("El valor de nombre es: " + Numero.nombre);

        Estaticas.incremento1(10);
        System.out.println("El valor de cout es: " + Estaticas.count);
        
    }
}