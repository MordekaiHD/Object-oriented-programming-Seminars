package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Stream> streamList = new ArrayList<>();
        streamList.add(new Stream(50));
        streamList.add(new Stream(100));
        streamList.add(new Stream(150));
        streamList.add(new Stream(200));

        StreamGroup streamGroup = new StreamGroup(streamList);
        SreamServis service = new SreamServis(streamGroup);

        for (Stream stream : service.getSortedStreamGroup()) {
            System.out.println(stream);
        }
    }
}
