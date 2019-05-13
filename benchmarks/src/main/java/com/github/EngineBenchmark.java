package com.github;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Engine;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.CachedContext;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.RootNode;

@Warmup(iterations = 10)
@Measurement(iterations = 5)
public class EngineBenchmark extends TruffleBenchmark {

//    private static final String TEST_LANGUAGE = "benchmark-test-language";
//
//    private static final String CONTEXT_LOOKUP = "contextLookup";
//
//    @Benchmark
//    public Object createEngine() {
//        return Engine.create();
//    }
//
//    @Benchmark
//    public Object createContext() {
//        return Context.create();
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Thread)
//    public static class ContextLookupSingleContext {
//        final Source source = Source.newBuilder(TEST_LANGUAGE, "1", CONTEXT_LOOKUP).buildLiteral();
//        final Context context = Context.create(TEST_LANGUAGE);
//        final Value value = context.eval(source);
//
//        public ContextLookupSingleContext() {
//        }
//
//        @TearDown
//        public void tearDown() {
//            context.close();
//        }
//    }
//
//    private static final int CONTEXT_LOOKUP_ITERATIONS = 1000;
//
//    @Benchmark
//    public void lookupContextSingleContext(ContextLookupSingleContext state) {
//        state.context.enter();
//        for (int i = 0; i < CONTEXT_LOOKUP_ITERATIONS; i++) {
//            state.value.executeVoid();
//        }
//        state.context.leave();
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Thread)
//    public static class ContextLookupMultiContext {
//        final Source singleLookup = Source.newBuilder(TEST_LANGUAGE, "1", CONTEXT_LOOKUP).buildLiteral();
//        final Source multiLookup = Source.newBuilder(TEST_LANGUAGE, "50", CONTEXT_LOOKUP).buildLiteral();
//        final Engine engine = Engine.create();
//        final Context context1 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Context context2 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Context context3 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Value value1 = context1.eval(singleLookup);
//        final Value value2 = context2.eval(singleLookup);
//        final Value value3 = context3.eval(singleLookup);
//        final Value multiLookup1 = context1.eval(multiLookup);
//
//        public ContextLookupMultiContext() {
//        }
//
//        @TearDown()
//        public void tearDown() {
//            context1.close();
//            context2.close();
//            context3.close();
//        }
//    }
//
//    @Benchmark
//    public void lookupContextMultiContextManyLookups(ContextLookupMultiContext state) {
//        state.context1.enter();
//        for (int i = 0; i < CONTEXT_LOOKUP_ITERATIONS; i++) {
//            state.multiLookup1.executeVoid();
//        }
//        state.context1.leave();
//    }
//
//    @Benchmark
//    public void lookupContextMultiContext(ContextLookupMultiContext state) {
//        state.context1.enter();
//        for (int i = 0; i < CONTEXT_LOOKUP_ITERATIONS; i++) {
//            state.value1.executeVoid();
//        }
//        state.context1.leave();
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Benchmark)
//    public static class ContextLookupMultiThread {
//
//        final Source source = Source.newBuilder(TEST_LANGUAGE, "1", CONTEXT_LOOKUP).buildLiteral();
//        final Context context = Context.create(TEST_LANGUAGE);
//        final Value value = context.eval(source);
//
//        public ContextLookupMultiThread() {
//        }
//
//        @TearDown
//        public void tearDown() {
//            context.close();
//        }
//
//    }
//
//    @Benchmark
//    @Threads(10)
//    public void lookupContextMultiThread(ContextLookupMultiThread state) {
//        state.context.enter();
//        for (int i = 0; i < CONTEXT_LOOKUP_ITERATIONS; i++) {
//            state.value.executeVoid();
//        }
//        state.context.leave();
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Benchmark)
//    public static class ContextLookupMultiThreadMultiContext {
//        final Source source = Source.newBuilder(TEST_LANGUAGE, "1", CONTEXT_LOOKUP).buildLiteral();
//        final Engine engine = Engine.create();
//        final Context context1 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Context context2 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Context context3 = Context.newBuilder(TEST_LANGUAGE).engine(engine).build();
//        final Value value1 = context1.eval(source);
//        final Value value2 = context2.eval(source);
//        final Value value3 = context3.eval(source);
//
//        public ContextLookupMultiThreadMultiContext() {
//        }
//
//        @Setup(Level.Trial)
//        public void enterThread() {
//        }
//
//        @TearDown
//        public void tearDown() {
//            context1.close();
//            context2.close();
//            context3.close();
//        }
//    }
//
//    @Benchmark
//    @Threads(10)
//    public void lookupContextMultiThreadMultiContext(ContextLookupMultiThreadMultiContext state) {
//        state.context1.enter();
//        for (int i = 0; i < CONTEXT_LOOKUP_ITERATIONS; i++) {
//            state.value1.executeVoid();
//        }
//        state.context1.leave();
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Thread)
//    public static class ContextState {
//        final Source source = Source.create(TEST_LANGUAGE, "");
//        final Context context = Context.create(TEST_LANGUAGE);
//        final Value value = context.eval(source);
//        final Integer intValue = 42;
//        final Value hostValue = context.asValue(new Object());
//
//        @TearDown
//        public void tearDown() {
//            context.close();
//        }
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Thread)
//    public static class ContextStateEnterLeave extends ContextState {
//
//        public ContextStateEnterLeave() {
//            context.enter();
//        }
//
//        @Override
//        public void tearDown() {
//            context.leave();
//            super.tearDown();
//        }
//    }
//
//    @Benchmark
//    public Object eval(ContextState state) {
//        return state.context.eval(state.source);
//    }
//
//    @Benchmark
//    public void executePolyglot1(ContextState state) {
//        state.value.execute();
//    }
//
//    @Benchmark
//    public void executePolyglot1Void(ContextState state) {
//        state.value.executeVoid();
//    }
//
//    @Benchmark
//    public void executePolyglot1VoidEntered(ContextStateEnterLeave state) {
//        state.value.executeVoid();
//    }
//
//    @Benchmark
//    public Object executePolyglot1CallTarget(CallTargetCallState state) {
//        return state.callTarget.call(state.internalContext.object);
//    }
//
//    @Benchmark
//    public int executePolyglot2(ContextState state) {
//        int result = 0;
//        Value value = state.value;
//        result += value.execute(state.intValue).asInt();
//        result += value.execute(state.intValue, state.intValue).asInt();
//        result += value.execute(state.intValue, state.intValue, state.intValue).asInt();
//        result += value.execute(state.intValue, state.intValue, state.intValue, state.intValue).asInt();
//        return result;
//    }
//
//    @State(org.openjdk.jmh.annotations.Scope.Thread)
//    public static class CallTargetCallState {
//        final Source source = Source.create(TEST_LANGUAGE, "");
//        final Context context = Context.create(TEST_LANGUAGE);
//        {
//            context.initialize(TEST_LANGUAGE);
//        }
//        final Value hostValue = context.asValue(new Object());
//        final BenchmarkContext internalContext = hostValue.asHostObject();
//        final Integer intValue = 42;
//        final CallTarget callTarget = Truffle.getRuntime().createCallTarget(new RootNode(null) {
//
//            private final Integer constant = 42;
//
//            @Override
//            public Object execute(VirtualFrame frame) {
//                return constant;
//            }
//        });
//
//        @TearDown
//        public void tearDown() {
//            context.close();
//        }
//    }
//
//    @Benchmark
//    public Object executeCallTarget2(CallTargetCallState state) {
//        CallTarget callTarget = state.callTarget;
//        int result = 0;
//        result += (int) callTarget.call(state.internalContext.object, state.intValue);
//        result += (int) callTarget.call(state.internalContext.object, state.intValue, state.intValue);
//        result += (int) callTarget.call(state.internalContext.object, state.intValue, state.intValue, state.intValue);
//        result += (int) callTarget.call(state.internalContext.object, state.intValue, state.intValue, state.intValue, state.intValue);
//        return result;
//    }
//
//    @Benchmark
//    public Object isNativePointer(ContextState state) {
//        return state.value.isNativePointer();
//    }
//
//    @Benchmark
//    public Object asNativePointer(ContextState state) {
//        return state.value.asNativePointer();
//    }
//
//    @Benchmark
//    public Object hasMembers(ContextState state) {
//        return state.value.hasMembers();
//    }
//
//    @Benchmark
//    public void putMember(ContextState state) {
//        state.value.putMember("42", state.intValue);
//    }
//
//    @Benchmark
//    public Object getMember(ContextState state) {
//        return state.value.getMember("42");
//    }
//
//    @Benchmark
//    public Object hasArrayElements(ContextState state) {
//        return state.value.hasArrayElements();
//    }
//
//    @Benchmark
//    public Object getArrayElement(ContextState state) {
//        return state.value.getArrayElement(42);
//    }
//
//    @Benchmark
//    public Object setArrayElement(ContextState state) {
//        return state.value.getArrayElement(42);
//    }
//
//    @Benchmark
//    public Object canExecute(ContextState state) {
//        return state.value.canExecute();
//    }
//
//    @Benchmark
//    public Object isHostObject(ContextState state) {
//        return state.hostValue.isHostObject();
//    }
//
//    @Benchmark
//    public Object asHostObject(ContextState state) {
//        return state.hostValue.asHostObject();
//    }
//
//    /*
//     * Test language that ensures that only engine overhead is tested.
//     */
//    @TruffleLanguage.Registration(id = TEST_LANGUAGE, name = "")
//    public static class BenchmarkTestLanguage extends TruffleLanguage<BenchmarkContext> {
//
//        @Override
//        protected BenchmarkContext createContext(Env env) {
//            return new BenchmarkContext(env);
//        }
//
//        @Override
//        protected void initializeContext(BenchmarkContext context) throws Exception {
//        }
//
//        @Override
//        protected boolean isThreadAccessAllowed(Thread thread, boolean singleThreaded) {
//            return true;
//        }
//
//        @Override
//        protected CallTarget parse(ParsingRequest request) throws Exception {
//            Object result;
//            if (request.getSource().getName().equals(CONTEXT_LOOKUP)) {
//                result = new BenchmarkObjectLookup(Integer.parseInt(request.getSource().getCharacters().toString()));
//            } else {
//                result = getCurrentContext(BenchmarkTestLanguage.class).object;
//            }
//            return Truffle.getRuntime().createCallTarget(RootNode.createConstantNode(result));
//        }
//
//        @Override
//        protected boolean isObjectOfLanguage(Object object) {
//            return object instanceof BenchmarkObjectConstant;
//        }
//
//    }
//
//    static final class BenchmarkContext {
//
//        final Env env;
//        final BenchmarkObjectConstant object = new BenchmarkObjectConstant();
//        final int index = 0;
//
//        BenchmarkContext(Env env) {
//            this.env = env;
//        }
//
//    }
//
//    @ExportLibrary(InteropLibrary.class)
//    @SuppressWarnings({"static-method", "unused", "hiding"})
//    public static class BenchmarkObjectLookup extends BenchmarkObjectConstant {
//
//        final int iterations;
//
//        BenchmarkObjectLookup(int iterations) {
//            this.iterations = iterations;
//        }
//
//        @ExportMessage
//        @ExplodeLoop
//        final Object execute(Object[] arguments,
//                             @Cached("this.iterations") int cachedIterations,
//                             @CachedContext(BenchmarkTestLanguage.class) ContextReference<BenchmarkContext> context) {
//            int sum = 0;
//            for (int i = 0; i < cachedIterations; i++) {
//                sum += context.get().index;
//            }
//            // usage value so it is not collected.
//            if (sum > 0) {
//                CompilerDirectives.transferToInterpreter();
//            }
//            return BenchmarkObjectConstant.constant;
//        }
//    }
//
//    @ExportLibrary(InteropLibrary.class)
//    @SuppressWarnings({"static-method", "unused", "hiding"})
//    public static class BenchmarkObjectConstant implements TruffleObject {
//
//        private static final Integer constant = 42;
//
//        Object value = 42;
//        long longValue = 42L;
//
//        @ExportMessage
//        protected final boolean hasMembers() {
//            return true;
//        }
//
//        @ExportMessage
//        protected final boolean hasArrayElements() {
//            return true;
//        }
//
//        @ExportMessage
//        protected final boolean isExecutable() {
//            return true;
//        }
//
//        @ExportMessage
//        protected final Object getMembers(boolean includeInternal) {
//            return null;
//        }
//
//        @ExportMessage
//        protected final Object readArrayElement(long index) {
//            return value;
//        }
//
//        @ExportMessage
//        protected final void writeArrayElement(long index, Object value) {
//            this.value = value;
//        }
//
//        @ExportMessage
//        protected final boolean isArrayElementInsertable(long index) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final long getArraySize() {
//            return 0L;
//        }
//
//        @ExportMessage
//        protected final boolean isArrayElementReadable(long index) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final boolean isArrayElementModifiable(long index) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final Object execute(Object[] arguments) {
//            return constant;
//        }
//
//        @ExportMessage
//        protected final boolean isMemberReadable(String member) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final boolean isMemberModifiable(String member) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final boolean isMemberInsertable(String member) {
//            return true;
//        }
//
//        @ExportMessage
//        protected final void writeMember(String member, Object value) {
//            this.value = value;
//        }
//
//        @ExportMessage
//        protected final Object readMember(String member) {
//            return value;
//        }
//
//        @ExportMessage
//        protected final boolean isPointer() {
//            return true;
//        }
//
//        @ExportMessage
//        protected final long asPointer() {
//            return longValue;
//        }
//
//    }

}
