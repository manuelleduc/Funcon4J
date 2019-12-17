package funcons.truffle.auxiliary;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.values.NullNullNode;
import funcons.values.Variable;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;


@NodeInfo(description = "Print Print Node")
public class PrintPrintNode extends FNCExpressionNode {

    private final FNCLanguage l;

    @Child
    private FNCExpressionNode x;


    public PrintPrintNode(FNCExpressionNode x, FNCLanguage l) {
        this.x = x;
        this.l = l;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object o = x.executeGeneric(frame);
        final String data;
        if (o instanceof Variable) {
            data = String.valueOf(((Variable) o).value());
        } else {
            data = String.valueOf(o);
        }
        final OutputStream out = l.getContextReference().get().getEnv().out();
        try {
            IOUtils.write(data, out, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new NullNullNode().executeGeneric(frame);
    }
}
