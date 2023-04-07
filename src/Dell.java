public class Dell extends Notebook implements Printable{
    private int year;
    private String version;

    public Dell(String name, int year, String version) {
        super(name);
        this.year = year;
        this.version = version;
    }

    @Override
    public void print() {
        System.out.println("Название ноутбука: " + getName());
        System.out.println("Год выпуска: " + year);
        System.out.println("Версия: " + version);

        System.out.println();

    }
}
