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

        forwardlist d_list=new forwardlist();
        d_list.push_back(2.7);
        d_list.push_back(3.4);
        d_list.push_back(5.1);
        d_list.push_back(8.3);
        d_list.print();
forwardlist s_list=new forwardlist();
s_list.push_back("Хорошо");
        s_list.push_back("Живёт");
        s_list.push_back("На");
        s_list.push_back("Свете");
        s_list.push_back("винни");
        s_list.push_back("пух");
        s_list.print();
        forwardlist s_list_2=new forwardlist(s_list);
        s_list_2.push_back(3.14);
        s_list_2.push_back(true);
s_list_2.print();
    }
}