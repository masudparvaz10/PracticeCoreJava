package abstrac;

public class AutoPizzaMachine {
    public static void main(String[] args) {
        PizzaMachine Pizza = new PizzaMachine();
        Pizza.selectFoodMenu();
        Pizza.selectTopping();
        Pizza.takingMoney();
        Pizza.makingFood();
        Pizza.rapingFood();
    }
}
