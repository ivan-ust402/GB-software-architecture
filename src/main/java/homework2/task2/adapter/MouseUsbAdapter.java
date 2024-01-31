package homework2.task2.adapter;

public class MouseUsbAdapter implements Usb{
    private final Mouse mouse;
    public MouseUsbAdapter(Mouse mouse){
        this.mouse = mouse;
    }
}
