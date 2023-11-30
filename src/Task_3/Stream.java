package Task_3;

public class Stream implements Comparable<Stream> {
    private final int quantityGroup;
    
    public Stream(int quantityGroup) {
        this.quantityGroup = quantityGroup;
    }

    public int getQuantityGroup() {
        return quantityGroup;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "quantityGroup=" + quantityGroup +
                '}';
    }
    
    @Override
    public int compareTo(Stream o) {
        if (quantityGroup > o.getQuantityGroup())
            return 1;
        if (quantityGroup < o.getQuantityGroup())
            return -1;
        return 0;
    }
}

