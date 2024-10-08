package BusquedaYOrdenamiento;

public class Contact implements Comparable {
    private String firstName, lastName, phone;

    public Contact (String firstName, String lasName, String phone){
        this.lastName=firstName;
        this.lastName=lasName;
        this.phone=phone;
    }

    public String toString(){
        return lastName+" "+ firstName + " " +phone;
    }

    public int compateTo(Object o){
        int result;
        if(lastName.equals(((Contact)o).lastName)){
            result=firstName.compareTo(((Contact)o).firstName);
        }else{
            result=lastName.compareTo(((Contact)o).lastName);
        }
        return result;

    }
    
}
