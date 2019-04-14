public class Selection{

/*
 * Tiene 2 partes, sorted y unsorted
 * Escoge el más pequeño de unsorted y 
 * lo pone al final de sorted(o al principio de sorted) 
 */

    public void selection(int[] lista){
        for (int i = 0; i < lista.length; i++) {
            int min=Integer.MAX_VALUE;
            int pos=-1;
            for (int j = i; j < lista.length; j++) {
                if(lista[j]<min){
                    min=lista[j];
                    pos=j;
                }
            }
            lista[pos]=lista[i];
            lista[i]=min;
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

        Selection ins=new Selection();
        ins.imprimir(nums);
        ins.selection(nums);
        ins.imprimir(nums);        

    }

}