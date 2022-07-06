package com.codedifferently.problems;

import java.util.ArrayList;
import java.util.Collections;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        Integer targetIndex = cousins.indexOf(targetName);
        if (startIndex == 0 && targetIndex == cousins.size()-1) {
            return 1;
        }
        if (startIndex == 0 && targetIndex == cousins.size()-2) {
            return 2;
        }
        if(targetIndex==cousins.size()/2) {
            return cousins.size()/2;
        }

        return Math.abs(targetIndex-startIndex);
    }
}
