public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();
        }
        public static void task1() {
            System.out.println("Задача 1");
            var dog = 8.0;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
        }
        public static void task2() {
            System.out.println("Задача 2");
            var dog = 8.0;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
        }
        public static void task3() {
            System.out.println("Задача 3");
            var dog = 8.0;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
        }
        public static void task4 () {
            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }
        public static void task5 () {
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
        }
        public static void task6 () {
            System.out.println("Задача 6");
            var weightOfTheFirstBoxer = 78.2;
            var weightOfTheSecondBoxer = 82.7;
            var totalWeight = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
            System.out.println("Общий вес двух боксеров " + totalWeight + " кг!");

            var differenceBeetwinWeights = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
            System.out.println("Разница между бойцами " + differenceBeetwinWeights + " кг!");
        }
        public static void task7 () {
            System.out.println("Задача 7");
            var weightOfTheFirstBoxer = 78.2;
            var weightOfTheSecondBoxer = 82.7;
            var differenceBeetwinWeights = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
            System.out.println("Разница между бойцами " + differenceBeetwinWeights + " кг!");

            var differenceBeetwinWeights2 = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
            System.out.println("Разница между бойцами " + differenceBeetwinWeights2 + " кг!");
        }
        public static void task8 () {
            System.out.println("Задача 8");
            var totalHours = 640;
            var hoursPerWorker = 8;
            var workers = totalHours / hoursPerWorker;
            System.out.println("Всего работников в компании - " + workers + " человек.");

            var totalWorkers = workers + 94;
            var totalHours2 = totalWorkers * hoursPerWorker;
            System.out.println("Если в компании работает " + totalWorkers + " человека, то всего " + totalHours2 +
                    " часа работы может быть поделено между сотрудниками.");
        }

}