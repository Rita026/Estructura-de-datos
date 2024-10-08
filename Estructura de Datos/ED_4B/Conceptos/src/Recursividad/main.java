package Recursividad;
public class main {
    public static void main(String[]args){
        Recursiva r=new Recursiva();
        System.out.println("La sumatoria del numero ascendente es:"+r.sumar(1));
        System.out.println("La sumatoria del numero descendente es:"+r.sumar(5));

        System.out.println("El fatorial del numero es:"+ r.factorial(5));

        //maze
        //Maze m=new Maze();
        //System.out.println(m.toString());

        //if (m.traverse(0, 0)){
        //    System.out.println("Con Solucion");
       // }else{
     //       System.out.println("Sin Solucion");
        //}

        //System.out.println(m);

            //Tower0fHanoi
        Tower0fHanoi tower=new TowerOfHanoi(totalDisks:5);
        tower.solve();

    }
    
    
}