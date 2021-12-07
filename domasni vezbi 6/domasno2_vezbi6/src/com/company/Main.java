package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	List<String>drzavi=new ArrayList<String>();
    drzavi.add("Makedonija");
    drzavi.add("Srbija");
    drzavi.add("Finska");
    System.out.println("Goleminata na listata e"+" "+drzavi.size());
    drzavi.add("Romanija");
    drzavi.add("Spanija");
    System.out.println("Posle dodavanje na dopolnitelni dva elementi, elementite vo listata se:"+" "+drzavi+" "+"Goleminata sega e"+" "+drzavi.size());
    }
}
