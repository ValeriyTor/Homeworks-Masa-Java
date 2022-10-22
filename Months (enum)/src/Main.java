public class Main {
    public static void main(String[] args) {
        int a = 0;
        Month month = Month.MARCH;
        a = Month.getTemprature(month);
        System.out.println("твой месяц: " + month + ". Средняя температура: " + a);
//        for (Month seasons: Month.values()) {
//            System.out.println("твой месяц: " + seasons + ". Средняя температура: " + seasons.getAverageTemperature());
//
//        }
    }


}

