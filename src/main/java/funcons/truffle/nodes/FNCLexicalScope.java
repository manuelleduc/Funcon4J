package funcons.truffle.nodes;

import com.oracle.truffle.api.frame.FrameSlot;

import java.util.HashMap;
import java.util.Map;

public class FNCLexicalScope {
    protected final FNCLexicalScope outer;
    public final Map<String, FrameSlot> locals;

    public FNCLexicalScope(FNCLexicalScope outer) {
        this.outer = outer;
        this.locals = new HashMap<>();
        if (outer != null) {
            locals.putAll(outer.locals);
        }
    }
}
