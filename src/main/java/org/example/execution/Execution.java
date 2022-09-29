package org.example.execution;

import org.example.Rover.Coordinate;
import org.example.Rover.Direction;
import org.example.Rover.MarsRover;
import org.example.obsticle.Obsticle;

import java.util.List;

public class Execution implements BaseExecution {


    public Execution() {
    }



    private MarsRover rover;

    @Override
    public MarsRover solve(int x, int y, String directions, String Commands , List<Obsticle> obsticleList) {

        Direction direction = Direction.set(directions);
        Coordinate coordinate = new Coordinate(x, y);
        rover = new MarsRover(coordinate, direction , obsticleList);

        start(Commands);

        return rover;
    }


    public void start(String Commands) {
        for (char ch : Commands.toCharArray()) {
           if (! rover.makeCommand(ch )) break;
        }
    }
}