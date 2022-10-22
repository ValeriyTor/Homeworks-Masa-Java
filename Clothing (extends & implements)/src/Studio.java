public class Studio {

    static void ManClosing(Clothes[] clothes)
    {
        System.out.println("Одеть мужчину");
        for (Clothes count: clothes) {
            if (count instanceof ManClosing) {
                ((ManClosing) count).dressMan();
            }
        }
    }
    static void WomanClosing(Clothes[] clothes)
    {
        System.out.println("Одеть женщину");
        for (Clothes count: clothes) {
            if (count instanceof WomanClosing) {
                ((WomanClosing) count).dressWoman();
            }
        }
    }

}
