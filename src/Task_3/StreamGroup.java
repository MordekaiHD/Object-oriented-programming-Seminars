package Task_3;


import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<Stream> {
    private List<Stream> streamList;

    public StreamGroup(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<Stream> getStreamList() {
        return streamList;
    }
    public void addStream(Stream stream){
        streamList.add(stream);
    }

    @Override
    public Iterator<Stream> iterator() {
        return streamList.iterator();
    }
}
