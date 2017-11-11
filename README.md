# Ballerina Sample connector

This is a sample native client connector implementation for Ballerina.

1. Build this with `mvn clean install`
2. Copy the jar file to `<BALLERINA_HOME>/bre/lib` folder

Write a sample program to use the connector as follows in a file `testConnector.bal`

```ballerina
import sample.con.print;

function main(string[] args) {
    endpoint<print:PrintConnector> ep {
        create print:PrintConnector();
    }
    boolean result = ep.printText("sample text");
    println("result - " + result);
}
```
and run the program using the command `ballerina run testConnector.bal`
