import com.sun.jdi.Value;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();
        List list = new List();
        for(int i = 0; i < n; i++)
        {
            /*list.push_front(rand.nextInt(100));*/
            list.push_back(rand.nextInt(100));
        }
        list.print();
       /* list.reverse_print();
//        list.pop_front();
//        list.pop_back();
        list.clear();
        list.print();
        list.reverse_print();*//*
        list.print();*/

        //                      insert
        System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index= kb.nextInt();
        list.insert(value,index);
        list.print();
        //


    }
}