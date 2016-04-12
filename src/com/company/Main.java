package com.company;

import funcons.Store;
import funcons.algebras.ElseAlg;
import funcons.interpreter.ApplyFactory;
import funcons.interpreter.ElseFactory;
import funcons.types.FunconException;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Null;

public class Main {

    public static void main(java.lang.String[] args) {
        {
            ApplyFactory fac = new ApplyFactory() {};
            System.out.println("bind");
            IEval incr = fac.abs(fac.intAdd(fac.given(), fac.lit(1)));
            Store store = new Store();
            try {
                System.out.println(fac.apply(incr, fac.boundValue(fac.var("x"))).eval(
                                (Environment)fac.apply(fac.bind(fac.var("x")), fac.lit(3)).eval(
                                    new Environment(),
                                    store,
                                    new Null()),
                                store,
                                new Null()));
            } catch (FunconException signal) {
                signal.printStackTrace();
            }
            System.out.println();
        }

        {
            ElseAlg<IEval> alg = new ElseFactory() {};
            System.out.println("else");
            IEval equalsZero = alg.abs(alg.seq(alg.apply(alg.only(alg.lit(0)), alg.given()), alg.bool(true)));
            IEval alwaysFalse = alg.abs(alg.seq(alg.apply(alg.any(), alg.given()), alg.bool(false)));
            IEval isZero = alg.preferOver(equalsZero, alwaysFalse);
            Store store = new Store();
            try {
                Environment env = (Environment)alg.apply(alg.bind(alg.var("isZero")), isZero).eval(new Environment(), store, new Null());
                System.out.println(alg.apply(alg.boundValue(alg.var("isZero")), alg.lit(0)).eval(env, store, new Null()));
            } catch(FunconException s) {
                System.out.println("Error occured: " + s);
            }
        }
    }
}
