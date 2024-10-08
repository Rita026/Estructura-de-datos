package Recursividad;

public class TowerOfHanoi {
    private int totalDisks;
  
    public TowerOfHanoi(int totalDisks){
        this.totalDisks=totalDisks;
    }    

    public void solve(){
        moveTower(totalDisks, 1, 3, 2);
    }

    private void moveTower(int numDisks,int start,int end, int temp){
        if(numDisks==1){
            moveOneDisk(start, end);
        }else{
            moveTower(numDisks-1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks-1,temp, end, start);
        }

    }

    private void moveOneDisk(int start, int end){
        System.out.println("move one disk from"+ start+"to"+ end);
    }

}//clase
