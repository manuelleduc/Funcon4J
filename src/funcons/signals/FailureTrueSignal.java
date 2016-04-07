package funcons.signals;

public class FailureTrueSignal implements Signal {
    private String message;

    public FailureTrueSignal(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
