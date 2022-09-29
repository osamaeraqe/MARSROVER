package org.example.execution;

import org.example.Rover.MarsRover;
import org.example.obsticle.Obsticle;

import java.util.List;

public interface BaseExecution {

    public MarsRover solve (int x , int y , String direction , String Commands  , List<Obsticle> obsticleList);
}
