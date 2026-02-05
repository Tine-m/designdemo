package OCP2;

public class TxtReport extends Report {

    public TxtReport(String content) {
        super(content);
    }

    @Override
    public void generate() {
        System.out.println("Text report " + content);
    }
}
