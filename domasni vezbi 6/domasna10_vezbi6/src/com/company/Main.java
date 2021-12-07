package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	List<String>n=new ArrayList<String>();
    List<String>m=new ArrayList<String>();
    n.add("Eden");
    n.add("Dva");
    n.add("Tri");
    n.add("Cetiri");
    System.out.println("Elementite na prvata lista se"+" "+n);

    m.add("Sest");
    m.add("Sedum");
    m.add("Eden");
    m.add("Dva");
    m.add("Tri");
    System.out.println("Elementite na vtorata lista se"+" "+m);
    m.remove("Sest");
    m.remove("Sedum");
    System.out.println("Presekot e"+" "+m);

    }
}
