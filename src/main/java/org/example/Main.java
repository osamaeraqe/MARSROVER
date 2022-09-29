package org.example;

import org.example.Rover.Coordinate;
import org.example.Rover.MarsRover;
import org.example.execution.BaseExecution;
import org.example.execution.executionFactory;
import org.example.obsticle.Obsticle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y ;
        String direction = "";
        String CommandString = "";
        List < Obsticle>obsticleList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        direction = scan.next();
        CommandString = scan.next();
        obsticleList.add(new Obsticle(2,3, "NORTH"));
        obsticleList.add(new Obsticle(7,5, "EAST"));

        BaseExecution execution = executionFactory.getExecInstance();

        MarsRover rover =  execution.solve(x ,y , direction , CommandString , obsticleList);

        System.out.println(rover.getCoordinate().getX() + " " + rover.getCoordinate().getY() + " " + rover.getDirection().name());

    }
}