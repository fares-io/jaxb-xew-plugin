# Jakarta XML Binding (JAXB) `@XmlElementWrapper` Plugin

**NOTE:**

This project is functionally compatible but updated to work with the JAXB 4 compatible [HighSource jaxb-maven-plugin](https://github.com/highsource/jaxb-tools).

For plugin documentation and examples please visit the original project [`jaxb-xew-plugin`](https://github.com/dmak/jaxb-xew-plugin).

## License

The whole project is licensed under [LGPLv3](http://www.gnu.org/licenses/lgpl-3.0.html) (or any later version).

## Usage

All `jaxb-maven-plugin` versions ≥ 4.0.0 work with this `jaxb-xew-plugin`. For older versions please visit the original project [`jaxb-xew-plugin`](https://github.com/dmak/jaxb-xew-plugin)

```xml
<plugin>
  <groupId>org.jvnet.jaxb</groupId>
  <artifactId>jaxb-maven-plugin</artifactId>
  <version>4.0.0</version>
  <configuration>
    <extension>true</extension>
    <plugins>
      <plugin>
        <groupId>io.fares.bind.xjc.plugins</groupId>
        <artifactId>jaxb-xew-plugin</artifactId>
        <version>2.1.0</version>
      </plugin>
    </plugins>
    <args>
      <arg>-Xxew</arg>
    </args>
  </configuration>
</plugin>
```
