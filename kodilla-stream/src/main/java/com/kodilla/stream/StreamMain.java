package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
        PoemDecorator decorator1 = text -> "ABC " + text + " ABC";
        PoemDecorator decorator2 = text -> text.toUpperCase();
        PoemDecorator decorator3 = text -> {
            char[] chars = text.toCharArray();
            String newText = "";
            for(int i = text.length() - 1; i >= 0; i--) {
                newText += "" + chars[i];
            }
            return newText;
        };
        PoemDecorator decorator4 = text -> {
            String newText = "";
            char[] chars = text.toCharArray();
            for(int i = 0; i < text.length(); i++) {
                newText += chars[i] + " ";
            }
            return newText;
        };
        beautifier.beatify("ala ma kota", decorator1);
        beautifier.beatify("ala ma kota", decorator2);
        beautifier.beatify("ala ma kota", decorator3);
        beautifier.beatify("ala ma kota", decorator4);
    }
}
