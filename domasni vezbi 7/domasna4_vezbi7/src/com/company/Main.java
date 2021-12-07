package com.company;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
	Set<Integer>prvo=new HashSet<Integer>();
    Set<Integer>vtoro=new HashSet<Integer>();
    prvo.add(5);
    prvo.add(6);
    prvo.add(7);
    prvo.add(8);
    System.out.println("Elementi na prvoto mnozestvo se"+" "+prvo);

    vtoro.add(3);
    vtoro.add(4);
    vtoro.add(5);
    vtoro.add(6);
    vtoro.add(7);
        System.out.println("Elementi na vtoroto mnozestvo se"+" "+vtoro);
        vtoro.remove(3);
        vtoro.remove(4);
        System.out.println("Presek na mnozestvoto e"+" "+vtoro);

    }
}
