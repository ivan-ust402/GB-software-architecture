package homework3.ISP;

// Это плохой пример жирного интерфейса, когда в нем есть все,
// при имплементации этого интерфейса в разные классы, если класс не должен
// по поведенчиским признакам делать что-то из списка нашего интерфейса нам
// все равно придется переопрделять эти методы и делать заглушки, а этого
// не должно происходить, поэтому нужно переписать данный интерфейс

//public interface IMultitool {
//    void cut();
//    void knock();
//    void chop();
//    void foldCompactly();
//}
public interface IMultitool extends IKnock, IChop, ICut{
    void foldCompactly();
}
