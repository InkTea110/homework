public class element<T> {
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
public void setNext(element<T> next){
        Next=next;
}


    public void setNext(element next) {
        Next = next;
    }
public element(T Data){
        setData(Data);
        setNext(null);
    /*System.out.println("Econstructor:\t"+Integer.toHexString(this.hashCode()));*/
}
public element(T Data,element<T> Next){
        setData(Data);
        setNext(Next);
    /*System.out.println("Econstructor:\t"+Integer.toHexString(this.hashCode()));*/
}
}
