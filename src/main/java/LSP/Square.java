package LSP;

/*
Liskov Substituion principle
Not good: Square breaks the expectation of Rectangle
Fix it by introducing an interface for Rectangle
and Square instead.
Use the Shape interface and change main accordingly.
 */
public class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        this.width = w;
        this.height = w;
    }

    @Override
    public void setHeight(int h) {
        this.width = h;
        this.height = h;
    }
}
