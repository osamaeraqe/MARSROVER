package org.example.execution;

import org.example.Rover.Coordinate;
import org.example.Rover.Direction;
import org.example.Rover.MarsRover;
import org.example.obsticle.Obsticle;

import java.util.List;

public class Execution implements BaseExecution {


    public Execution() {
    }

    private int x, y;
    private String directions = "", Commands = "";

    private MarsRover rover;

    @Override
    public MarsRover solve(int x, int y, String directions, String Commands , List<Obsticle> obsticleList) {
        this.x = x;
        this.y = y;
        this.directions = directions;
        this.Commands = Commands;


        Direction direction = Direction.set(directions);
        Coordinate coordinate = new Coordinate(x, y);
        rover = new MarsRover(coordinate, direction , obsticleList);

        start();

        return rover;
    }


    public void start() {
        for (char ch : Commands.toCharArray()) {
           if (! rover.makeCommand(ch )) break;
        }
    }
}