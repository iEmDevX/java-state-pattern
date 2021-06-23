package app.tools;

import app.Tool;

public class EraserTool implements Tool {
    @Override
    public void onClickLeft() {
        System.out.println("EraserTool onClickLeft");
    }

    @Override
    public void onClickRight() {
        System.out.println("EraserTool onClickLeft");
    }
}
