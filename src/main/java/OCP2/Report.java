package OCP2;

abstract class Report {

    protected final String content;

    public Report(String content) {
        this.content = content;
    }

    public abstract void generate();
}
