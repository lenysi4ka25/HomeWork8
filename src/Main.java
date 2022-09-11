public class Main {
    public static void main(String[] args) {
        // Задание 1. Задача 1
        System.out.println(" ");
        System.out.println("Задание 1");
        System.out.println("Задача 1");
        System.out.println(" ");
        int cash = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            totalSum = totalSum + totalSum / 100;
            totalSum = totalSum + cash;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        // Задание 1. Задача 2
        System.out.println(" ");
        System.out.println("Задание 1");
        System.out.println("Задача 2");
        System.out.println(" ");
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println(" ");
        for (int a = 10; a >= 1; a--)
            System.out.print(a + " ");
        {
            // Задание 1. Задача 3
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Задание 1");
            System.out.println("Задача 3");
            System.out.println(" ");
            long people = 12_000_000; // население страны
            long birthRate = people / 1000 * 17; // рождаемость: 17 человек на 1000 человек
            long mortality = people / 1000 * 8; // смертность: 8 человек на 1000 человек
            long differentPeople = 0; // прибавка за 1 год
            long peopleYear = 0;
            for (int year = 1; year <= 10; year++){
                differentPeople = birthRate - mortality;
                peopleYear = people + peopleYear + differentPeople;
                System.out.println("Год " + year + " численность населения составляет " + peopleYear + " человек.");}
            {// Задание 2. Задача 1
                System.out.println(" ");
                System.out.println("Задание 2");
                System.out.println("Задача 1");
                System.out.println(" ");
                double initialPayment = 15_000.00; //первоначальный взнос
                double percentPayment = 0.07; //7% процент банка
                for (int w = 1; initialPayment <=12_000_000; w++){
                    initialPayment = initialPayment + (initialPayment * percentPayment); //процент банка на остаток 1-ый месяц
                    System.out.println("Месяц: " + w + ", сумма накоплений " + Math.round(initialPayment) + " рублей.");}
                {// Задание 2. Задача 2
                    System.out.println(" ");
                    System.out.println("Задание 2");
                    System.out.println("Задача 2");
                    System.out.println(" ");
                    double totalPayment = 15_000.00;
                    double percent = 0.07;
                    for (int v = 1; totalPayment <=12_000_000; v++){
                        totalPayment = totalPayment + (totalPayment * percent);
                        if (v % 6 == 0){
                            System.out.println("Месяц: " + v + ", сумма накоплений " + Math.round(totalPayment) + " рублей.");}}
                    {// Задание 2. Задача 3
                        System.out.println(" ");
                        System.out.println("Задание 2");
                        System.out.println("Задача 3");
                        System.out.println(" ");
                        double totalPay = 15_000.00;
                        double percentPay = 0.07;
                        for (int age = 1; age <= 108; age++){
                            totalPay = totalPay + (totalPay * percentPay);
                            if (age % 6 == 0){
                                System.out.println("Месяц: " + age + ", сумма накоплений " + Math.round(totalPay) + " рублей.");}}
                        // Задание 2. Задача 4
                        System.out.println(" ");
                        System.out.println("Задание 2");
                        System.out.println("Задача 4");
                        System.out.println(" ");
                        int friday = 2;
                        int week = 7;
                        for (int t = friday; t <= 31; t = t + week){
                            System.out.println("Сегодня пятница, " + t + "-е число. Необходимо подготовить отчет.");
                        }
                        // Задание 3. Задача 1
                        System.out.println(" ");
                        System.out.println("Задание 3");
                        System.out.println("Задача 1");
                        System.out.println(" ");
                        int yearCometa = 1896;
                        for (int hm = yearCometa; hm <= 2054; hm = hm + 79){
                            System.out.println(hm);}
                        // Задание 3. Задача 2
                        System.out.println(" ");
                        System.out.println("Задание 3");
                        System.out.println("Задача 2");
                        System.out.println(" ");
                        for (int d = 1; d <= 2; d = d + 1){
                            for (int r = 1; r <= 10; r = r + 1) {
                                if (d % 2 == 0)
                                    System.out.println(d + " * " + r + " = " + d * r);
                            }
                            System.out.println();
                        }
                    }
                }

            }}}}