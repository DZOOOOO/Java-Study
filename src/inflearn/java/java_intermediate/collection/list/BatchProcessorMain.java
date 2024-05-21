package inflearn.java.java_intermediate.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(1000_000);
    }
}
