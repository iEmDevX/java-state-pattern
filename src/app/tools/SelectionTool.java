package app.tools;

import app.Tool;

public class SelectionTool implements Tool {
    @Override
    public void onClickLeft() {
        System.out.println("SelectionTool onClickLeft");
    }

    @Override
    public void onClickRight() {
        System.out.println("SelectionTool onClickLeft");
    }
}
