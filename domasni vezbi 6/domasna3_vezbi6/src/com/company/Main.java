package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	List<String>fikt=new ArrayList<String>();
    fikt.add("INKI");
    fikt.add("IKT");
    System.out.println("Smerovite vo FIKT se:"+" "+fikt);
    fikt.add(2,"Menagment");
    System.out.println("Listata so noviot smer izgleda:"+" "+fikt);
    }
}
