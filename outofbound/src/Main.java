import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            int[] nums = {1, 2, 3};
            System.out.println("Введите индекс: ");
            int index = scan.nextInt();
            int element = nums[index]; // Попытка получить элемент массива по некорректному индексу
            System.out.println("Элемент массива: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс выходит за границы массива!");
        }
    }
}
