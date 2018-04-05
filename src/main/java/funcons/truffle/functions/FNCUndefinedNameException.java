package funcons.truffle.functions;

public class FNCUndefinedNameException extends RuntimeException {
    public static FNCUndefinedNameException undefinedFunction(String name) {
        return new FNCUndefinedNameException();
    }
}
