package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {

        try {
            client.call();
        } catch (MycheckedException e) {
            System.out.println("예외처리, message = " + e.getMessage());

        }
        System.out.println("정상흐름");

    }

    public void catchThrow() throws MycheckedException {
        client.call();
    }

}
