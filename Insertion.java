public class Insertion{
    /*
     * Voy checando mi elemento actual y el pasado, 
     * si hago un swap, sigo checando y haciendo swaps 
     * hasta que mi elemento está en la posición correcta. 
     */
    
    public void insertion(int[] lista){
        int pivot=0;
        for (int i = 1; i < lista.length; i++) {
            if(lista[i]<lista[pivot]){
                int temp=lista[i];
                lista[i]=lista[pivot];
                lista[pivot]=temp;
                int j=i-1;
                while(j>0){
                    if(lista[j]<lista[j-1]){
                        int temp2=lista[j-1];
                        lista[j-1]=lista[j];
                        lista[j]=temp2;
                    }
                    j--;
                }
            }
            pivot++;
        }
    }



    public void insertion2(int[] lista){
        for (int i = 1; i < lista.length; i++) {
            int j=i;
            while(j>0){
                if(lista[j]<lista[j-1]){
                    int temp2=lista[j-1];
                    lista[j-1]=lista[j];
                    lista[j]=temp2;
                    j--;
                }else{
                    break;
                }
            }
            
        }
    }


    public void imprimir(int[] ls){
        for (int i = 0; i < ls.length; i++) {
            System.out.print(ls[i]+", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] nums={4,1,6,8,9,7,0};

        Insertion ins=new Insertion();
        ins.imprimir(nums);
        //ins.insertion(nums);
        ins.insertion2(nums);

        ins.imprimir(nums);        

    }
}

