public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dogs - " + dog + ", cats - " + cat + ", paper - " + paper + ". ");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Dogs - " + dog + ", cats - " + cat + ", paper - " + paper + ". ");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Dogs - " + dog + ", cats - " + cat + ", paper - " + paper + ". ");

        var friend = 19;

        System.out.println("Friends - " + friend + ". ");

        friend = friend + 2;

        System.out.println("Friends - " + friend + ". ");

        friend = friend / 7;

        System.out.println("Friends - " + friend + ". ");

        var frog = 3.5;

        System.out.println("Frogs - " + frog + ". ");

        frog = frog * 10;

        System.out.println("Frogs - " + frog + ". ");

        frog = frog / 3.5;

        System.out.println("Frogs - " + frog + ". ");

        frog = frog + 4;

        System.out.println("Frogs - " + frog + ". ");

        var FirstBoxerWeight = 78.2;
        var SecondBoxerWeight  = 82.7;

        System.out.println("Weight of the first boxer - " + FirstBoxerWeight);
        System.out.println("Weight of the second boxer - " + SecondBoxerWeight);

        var TotalWeight = FirstBoxerWeight + SecondBoxerWeight;

        System.out.println("Total weight = " + TotalWeight + ". ");

        var DifferenceWeight = SecondBoxerWeight - FirstBoxerWeight;

        System.out.println("Difference in weght - " + DifferenceWeight + ". ");

        DifferenceWeight = SecondBoxerWeight %  FirstBoxerWeight;

        System.out.println("Also, difference in weght - " + DifferenceWeight + ". " );

        var Hours = 640;
        var WorkingTime = 8;
        var Worker = Hours / WorkingTime;

        System.out.println("Workers - " + Worker + ", hours - " + Hours + ", working time - " + WorkingTime + ". ");
        System.out.println("Всего работников в день в компании - " + Worker + " человек. ");

        Worker = Worker + 94;
        Hours = WorkingTime * Worker;

        System.out.println("Workers - " + Worker + ", hours - " + Hours + ", working time - " + WorkingTime + ". ");
        System.out.println("Если в компании работает на 94 человека больше (" + Worker + "), то между ними может быть поделено " + Hours + " рабочих часа. ");
    }
}