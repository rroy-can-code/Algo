package com.practice.ds.stack.djkstrastnterpretor;

import java.util.Stack;
import static com.practice.ds.stack.djkstrastnterpretor.Operators.*;

public class Algorithm {
	private Stack<String> operators;
	private Stack<Double> numbers;

	public Algorithm() {
		operators = new Stack<String>();
		numbers = new Stack<Double>();
	}

	public void interpretExpression(String expression) {
		String[] expArr = expression.split(" ");
		for (String s : expArr) {
			if (s.equals(START_BRACE)) {

			} else if (s.equals(PLUS)) {
				this.operators.push(s);
			} else if (s.equals(MULT)) {
				this.operators.push(s);
			} else if (s.equals(MINUS)) {
				this.operators.push(s);
			} else if (s.equals(DIV)) {
				this.operators.push(s);
			} else if (s.equals(END_BRACE)) {

				String operation = this.operators.pop();
				if (operation.equals(PLUS)) {
					this.numbers.push(this.numbers.pop() + this.numbers.pop());
				} else if (operation.equals(MINUS)) {
					this.numbers.push(this.numbers.pop() - this.numbers.pop());
				} else if (operation.equals(MULT)) {
					this.numbers.push(this.numbers.pop() * this.numbers.pop());
				} else {
					this.numbers.push(this.numbers.pop() / this.numbers.pop());
				}
			} else {
				this.numbers.push(Double.parseDouble(s));
			}
		}
	}

	public void result() {
		System.out.println(this.numbers.pop());
	}

}
