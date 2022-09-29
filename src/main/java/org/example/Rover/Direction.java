package org.example.Rover;

public enum Direction {
    NORTH("NORTH"),
    SOUTH("SOUTH"),
    EAST("EAST"),
    WEST("WEST"),
    ;

    private String dir;
    Direction(String dir) {
        this.dir = dir;
    }

    public static Direction set(String directionSign) {
        switch (directionSign) {
            case "EAST":
                return EAST;
            case "WEST":
                return WEST;
            case "NORTH":
                return NORTH;
            case "SOUTH":
                return SOUTH;
            default:
                throw new IllegalStateException("Unknown rover.Direction Sign");
        }
    }

    Direction RotateRight(){
        switch (this){
            case NORTH :
                return EAST;
            case EAST:
                return SOUTH ;
            case SOUTH:
                return WEST;
            default:
                return NORTH;
        }
    }
    Direction RotateLeft(){
        switch (this){
            case EAST:  return NORTH;
            case SOUTH: return EAST ;
            case WEST:  return SOUTH;
            default: return WEST;
        }
    }




}
