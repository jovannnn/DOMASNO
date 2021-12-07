package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	List<String>st=new ArrayList<String>();
    int i;
    for(i=5;i<=20;i+=5)
    {
        st.add("mail"+i+"@yahoo.com");
    }
    for(i=0;i<st.size();i++)
    {
        System.out.println(st.get(i));
    }
    }
}
