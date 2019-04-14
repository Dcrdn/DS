public class NodeLL{
    public int value;
    public NodeLL next;

    public NodeLL(int value){
        setValue(value);
        setNext(null);
    }

    public void setNext(NodeLL node){
        this.next=node;
    }

    public void setValue(int value){
        this.value=value;
    }
}