package Observer.Test1;

public interface CellObserver {
    void update();

    void addCell(Cell cell);

    void removeCell(Cell cell);

    void updateAll();
}
