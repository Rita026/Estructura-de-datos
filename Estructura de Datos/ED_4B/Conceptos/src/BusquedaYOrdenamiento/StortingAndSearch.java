package BusquedaYOrdenamiento;

public class StortingAndSearch <T extends Comparable> {

    // metodo de busqueda lineal
    public boolean linealSearch(T[] data, int min, int max, T target){
        int index=min;
        boolean found=false;

        while (!found && index<=max) {
            if (data [index].compareTo(target)==0){
                //-1 menor, 0 igual, 1 mayor
                found=true;
            }
            index ++;
        }
        return found;
    }
    
    //metodo de busqueda binaria
    public boolean binarySearch(T[] data, int min, int max, T target){
        boolean found=false;

        int mindpoint=(min+max)/2;

        if (data[mindpoint].compareTo(target)==0){
            found=true;
        }else if (data[mindpoint].compareTo(target)>0){
            if(min<=mindpoint-1){
                found=binarySearch(data, min, mindpoint-1, target);
            }
        }else if (mindpoint+1>=max){
            found=binarySearch(data, mindpoint+1, max, target);
        }
        return found;
    }


  // ORDENAMIENTOS
  // OREDENAMIENTO SELECCION

  public void selecctionSort (T[]data){
    int min;
     T  temp;

    for (int index=0; index< data.length-1; index++){
        min = index;
        for(int scan=index+1; scan<data.length; scan++){
            if(data[scan].compareTo(data[min])>0){
                min=scan;
            }
        }
        temp=data[min];
        data[min]=data [index];
        data[index]=temp;
    }
  }

    //metdos por insercion
    public void insertionSort(T[]data){
        for(int index =1; index<data.length;index++){
            T key=data[index];
            int position=index;

            while (position>0 && data[position-1].compareTo(key)>0) {
                data[position]=data[position-1];
                position--;
            }
            data[position]=key;

        }
    }

        //METODO BURBUJA
        public void bubblesort (T[]data){
            int position, scan;
            T temp;

            for(position=data.length; position>=0;position--){
                for (scan=0;scan<=position-1;scan++)
                if(data[scan].compareTo(scan+1)>0){
                    temp=data[scan];
                    data[scan]=data[scan +1];
                    data[scan]= temp;
                }
            }
        }

        //tipo logaritmico
        //ordenacion rapida
        public void quicksort(T[]data, int min, int max){

            int indexofpartition;

            if(max-min >0){
                indexofpartition=findPartition(data, min, max);

                quicksort(data, min, indexofpartition-1);
                quicksort(data, indexofpartition+1, max);
            }
        }

            private int findPartition(T[]data, int min, int max){
                int left, right;
                T temp, patittionelement;

                patittionelement=data[min];
                left=min;
                right=max;

                while (left<right) {
                    while (data[left].compareTo(patittionelement)<0 && left<right) {
                        left++;
                    }
                    while(data[right].compareTo(patittionelement)>0){
                        right++;
                    }
                    if(left<right){
                        temp=data[left];
                        data[left]=data[right];
                        data[right]=temp;
                    }
                }

                temp=data[min];
                data[min]=data[right];
                
            }


        //ordenacion por combinacion o mezcla 

        public void mergeSort(T[] data, int min, int max){

            T[] temp;
            int index, left, right;

            //busca la lista de la longitud 1
            if(min==max){
                return;
            }

            //calcular la longitud y el punto de la lista
            int size=max-min+1;
            int pivot=(min+max)/2;

            temp=(T[])(new Comparable[size]);

            //ordenar la mitad izquierda
            mergeSort(data, min, pivot);

            //ordenar la mitad derecha
            mergeSort(data, pivot+1, max);

            //copiar los datos de manera ordenada
            for(index=0; index<size; index++){
                temp[index]=data[min+index];
            }

            //mezcla de lista ordenadas
            left=0;
            right=pivot-min+1;

            for(index=0; index<size; index++){
                if(right<=max-min){
                    if(left<=pivot-min){
                        if(temp[left].compareTo(temp[right])>0){
                            data[index+min]=temp[right++];
                        }else{
                            data[index+min]=temp[left++];
                        }
                    }else{
                        data[index+min]=temp[right++];
                    }
                }else{
                    data[index+min]=temp[left++];
                }
            }
        }


    
}
