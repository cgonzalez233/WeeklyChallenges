package com.revature;


public class Main
{
    public static void main( String[] args ) {
        String[] projects = new String[] {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = new String[][]{{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}};
        Dependencies dependency = new Dependencies();

        System.out.println("Dependency Order: " + dependency.dependencyOrder(projects, dependencies));

    }
}
