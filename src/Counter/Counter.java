package Counter;

public class Counter implements AutoCloseable{
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        this.count += 1;
    }

    @Override
    public void close() throws Exception {
        count = 0;
    }
}
