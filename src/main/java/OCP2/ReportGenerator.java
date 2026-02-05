package OCP2;

class ReportGenerator {

    // open for extension - but unfortunate also open for changes
    public void generate(String type, String content) {
        if (type.equals("pdf")) {
            System.out.println("Generating PDF: " + content);
        } else if (type.equals("html")) {
            System.out.println("Generating HTML: " + content);
        } else if (type.equals("text")) {
            System.out.println("Generating TEXT: " + content);
        }
    }
}
