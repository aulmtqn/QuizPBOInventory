public class Shield extends Item {
    private int armour;
    public Shield(String nama, int price, int armour) {
        super(nama, price);
        this.armour = armour;
    }

    @Override
    public void showDetailAttributes (){
        System.out.println("This "+ nama + " Protects " + armour);
    }
}
