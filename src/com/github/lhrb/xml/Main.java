package com.github.lhrb.xml;

public class Main {

    public static void main(String[] args) {
        // simple showcase

        System.out.println(
                Tag.create("node")
                        .attr("name", "value")
                        .children(
                                Tag.create("child")
                                        .attr("a", "b").attr("e", "f")
                                        .text("hallo"),
                                Tag.create("nestedChild")
                                        .attr("c", "d")
                                        .children(Tag.create("leaf").text("leafNode")))
                        .xmlString(0));

        System.out.println(
                Tag.create("hallo")
                        .attr("a", "b").attr("c","d")
                .text("text")
                .xmlString(0));

        System.out.println(Tag.create("hallo")
                .text("text")
                .xmlString(1));
    }
}
