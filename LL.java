public class LL{

    private NodeLL head;

    public LL(){
        this.head=null;
    }

    public LL(int val){
        insert(val);
    }

    public void print(){
        NodeLL temp=this.head;
        while(temp!=null){
            System.out.print(temp.value+", ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public void insertMany(int[] lista){
        for (int i = 0; i < lista.length; i++) {
            insert(lista[i]);
        }
    }

    public void insert(int val){
        if(this.head==null){
            this.head=new NodeLL(val);
        }else{
            NodeLL nodo=new NodeLL(val);
            nodo.next=this.head;
            this.head=nodo;
        }
    }

    public NodeLL predecesor(NodeLL nodo, int val){
        if(nodo.next==null){
            return null;
        }else if(nodo.next.value==val){
            return nodo;
        }else{
            return predecesor(nodo.next, val);
        }
    }

    public void delete(int val){
        if(this.head.value==val){
            this.head=this.head.next;
        }else{
            NodeLL pred=predecesor(this.head, val);
            if(pred==null){
                System.out.println("Error: element doesn't exist");
            }else{
                pred.next=pred.next.next;
            }
        }
    }

    public void deleteInside(int val){
        if(this.head.value==val){
            this.head=this.head.next;
        }else{
           NodeLL curr=this.head;
            while(curr.next!=null){
                if(curr.next.value==val){
                    curr.next=curr.next.next;
                    break;
                }
                curr=curr.next;
            }
        } 
    }

    public static void main(String[] args) {
        int[] ls={1,24,112,2,6};
        LL lista=new LL();
        lista.insertMany(ls);
        lista.print();
        lista.delete(1);
        lista.print();
        lista.delete(6);
        lista.print();
        lista.deleteInside(112);
        lista.print();
    }
}