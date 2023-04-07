public class Asus extends Notebook implements Printable{
    private int ram;
    private int core;

    public Asus(String name, int ram, int core) {
        super(name);
        this.ram = ram;
        this.core = core;
    }

    @Override
    public void print() {
        System.out.println("Название ноутбука: " + getName());
        System.out.println("Оперативная память: " + ram + " ГБ");
        System.out.println("Поколение i" + core);

        System.out.println();

    }
}
