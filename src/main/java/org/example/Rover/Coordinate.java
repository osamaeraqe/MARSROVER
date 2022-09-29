package org.example.Rover;

public class Coordinate {

    private int X;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    private int Y ;
    public Coordinate(int X , int Y ){
        this.X = X;
        this.Y = Y;
    }

    Coordinate  stepForward(Direction dir){
        switch (dir){
            case EAST:
                X++;
                return new Coordinate(X , Y);
            case WEST:
                X--;
                return new Coordinate(X , Y);
            case NORTH:
                Y++;
                return new Coordinate(X , Y);
            default:
                Y--;
                return new Coordinate(X , Y);
        }

        //  return this;
    }

    Coordinate  stepBackword(Direction dir){
        switch (dir){
            case EAST:
                X--;
                return new Coordinate(X , Y);
            case WEST:
                X++;
                return new Coordinate(X , Y);
            case NORTH:
                Y--;
                return new Coordinate(X , Y);
            default:
                Y++;
                return new Coordinate(X , Y);
        }

    }

}
