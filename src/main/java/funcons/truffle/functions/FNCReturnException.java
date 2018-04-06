package funcons.truffle.functions;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class FNCReturnException extends ControlFlowException {

    private final Object result;

    public FNCReturnException(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
