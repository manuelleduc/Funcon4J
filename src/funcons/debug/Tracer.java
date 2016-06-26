package funcons.debug;

import camllight.CamlLight;
import camllight.algebras.AllAlg;
import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;
import org.rascalmpl.value.IMap;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Tracer<A> implements InvocationHandler{

    private Class<?>[] ifaces;
    private A alg;
    private int depth = 0;

    public Tracer(A alg, Class<?>[] ifaces) {
        this.alg = alg;
        this.ifaces = ifaces;
    }

    @SuppressWarnings("unchecked")
    public A make() {
        return (A)Proxy.newProxyInstance(this.getClass().getClassLoader(), ifaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        print("creating " + method.getName());
        IEval myEval = (IEval)method.invoke(alg, args);
        return Proxy.newProxyInstance(
                Tracer.class.getClassLoader(),
                new Class<?>[] {IEval.class},
                (Object p, Method m, Object[] as) -> {
                    IMap env = (IMap) as[0];
                    Value given = (Value)as[1];
                    print("Given to " + method.getName() + ": " + given + " env: " + env);
                    depth++;
                    Value v = myEval.eval(env, given);
                    depth--;
                    print("Resulting in: " + v);
                    return v;
                }
        );
    }

    private void print(java.lang.String content) {
        java.lang.String indentation = depth > 0 ? String.format("%" + depth * 2 + "s", "") : "";
        System.out.println(indentation + content);
    }

    public static void main(String[] args) throws FunconException {
        AllAlg<IEval> myalg = () -> new AllFactory() {};
        Value v = CamlLight.eval("let add x y = x + y;; add 1 2;;", new Tracer<>(myalg, new Class<?>[] {AllAlg.class}).make());
        System.out.println(v);
    }
}