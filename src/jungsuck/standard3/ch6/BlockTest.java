package jungsuck.standard3.ch6;

public class BlockTest {
    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }

    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

}
