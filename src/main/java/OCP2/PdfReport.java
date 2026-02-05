package OCP2;

class PdfReport extends Report {

    public PdfReport(String content) {
        super(content);
    }

    @Override
    public void generate() {
        System.out.println("Generating PDF: " + content);
    }
}
