package demo;

public class DependencyInjectionPatternExample {
    public static void main(String[] args) {
        MessageService messageService = new SmsService();
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
