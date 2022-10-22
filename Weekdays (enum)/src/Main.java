public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1");
        System.out.println("----------------");
        System.out.println("Is day a weekday?");
        for (Weekday count: Weekday.values())
        {
            System.out.println(count + " - " + Weekday.isWeekDay(count));
        }
        System.out.println("----------------");
        System.out.println("Is day a holiday?");
        for (Weekday count: Weekday.values())
        {
            System.out.println(count + " - " + Weekday.isHoliday(count));
        }

        System.out.println("End of Question 1");
        System.out.println(" ");

        System.out.println("Question 2");
        System.out.println("----------------");
        Weekday sat = Weekday.SATURDAY;
        for (Weekday count: Weekday.values())
        {
            System.out.println(count + " - " + count.compareTo(sat));
        }
        System.out.println("End of Question 2");
    }
}

