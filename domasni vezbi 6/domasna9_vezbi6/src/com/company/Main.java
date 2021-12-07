package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        List<Fakultet>n=new ArrayList<Fakultet>();
        Fakultet s=new Fakultet("FIKT",11,2350);
        n.add(s);
        n.add(new Fakultet("FINKI",23,5000));
        n.add(new Fakultet("Sv.Apostol Pavle",2,1000));
        n.add(new Fakultet("Pedagoski",1,678));
        n.add(new Fakultet("PMF",3,7000));
        n.add(new Fakultet("Turizam",2,235));
        for(int i=0;i<n.size();i++)
        {
            System.out.println(n.get(i).getimeFak());
            System.out.println(n.get(i).getbrojSmerovi());
            System.out.println(n.get(i).getvkupnoStudenti());
        }

    }
}
