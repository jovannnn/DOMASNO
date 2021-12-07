package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	List<Integer>broevi=new ArrayList<Integer>();
    broevi.add(6);
    broevi.add(10);
    broevi.add(23);
    broevi.add(4);
    broevi.add(1);
    System.out.println("Broevite vo listata se"+" "+broevi);

    Collections.sort(broevi);
    System.out.println("Posle sortiranjeto"+" "+broevi);
    }
}
