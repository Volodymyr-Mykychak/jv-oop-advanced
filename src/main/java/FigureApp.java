import core.basesyntax.model.Figure;
import suppliers.ColorSupplier;
import suppliers.FigureSupplier;

import java.util.Random;

public class FigureApp {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
