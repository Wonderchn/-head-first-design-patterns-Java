package 命令模式;

public class CommandPattern {
    public static void main(String[] args) {
        SaveButton saveButton = new SaveButton();
        TextBox box = new TextBox();

        PrintCommand printCommand = new PrintCommand(box);
        saveButton.bindCommand(printCommand);

        box.setContext("ABCDEFH");
        saveButton.doPrint();

        box.setContext("ABCDEFG");
        saveButton.doPrint();
    }
}



class SaveButton{
    private Command command;
    /**
     * 此处省略渲染的逻辑
     */

    public void bindCommand(Command command){
        this.command = command;
    }

    public void doPrint(){
        if (command == null){
            throw new RuntimeException("设备初始化失败");
        }
    }
}

/**
 * [业务逻辑层]打印服务
 */
class PrintService{
    public void print(String text){
        System.out.println(text);
    }
}


interface Command{
    void execute();
}


class PrintCommand implements Command{
    private PrintService printService = new PrintService();
    private TextBox box;

    public PrintCommand(TextBox box){
        this.box = box;
    }

    @Override
    public void execute() {
        printService.print(box.getContext());
    }
}


class TextBox{
    private String context;

    public String getContext(){
        return context;
    }

    public void setContext(String context){
        this.context = context;
    }

}