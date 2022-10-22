public class Tie extends Clothes implements ManClosing
{
    Tie(ClothingSize sizeClothes, int prise, String color)
    {
        this.sizeClothes = sizeClothes;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Мы одели галстук на мужчину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }

}