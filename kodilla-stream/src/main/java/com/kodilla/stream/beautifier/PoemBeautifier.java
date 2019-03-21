package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beatify(String text, PoemDecorator decorator) {
        String finalText = decorator.decorate(text);
        System.out.println(finalText);
    }
}
