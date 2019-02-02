package utilities;

public enum DataSize {
    TEN(10),
    MILLION(5000000),
    THOUSAND(500000);

    final int size;

    DataSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
