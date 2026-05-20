public abstract class Item {
    protected String nama;
    protected int price;

    public Item(String nama, int price) {
        this.nama = nama;
        this.price = price;
    }

    public String getName() {
        return this.nama;
    }

    public void planToBuy(int kuantitas) {
        int totalHarga = this.price * kuantitas;
        System.out.println("You have to pay " + totalHarga);
    }

    public abstract void showDetailAttributes();
}