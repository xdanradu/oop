package com.des;

public class Main {

    private static void process(Strategy algorithm){
        algorithm.compute();
    }

    public static void main(String[] args) {
	String option ="US";

	Strategy algorithm;
	if(option == "EU") {
	    algorithm = new EUAlgorithm();
    } else {
        algorithm = new USAlgorithm();
    }

    }
}
