package app;

public class Canvas {
    public Tool tool;

    public void leftClick() {
        tool.onClickLeft();
    }

    public void rightClick() {
        tool.onClickRight();
    }
}
