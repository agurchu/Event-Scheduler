package agurchu.codewithritmo.io;

public interface Io {
    void println(String message);
    void print(String message);
    int anyInteger(String prompt);
    float anyFloat(String prompt);
    String anyString(String prompt);
}