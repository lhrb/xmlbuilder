package com.github.lhrb.xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseTag implements Tag
{
    private final String name;
    private final List<Attribute> attributes;

    BaseTag(String name)
    {
        this.name = name;
        attributes = new ArrayList<>();
    }

    public BaseTag attr(String name, String value) {
        attributes.add(new Attribute(name, value));
        return this;
    }

    public Tag text(String text) {
        return Leaf.create(name, attributes, text);
    }

    public Tag childs(Tag... childs) {
        return Node.create(name, attributes, Arrays.asList(childs));
    }

    @Override
    public String xmlString(Integer depth) {


        return "";
    }
}
