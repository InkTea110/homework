public class element {
    int Data;
    element Next;
    public int getData() {
        return Data;
    }


    public void setData(int data) {
        Data = data;
    }


    public element getNext() {
        return Next;
    }



    public void setNext(element next) {
        Next = next;
    }
public element(int Data){
        setData(Data);
        setNext(null);
    System.out.println("Econstructor:\t"+Integer.toHexString(this.hashCode()));
}
public element(int Data,element Next){
        setData(Data);
        setNext(Next);
    System.out.println("Econstructor:\t"+Integer.toHexString(this.hashCode()));
}
}
