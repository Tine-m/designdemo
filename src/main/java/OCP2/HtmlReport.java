package OCP2;

class HtmlReport extends Report {

    public HtmlReport(String content) {
        super(content);
    }

    @Override
    public void generate() {
        System.out.println("Generating HTML: " + content);
    }
}
