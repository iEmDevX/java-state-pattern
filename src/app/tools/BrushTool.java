package app.tools;

import app.Tool;

public class BrushTool implements Tool {

    @Override
    public void onClickLeft() {
        System.out.println("BrushTool onClickLeft");
    }

    @Override
    public void onClickRight() {
        System.out.println("BrushTool onClickRight");
    }

}
