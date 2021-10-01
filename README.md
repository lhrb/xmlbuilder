# Xmlbuilder
this is a just a proof of concept.

Xml-String generation for simple documents.
```java
Tag.create("node")
  .attr("name", "value")
  .childs(
          Tag.create("child")
            .attr("a", "b").attr("e", "f")
            .text("hallo"),
          Tag.create("nestedChild")
            .attr("c", "d")
            .childs(Tag.create("leaf").text("leafNode")))
  .xmlString(0)
  
/*
=>
<node name="value">
  <child a="b" e="f">hallo</child>
  <nestedChild c="d">
    <leaf>leafNode</leaf>
  </nestedChild>
</node>
*/
```
