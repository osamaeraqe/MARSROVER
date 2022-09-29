package org.example.Rover;

import org.example.obsticle.Obsticle;

import java.util.List;

public class MarsRover extends spaceObject{
   // private  Coordinate coordinate;
   // private Direction direction;


List<Obsticle> obsticleList;
    public MarsRover(Coordinate coordinate , Direction direction , List<Obsticle> obsticleList ){
        super(coordinate , direction);
        this.obsticleList= obsticleList;
       // this.coordinate = coordinate;
        //this.direction = direction;
    }
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Direction getDirection() {
        return direction;
    }



    public Boolean makeCommand(char ch )
    {
        if (ch == 'R') {RotateRight();}
        else  if (ch == 'L') {RotateLeft();}
        else if (ch == 'F'){

            if(CanMove(MoveForward() , this.direction ))
          this.coordinate =   MoveForward();
            else {

                return false;
            }
        }
        else
        {

            if(CanMove(MoveBackword() , this.direction ))
                this.coordinate =   MoveBackword();
            else {

                return false;
            }
        }

        return true;
    }

   void stop(Obsticle obsticle){
       System.out.println("CAN'T MOVE:: STOPPED");
       System.out.println("OBSTICLE DIRECTION [" + obsticle.getCoordinate().getX() + ", " +obsticle.getCoordinate().getY() + "]\n"+obsticle.getDirection().name() );
    }
public Boolean CanMove(Coordinate coordinate , Direction direction){


    for (Obsticle obsticle:obsticleList) {
        if(direction == obsticle.direction)
        {
            if( (coordinate.getX() == obsticle.coordinate.getX()
                    && coordinate.getY() == coordinate.getY())){
                stop(obsticle);
                return false;
            }
        }
    }

        return true;
}
    public void RotateRight(){
        direction = direction.RotateRight();
    }
    public void RotateLeft(){
        direction = direction.RotateLeft();
    }


    public Coordinate MoveForward(){
        return coordinate.stepForward(direction);
    }
    public Coordinate MoveBackword(){
       return    coordinate.stepBackword(direction);
    }
}
