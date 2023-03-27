public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int age;
        age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int temperature;
        temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        temperature = 20;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");

        int speed;
        speed = 55;
        if (speed <= 60) {
            System.out.println("Превышенияч скорости нет. Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Скопрость превышена! Если скорость " + speed + ", то придется заплатить штраф");
        }

        speed = 80;
        if (speed <= 60) {
            System.out.println("Превышения скорости нет. Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Скорость превышена! Если скорость " + speed + ", то придется заплатить штраф");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 4;
        if (age <= 5) {
            System.out.println("Если возраст человека равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");

        int passengersNumber = 30;
        if (passengersNumber > 60 && passengersNumber < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (passengersNumber < 42) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("Вагон переполнен");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int one;
        int two;
        int three;

        one = 25;
        two = 30;
        three = 9;

        if (one > two && two > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && one > three) {
            System.out.println("Число " + two + " самое большое" );
        } else {
            System.out.println("Число " + three + " самое большое");
        }
    }
}
