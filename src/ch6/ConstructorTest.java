package ch6;

public class ConstructorTest {
    public static void main(String[] args) {
        Data4 data4 = new Data4();
        Data5 data5 = new Data5(10);
    }
}

class Data4 {
    int value;
}

class Data5 {
    int value;

    Data5(int x) {
        value = x;
    }
}


