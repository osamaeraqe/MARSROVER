package org.example.execution;

import org.example.Rover.Coordinate;
import org.example.Rover.Direction;
import org.example.Rover.MarsRover;
import org.example.obsticle.Obsticle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExecutionTest {


    MarsRover rover;
    BaseExecution execution;
    List<Obsticle> obsticleList;
    @BeforeEach
    void setUp() {
        Coordinate coordinate = new Coordinate(2,3);
        Direction direction=Direction.set("NORTH");
        obsticleList = new ArrayList<Obsticle>();
        obsticleList.add(new Obsticle(5, 5 , "WEST"));
        obsticleList.add(new Obsticle(2, 5 , "NORTH"));

        rover = new MarsRover(coordinate , direction , obsticleList);
         execution = executionFactory.getExecInstance();
    }



    @Test
    void SHOULDsolve() {
        //Execution Process from make object of MarsRover to Get OUTPUT
        rover= execution.solve(2,3, "NORTH" , "FFFFFF" , obsticleList);

        assertEquals("NORTH" , rover.getDirection().name());
        assertEquals( 4, rover.getCoordinate().getY());
    }


}