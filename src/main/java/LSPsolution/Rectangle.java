package LSPsolution;

public class Rectangle implements Shape, DoubleSided {

    private int width;
    private int height;

      public Rectangle(int w, int h) {
        width = w;
        h = height;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    @Override
    public int area() {
        return width * height;
    }
}
