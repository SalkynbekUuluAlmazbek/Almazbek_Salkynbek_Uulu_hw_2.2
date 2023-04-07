public class Hp extends Notebook implements Printable{
    private String model;
    private int storage;

    public Hp(String name, String model, int storage) {
        super(name);
        this.model = model;
        this.storage = storage;
    }

    @Override
    public void print() {
        System.out.println("Название ноутбука: " + getName());
        System.out.println("Модель: " + model);
        System.out.println("Память: " + storage + " ГБ");

        System.out.println();
    }

}

