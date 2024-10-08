package Herencia;

public class Dictionary extends Book {
    private int numDefs;
    
    public Dictionary(int numDefs, int numPages){
        super(numPages);
        this.numDefs=numDefs;
    }

    public void info (){
        System.out.println("number or definitions:" + numDefs);
        System.out.println("number or Numpages:" + numPages);
        System.out.println("Definitiond per pages:" + numDefs/numPages);
    }



       
    

        

}
