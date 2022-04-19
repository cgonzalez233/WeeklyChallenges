package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Dependencies {

    public List<String> dependencyOrder(String[] projects, String[][] dependencies){
        List<String> output = new ArrayList<>();
        int count = 0;

        for (String project : projects) {
            for (String[] dependency : dependencies) {
                if (!project.equals(dependency[1])) {
                    count++;
                }
            }
            if (count == dependencies.length) {
                output.add(project);
            }
            count = 0;
        }

        for(int i=0; i<output.size(); i++) {
            for (String[] dependency : dependencies) {
                if (output.get(i).equals(dependency[0]) && !output.contains(dependency[1])) {
                    output.add(dependency[1]);
                }
            }
        }

        return output;
    }
}
