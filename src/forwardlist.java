public class forwardlist<T> {
    element<T> Head;
    int size;
    public forwardlist(){
        this.Head=null;
        size=0;
        System.out.println("LConstrucotr:\t"+Integer.toHexString(hashCode()));
    }
    public void push_front(T Data)
    {
        // element New=new element(Data);
      // New.setNext(Head);
      // Head=New;
        Head = new element(Data, Head);
        size++;
    }

    public void push_back(T Data){
        if(Head==null){
            push_front(Data);
            return;
        }
        element<T> Temp = Head;
        while(Temp.getNext()!=null)Temp=Temp.getNext();
        Temp.setNext(new element(Data));
        size++;
    }
    public void pop_front(){
        Head=Head.getNext();
    }
    public void pop_back(){
        element Temp=Head;
        while(Temp.getNext().getNext()!=null)Temp=Temp.getNext();
        Temp.setNext(null);
        size--;
    }
    void insert(T Data, int Index){
        if(Index==0){
            push_front(Data);
            return;
        }
        if(Index>size){
            return;
        }
        element<T> Temp=Head;
        for(int i =0;i<Index-1;i++)Temp=Temp.getNext();
       // element New=new element(Data);
       // New.setNext(Temp.getNext());
       // Temp.setNext(New);
        Temp.setNext((new element(Data,Temp.getNext())));
        size++;
    }
    forwardlist(forwardlist<T> other){
        System.out.println("LCopyConstructor:"+Integer.toHexString((hashCode())));
        for(element<T> temp=other.Head;temp!=null;temp=temp.getNext())
            this.push_back(temp.getData());
    reverse();
    }
    public void reverse(){
        forwardlist<T> reverse=new forwardlist<T>();
        while(Head!=null){
            reverse.push_front(Head.Data);
            pop_front();
        }
        this.Head=reverse.Head;
        reverse.Head=null;
    }
    public void print(){
        element<T> Temp=Head;
        while(Temp!=null){
            System.out.print(Temp.getData()+"\t");
            Temp=Temp.getNext();
        }
        public void pop_back(){
            element<T> temp=Head;
            while(temp.getNext().getNext()!=null)temp=temp.getNext();
            temp.setNext(null);
            size--;
        }
    }
}

