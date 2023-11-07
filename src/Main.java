import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random(0);
        System.out.print("Enter list size: ");
        int n = scan.nextInt();

        forwardlist list = new forwardlist();
        for(int i=0;i<n;i++){
            list.push_front(rand.nextInt(100));
        }
        list.print();
       /* System.out.print("enter adding num value: ");
        int value=scan.nextInt();
       System.out.print("enter inxed of adding num: ");
        int index=scan.nextInt();
       list.insert(value,index);
        list.print();*/

        /*forwardlist list2= new forwardlist(list);
        list2.print();
        list.pop_back();
        list.print();
        list2.print();*/

        long start_time=System.nanoTime();
        forwardlist list2=new forwardlist(list);
        long end_time=System.nanoTime();
        System.out.println("элемент добавлен за %f секунд".formatted((double)(end_time-start_time)*1e-9));

    }
}