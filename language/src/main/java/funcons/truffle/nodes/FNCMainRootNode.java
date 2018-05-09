package funcons.truffle.nodes;

import bench.BenchTool;
import com.oracle.truffle.api.frame.VirtualFrame;

public class FNCMainRootNode extends FNCRootNode {
    public FNCMainRootNode(FNCLanguage fncLanguage, FNCExpressionNode clExecuteNode) {
        super(fncLanguage, clExecuteNode);
    }

    @Override
    public Object execute(VirtualFrame frame) {
        long start = System.currentTimeMillis();
        Object execute = super.execute(frame);
        long end = System.currentTimeMillis();
        BenchTool.add(end - start);
        return execute;
    }
}
