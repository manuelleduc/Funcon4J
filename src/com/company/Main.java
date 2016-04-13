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
            IEval incr = (env, store, given) -> fac.abs(fac.intAdd(given, fac.lit(1))).eval(env, store, given);
            Store store = new Store();
            try {
                System.out.println(fac.apply(incr, fac.boundValue(fac.id("x"))).eval(
                                (Environment)fac.apply(fac.bind(fac.id("x")), fac.lit(3)).eval(
                                    new Environment(),
                                    store,
                                    fac.null_()),
                                store,
                                fac.null_()));
            } catch (FunconException signal) {
                signal.printStackTrace();
            }
            System.out.println();
        }

        {
            ElseAlg<IEval> alg = new ElseFactory() {};
            System.out.println("else");
            IEval equalsZero = (env, store, given) ->
                    alg.abs(alg.seq(alg.apply(alg.only(alg.lit(0)), given), alg.bool(true)))
                    .eval(env, store, given);
            IEval alwaysFalse = (env, store, given) ->
                    alg.abs(alg.seq(alg.apply(alg.any(), given), alg.bool(false)))
                    .eval(env, store, given);
            IEval isZero = alg.preferOver(equalsZero, alwaysFalse);
            Store store = new Store();
            try {
                Environment env = (Environment)alg.apply(alg.bind(alg.id("isZero")), isZero).eval(new Environment(), store, alg.null_());
                System.out.println(alg.apply(alg.boundValue(alg.id("isZero")), alg.lit(0)).eval(env, store, alg.null_()));
            } catch(FunconException s) {
                System.out.println("Error occured: " + s);
            }
        }
    }
}
