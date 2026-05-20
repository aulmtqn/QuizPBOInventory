public class Sword extends Item{
    private int damage;

    public Sword(String nama, int price, int damage) {
        super(nama, price);
        this.damage = damage;
    }

    @Override
    public void showDetailAttributes(){
        System.out.println("This "+ nama + " damages " + damage);
    }
}
