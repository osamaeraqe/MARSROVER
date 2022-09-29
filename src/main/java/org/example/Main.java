package org.example;

import org.example.Rover.MarsRover;
import org.example.execution.BaseExecution;
import org.example.execution.executionFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,m, q ;
        String x = "";
        String s = "";
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        x = scan.next();
        s = scan.next();


        BaseExecution execution = executionFactory.getExecInstance();

        //MarsRover rover =  execution.solve(n,m,x,s);

     //   System.out.println(rover.getCoordinate().getX() + " " + rover.getCoordinate().getY() + " " + rover.getDirection().name());

    }
}