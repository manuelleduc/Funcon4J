package funcons.truffle.nodes;

import bench.BenchTool;
import com.oracle.truffle.api.frame.VirtualFrame;

public class FNCMainRootNode extends FNCRootNode {

    @Child
    private FNCExpressionNode libs;

    public FNCMainRootNode(FNCLanguage fncLanguage, FNCExpressionNode clExecuteNode, FNCExpressionNode libs) {
        super(fncLanguage, clExecuteNode);
        this.libs = libs;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        libs.executeGeneric(frame);
        long start = System.currentTimeMillis();
        Object execute = super.execute(frame);
        long end = System.currentTimeMillis();
        BenchTool.add(end - start);
        //return execute;
        return 1;
    }
}
