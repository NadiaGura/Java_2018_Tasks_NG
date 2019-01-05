package lv.javaguru.demo.Lecture10;


public class UserValidationService {

    public void validate(User user) {
        if (user.age < 0 || user.age > 120) {
            throw new ValidationException("Age must be between 0 and 120");
        }
        if (user.name.length() < 3 || user.name.length() > 15) {
            throw new ValidationException("Name shall be between 3 and 15 letters");
        }
        if (user.lastName.length() < 3 || user.lastName.length() > 15) {
            throw new ValidationException("Last Name shall contain from 3 to 15 letters");
        }
    }
}
