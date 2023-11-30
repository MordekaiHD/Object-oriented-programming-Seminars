package Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SreamServis {
    private StreamGroup quantityGroup;

    public SreamServis(StreamGroup quantityGroup) {
        this.quantityGroup = quantityGroup;
    }

    public StreamGroup getQuantityGroup() {
        return quantityGroup;
    }

    public List<Stream> getSortedStreamGroup(){
        List<Stream> studentList = new ArrayList<>(quantityGroup.getStreamList());
        Collections.sort(studentList);
        return studentList;
    }
}
