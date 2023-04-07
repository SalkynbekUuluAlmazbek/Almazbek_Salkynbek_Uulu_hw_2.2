public abstract class Notebook implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    public Notebook(String name) {
        this.name = name;

    }

    @Override
    public void print() {

    }
}
