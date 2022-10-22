public class Tshirt extends Clothes implements ManClosing, WomanClosing
{
    Tshirt(ClothingSize sizeClothes, int prise, String color)
    {
        this.sizeClothes = sizeClothes;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Мы одели футблоку на мужчину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Мы одели футблоку на женщину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }
}
