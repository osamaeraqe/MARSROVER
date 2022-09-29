package org.example.execution;

public class executionFactory {


    private static BaseExecution base;

//Singleton
    public static BaseExecution getExecInstance(){
        if (base == null){
            base = new Execution() ;
        }
        return base;
    }

}
