package Task_3;

import java.util.Iterator;
import java.util.List;

public class StreamComparator implements Iterator<Integer> {
    private int groupList;
    private int counter;
    private List<Integer> collection;

    public StreamComparator(Stream streamGroup) {
        this.groupList = streamGroup.getQuantityGroup();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList;
    }

    @Override
    public Integer next() {
        Integer result = null;
        if (hasNext()) {
            result = groupList;
        }
        return result;
    }

    @Override
    public void remove() {
        if (hasNext()) {
            collection.remove(counter - 1);
            counter--;
            groupList--;
        }
    }
}
