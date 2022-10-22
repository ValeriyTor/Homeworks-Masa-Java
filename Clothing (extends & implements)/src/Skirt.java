public class Skirt extends Clothes implements WomanClosing
{
    Skirt(ClothingSize sizeClothes, int prise, String color)
    {
        this.sizeClothes = sizeClothes;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public void dressWoman() {
        System.out.println("Мы одели юбку на женщину! Цена: " + prise + ". Размер:" + sizeClothes + ". Цвет:" + color);
    }
}
