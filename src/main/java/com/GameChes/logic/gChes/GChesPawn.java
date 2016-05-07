package com.GameChes.logic.gChes;

import com.GameEngine.logic.coordinate.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация для Pawn.
 */
public class GChesPawn extends GChes {

    @Override
    public List<Coordinate> countValidCoordinates() {
        ArrayList<Coordinate> points = new ArrayList<>();
        points.add(new Coordinate(getX(), getY() - 1));
        if (getDynamicValues().getParameterInt(NAME_PARAMETER_NUMBER_MOVE)<=0) {
            points.add(new Coordinate(getX(), getY() - 2));
        }
        return points;
    }
}
