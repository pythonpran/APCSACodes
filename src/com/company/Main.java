package com.company;

public class Main {

    public static void main(String[] args) {
    // Math.ceil - (rounds upwards, returns double_
    // Math.exp - returns the value on with a parameter of an exponent & a base of e
    System.out.println(Math.exp(1));
    // Math.floor - rounds downward, returns double
    // Math.log() has a log with a base of e Math.log10() has a base of 10
    // Math.round - rounds the number to nearest integer, returns integer value
	System.out.println(Math.toDegrees(2 * Math.PI));
	// can accept int double double int double double etc, double gains higher priority
    System.out.println(Math.max(75,76));

    String s = "hello";
    // returns char based on 0 1 2 .. index format
    System.out.println(s.charAt(1));
    // returns true if string ends with this
    System.out.println(s.endsWith("llo"));
    // returns -1 if not found, based on 0 1 2 ... index scale
    System.out.println(s.indexOf("j"));
    }
}
