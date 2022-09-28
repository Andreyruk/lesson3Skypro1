public class Main {
        public static void main(String[] args) {
      //Домашнее задание 1
        //Задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
      //Домашнее задание 2
        //Задача 4
        var frend = 19;
        System.out.println(frend);
        frend=frend+2;
        System.out.println(frend);
        frend = frend / 7;
        System.out.println(frend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
      //Домашнее задание 2
        //Задача 6
            var weightBoxerFirst=78.2;
            var weightBoxerSecond=82.7;
            var totalWeight=weightBoxerFirst+weightBoxerSecond;
                System.out.println("Общий вес боксёров " + totalWeight + " кг");
            var differenceWeights = weightBoxerFirst-weightBoxerSecond;
                System.out.println("Разница между весами боксёров " + (Math.abs(differenceWeights)) + " кг");
        //Задача 7
                differenceWeights = weightBoxerSecond - weightBoxerFirst;
                System.out.println("Разница между весами боксёров " + (differenceWeights) + " кг");
                differenceWeights = weightBoxerSecond % weightBoxerFirst;
                System.out.println("Разница между весами боксёров " + (differenceWeights) + " кг");
        //Задача 8
                var totalHours=640;
                var hoursPerEmployee=8;
                var Employees= totalHours/hoursPerEmployee;
                System.out.println("Всего работников в компании – " + Employees + " человек");
                var additionalEmployees=94;
                var totalEmployees=Employees+additionalEmployees;
                var clockSeparation=totalHours/totalEmployees;
                System.out.println("Если в компании работает " + totalEmployees +" человека, то всего " + clockSeparation +" часа работы может быть поделено между сотрудниками");
    }
}