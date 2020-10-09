public class UserController {
    private EmailService emailService = new EmailService();

    public void send() {
        emailService.sendEmail("Hello Dependency injection pattern");
    }

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.send();
    }
}

