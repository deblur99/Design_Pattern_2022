package Observer.Test1;

import java.util.ArrayList;

public class Cell implements CellObserver {
    ArrayList<CellObserver> cells;
    private String message;
    private String desc;

    public Cell(String message) {
        cells = new ArrayList<CellObserver>();
        this.message = message;
    }

    @Override
    public void addCell(Cell cell) {
        cells.add(cell);
    }

    @Override
    public void removeCell(Cell cell) {
        cells.add(cell);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        updateAll();
    }

    public void display() {
        System.out.println(message);
    }

    private void exec() {
        this.message = String.format("\"%s\" is changed", this.message);
    }

    @Override
    public void update() {
        exec();
    }

    @Override
    public void updateAll() {
        for (CellObserver cell: cells) {
            cell.update();
        }
    }
}
