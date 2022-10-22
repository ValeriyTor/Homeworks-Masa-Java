public class Pants extends Clothes implements ManClosing, WomanClosing
{
    Pants(ClothingSize sizeClothes, int prise, String color)
    {
        this.sizeClothes = sizeClothes;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Мы одели штаны на мужчину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Мы одели штаны на женщину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }
}