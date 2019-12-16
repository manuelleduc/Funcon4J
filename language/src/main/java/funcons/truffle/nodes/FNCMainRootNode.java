package funcons.truffle.nodes;

import bench.BenchTool;
import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.values.signals.RunTimeFunconException;

public class FNCMainRootNode extends FNCRootNode {
    private final FNCStatementNode libs;

    public FNCMainRootNode(FNCLanguage fncLanguage, FNCExpressionNode clExecuteNode, FNCStatementNode libs) {
        super(fncLanguage, clExecuteNode);
        this.libs = libs;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            libs.executeVoid(frame);
        } catch (RunTimeFunconException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        Object execute = super.execute(frame);
        long end = System.currentTimeMillis();
        BenchTool.add(end - start);
        return 42;
    }
}
