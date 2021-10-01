package com.github.lhrb.xml;

import java.util.List;

public class Node implements Tag {
    private final String name;
    private final List<Attribute> attributes;
    private final List<Tag> children;

    private Node(String name, List<Attribute> attributes, List<Tag> children) {
        this.name = name;
        this.attributes = attributes;
        this.children = children;
    }

    static Tag create(String name, List<Attribute> attributes, List<Tag> children) {
        return new Node(name, attributes, children);
    }

    @Override
    public String xmlString(Integer depth) {
        String depthPrefix = Tag.depthToSpacePrefix(depth);

        String start = String.format(
                "%s<%s%s>\n",
                depthPrefix,
                name,
                Tag.attrsToStr(attributes)
        );

        String end = String.format(
                "%s</%s>\n",
                depthPrefix,
                name
        );

        var stringBuilder = new StringBuilder();

        stringBuilder.append(start);

        for (Tag c : children) {
            stringBuilder.append(c.xmlString(depth + 1));
        }

        stringBuilder.append(end);

        return stringBuilder.toString();
    }
}
