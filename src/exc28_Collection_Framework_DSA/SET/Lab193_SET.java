package exc28_Collection_Framework_DSA.SET;

import java.util.HashSet;

import java.util.*; //it will import all utils

public class Lab193_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Dutta");
        System.out.println(hs);

    }
}