import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose: " +
                "1)Калькулятор\n" +
                "2)тест\n" +
                "3)кальклятор switch\n");
        x = scan.nextInt();
        if (x == 1) {
            int a, b, c;

            System.out.println("enter first num: ");
            a = scan.nextInt();
            System.out.println("Select operation: \n" +
                    "1)+\n" +
                    "2)-\n" +
                    "3)*\n" +
                    "4)/\n");
            b = scan.nextInt();
            System.out.println("enter second num: ");
            c = scan.nextInt();
            if (b == 1) {
                System.out.println(a + "+" + c + "=" + (a + c));
            }
            if (b == 2) {
                System.out.println(a + "-" + c + "=" + (a - c));
            }
            if (b == 3) {
                System.out.println(a + "*" + c + "=" + (a * c));
            }
            if (b == 4) {
                System.out.println(a + "/" + c + "=" + (a / c));
            }
        }
        if (x == 2) {
            int cor = 0;
            System.out.println("Столица России?");//1
            System.out.print("1)Пекин\n" +
                    "2)Токио\n" +
                    "3)Москва\n" + //+
                    "4)нью-йорк\n" +
                    "Введите номер ответа: \n");
            int a = scan.nextInt();

            if (a == 3) {
                cor += 1;
            } else {
                System.out.println("Правильный ответ: 3) Москва");
            }

            System.out.println("30+10");//2
            System.out.print("1)40\n" +//+
                    "2)50\n" +
                    "3)60\n" +
                    "4)70\n" +
                    "Введите номер ответа: \n");
            int b = scan.nextInt();

            if (b == 1) {
                cor += 1;
            } else {
                System.out.println("Правильный ответ: 1)40");
            }

            System.out.println("Какого цвета солнце?");//3
            System.out.print("1)Зелёный\n" +
                    "2)Голубой\n" +
                    "3)Жёлтый\n" + //+
                    "4)Коричневый\n" +
                    "Введите номер ответа: \n");
            int c = scan.nextInt();

            if (c == 3) {
                cor += 1;
            } else {
                System.out.println("Правильный ответ: 3) Жёлтый");
            }

            System.out.println("Какого цвета свежая трава");//4
            System.out.print("1)Фиолетовый\n" +
                    "2) Зелёный\n" + //+
                    "3)Коричневый\n" +
                    "4)чёрный\n" +
                    "Введите номер ответа: \n");
            int d = scan.nextInt();

            if (d == 2) {
                cor += 1;
            } else {
                System.out.println("Правильный ответ: 2) Зелёный");
            }

            System.out.println("Что на земле вырабатывает больше всего кислорода?");//5
            System.out.print("1)Деревья\n" +
                    "2)Трава\n" +
                    "3)Фитопланктон\n" +//+
                    "4)Камни\n" +
                    "Введите номер ответа: \n");
            int f = scan.nextInt();

            if (f == 3) {
                cor += 1;
            } else {
                System.out.println("Правильный ответ: 3) Фитопланктон");
            }
            System.out.println("Колличество правильных ответов: " + cor);
        }
        if (x == 3) {
            int a,b,c;
            System.out.println("enter first num: ");
            a= scan.nextInt();
            System.out.println("enter second num: ");
            b= scan.nextInt();
            System.out.println("Select operation: \n" +
                    "1)+\n" +
                    "2)-\n" +
                    "3)*\n" +
                    "4)/\n");
            c= scan.nextInt();
            switch(c){
                case 1:c=1;
                    System.out.println(a+"+"+b+"="+a+b);
                    break;
                case 2: c=2;
                    System.out.println(a + "-" + c + "=" + (a - c));
                    break;
                case 3: c=3;
                    System.out.println(a + "*" + c + "=" + (a * c));
                    break;
                case 4: c=4;
                    System.out.println(a + "/" + c + "=" + (a / c));
                    break;
            }
        }
    }
}