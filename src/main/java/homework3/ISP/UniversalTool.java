package homework3.ISP;

public class UniversalTool implements IMultitool{
    @Override
    public void chop() {
        System.out.println("Универсальный инструмент рубит");
    }

    @Override
    public void cut() {
        System.out.println("Универсальный инструмент режет");
    }

    @Override
    public void knock() {
        System.out.println("Универсальный инструмент забивает");
    }

    @Override
    public void foldCompactly() {
        System.out.println("Универсальный инструмент компактно складывается");
    }
}
