package com.practice.ds.stack.djkstrastnterpretor;

public class App {

	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		algo.interpretExpression("( ( 1 + 2 ) * ( 2 - 5 ) )");
		algo.result();
	}

}
