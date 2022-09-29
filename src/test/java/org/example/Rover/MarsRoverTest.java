package org.example.Rover;

import org.example.obsticle.Obsticle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    MarsRover rover;
    List<Obsticle> obsticleList;
    @BeforeEach
    void setUp() {
        obsticleList.add(new Obsticle(5, 5 , "WEST"));
        obsticleList.add(new Obsticle(2, 5 , "NORTH"));
        Coordinate coordinate = new Coordinate(2,3);
        Direction direction=Direction.set("NORTH");
        rover = new MarsRover(coordinate , direction , obsticleList);

    }


    @Test
    void SHOULDrotateRight() {
         rover.RotateRight();
         assertEquals("EAST" , rover.getDirection().name());
    }

    @Test
    void rotateLeft() {
        rover.RotateLeft();

        assertEquals("WEST" , rover.getDirection().name());
    }

    @Test
    void moveForward() {

        rover.MoveForward();

        assertEquals(4 , rover.getCoordinate().getY());
    }

    @Test
    void moveBackword() {
        rover.MoveBackword();

        assertEquals(2 , rover.getCoordinate().getY());

    }
}