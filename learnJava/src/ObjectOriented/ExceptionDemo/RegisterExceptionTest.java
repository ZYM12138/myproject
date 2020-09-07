package ObjectOriented.ExceptionDemo;

public class RegisterExceptionTest {
    private static String[] names = {"bili", "hill", "jill"};

    public static void main(String[] args) {
        try {
            checkUsername("bili");
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }


    public static boolean checkUsername(String username) throws RegisterException {
        for (String name : names) {
            if (name.equals(username)) {
                throw new RegisterException("用户名已占用");
            }
        }
        return true;
    }
}
