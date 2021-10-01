package com.github.lhrb.xml;

import java.util.List;

public class Leaf implements Tag {
    private final String name;
    private final List<Attribute> attributes;
    private final String text;

    private Leaf(String name, List<Attribute> attributes, String text) {
        this.name = name;
        this.attributes = attributes;
        this.text = text;
    }

    static Tag create(String name, List<Attribute> attributes, String text) {
        return new Leaf(name, attributes, text);
    }

    @Override
    public String xmlString(Integer depth) {
        return String.format("%s<%s%s>%s</%s>\n",
                Tag.depthToSpacePrefix(depth),
                name,
                Tag.attrsToStr(attributes),
                text,
                name);
    }
}
