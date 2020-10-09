package demo;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Đây là nơi triển khai SMS");
    }
}
