package com.codedifferently.problems;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        Integer count = 0;
        for( int i =0;i<input.length();i++) {
            Character charAt = input.charAt(i);
            if (charAt.toString().equalsIgnoreCase(letter) ) {
                count++;
            }
        }

        return count;
    }
}
