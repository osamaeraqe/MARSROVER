package org.example.obsticle;

import org.example.Rover.Coordinate;
import org.example.Rover.Direction;
import org.example.Rover.spaceObject;

public class Obsticle extends spaceObject {


    public Obsticle(int x, int y, String direction){
       super(new Coordinate(x,y) , Direction.set(direction));

    }

   public Coordinate getCoordinate(){
        return coordinate;
    }
  public   Direction getDirection(){
        return direction;
    }

}
