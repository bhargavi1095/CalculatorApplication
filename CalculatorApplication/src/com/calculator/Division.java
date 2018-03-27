package com.calculator;

public class Division implements Operation {
	// a and b are operators
	int a;
	int b;
	
	public Division(){
		
	}
	public Division(int a, int b) {
	
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
    public int perform() {
    	return a/b;
    }
}
