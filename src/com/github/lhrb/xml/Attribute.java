package com.github.lhrb.xml;

public class Attribute
{
    private final String name;
    private final String value;

    Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String xmlString()
    {
        return String.format("%s=\"%s\"", name, value);
    }
}
