package com.codedifferently.problems;

import java.util.ArrayList;
import java.util.Collections;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        Integer targetIndex = cousins.indexOf(targetName);
        if (Math.abs(targetIndex - startIndex)  <Math.abs(cousins.size() - startIndex ))
            return Math.abs(targetIndex-startIndex);
        return cousins.size()-startIndex;
    }
}
