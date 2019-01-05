package lv.javaguru.demo.Lecture10;

public class UserValidationServiceTest {
    public static void main(String[] args) {

        User user1 = new User(25, "Paul", "Smith");
        User user2 = new User(45, "Sam", "Peterson");
        User user3 = new User(50, "Jane", "Carter");

        UserValidationService service = new UserValidationService();
        service.validate(user1);
        service.validate(user2);
        service.validate(user3);

        System.out.println("Test PASSED.");
    }
}
