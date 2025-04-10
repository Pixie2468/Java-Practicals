class ArgumentGreaterThanOne extends Exception {
    public ArgumentGreaterThanOne(String str) {
        super(str);
    }
}

public class Practical32 {
    public static void main(String[] args) throws ArgumentGreaterThanOne {
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOne("More Than One Argument is Entered!!");
            } else {
                System.out.println("One Argument is Entered");
            }
        } catch (ArgumentGreaterThanOne a) {
            System.out.println("Exception Caught: " + a.getMessage());
        }
    }
}
