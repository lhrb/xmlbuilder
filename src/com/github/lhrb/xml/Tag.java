package com.github.lhrb.xml;

import java.util.List;

public interface Tag {
    String xmlString(Integer depth);

    static BaseTag create(String name) {
        return new BaseTag(name);
    }

    static String depthToSpacePrefix(Integer depth) {
        var stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("  ");
        }
        return stringBuilder.toString();
    }

    static String attrsToStr(List<Attribute> attributes) {
        if (attributes.isEmpty()) return "";

        String attr = attributes.stream()
                .map(Attribute::xmlString)
                .reduce("", (s, e) -> s + " " + e);

        return attr;
    }
}
