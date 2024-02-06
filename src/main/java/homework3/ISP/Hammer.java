package homework3.ISP;

public class Hammer implements IKnock{
    @Override
    public void knock() {
        System.out.println("Молоток забивает или выбивает что-либо");
    }
}
