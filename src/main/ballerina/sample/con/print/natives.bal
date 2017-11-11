package sample.con.print;

public connector PrintConnector() {
    native action printText(string text)(boolean);
}