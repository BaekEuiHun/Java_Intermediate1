package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {

        String address = "http:aaaa.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("연결오류" + e.getAddress() + "메시지" + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("전송오류" + e.getSendData() + "메시지" + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
