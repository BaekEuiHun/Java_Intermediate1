package nested.nested.ex1;

import org.w3c.dom.ls.LSOutput;

public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

}
