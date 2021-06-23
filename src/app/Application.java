package app;

import app.tools.BrushTool;
import app.tools.EraserTool;
import app.tools.SelectionTool;

public class Application {
    public static void main(String[] arg){
        System.out.println("Start Application");
        Canvas canvas = new Canvas();

        System.out.println("--> select brush");
        canvas.tool = new BrushTool();
        canvas.leftClick();
        canvas.rightClick();

        System.out.println("--> select eraser");
        canvas.tool = new EraserTool();
        canvas.leftClick();
        canvas.rightClick();

        System.out.println("--> select selection");
        canvas.tool = new SelectionTool();
        canvas.leftClick();
        canvas.rightClick();
    }
}
