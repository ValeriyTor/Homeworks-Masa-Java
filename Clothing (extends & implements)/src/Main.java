public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Clothes[] array ={
                new Tshirt(ClothingSize.S, 100, "розовый" ),
                new Tshirt(ClothingSize.XS, 180, "красный" ),
                new Skirt(ClothingSize.M, 120, "серый" ),
                new Skirt(ClothingSize.S, 280, "черный" ),
                new Tie(ClothingSize.L, 140, "золотой" ),
                new Tie(ClothingSize.M, 220, "синий" ),
                new Pants(ClothingSize.S, 110, "белый" ),
                new Pants(ClothingSize.XS, 155, "зеленый" )
        };
        Studio.ManClosing(array);
        System.out.println("");
        Studio.WomanClosing(array);
    }
}