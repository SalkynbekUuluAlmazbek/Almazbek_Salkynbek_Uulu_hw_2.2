public class Main {
    public static void main(String[] args) {
        Hp hpNotebook = (Hp) createObject("Hp");
        hpNotebook.print();
        Dell dellNotebook = (Dell) createObject("Dell");
        dellNotebook.print();
        Asus asusNotebook = (Asus) createObject("Asus");
        asusNotebook.print();

    }

    public static Notebook createObject(String className) {
        Notebook notebook = null;
        switch (className) {
            case "Hp":
                notebook = new Hp("HP","new", 512);
                break;
            case "Dell":
                notebook = new Dell("DELL",2023,"first");
                break;
            case "Asus":
                notebook = new Asus("ASUS",16,7);
                break;
            default:
                System.out.println("Ошибочный  набор");

        }
        return notebook;

    }
}