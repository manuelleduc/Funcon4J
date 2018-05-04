package funcons.truffle.functions;

import funcons.truffle.nodes.FNCTypes;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.nodes.Node;
import io.usethesource.vallang.IInteger;

@TypeSystemReference(FNCTypes.class)
public abstract class FNCTypeToForeignNode extends Node {
    public abstract Object executeConvert(Object value);

    @Specialization
    static IInteger fromIInteger(IInteger value) {
        return value;
    }

//    @Specialization
//    static TruffleObject fromObject(BigInteger value) {
//        return new SLBigNumber(value);
//    }

    @Fallback
    static Object identity(Object value) {
        return value;
    }
}
