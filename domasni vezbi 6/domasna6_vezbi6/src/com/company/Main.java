package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int i;
	List<String>st=new ArrayList<String>();
    for( i=1;i<=20;i++)
    {
            st.add("mail"+i+"@yahoo.com");
    }
    for( i=0;i<st.size();i++);
        {
            System.out.println(st.get(i));
        }
    }
}
