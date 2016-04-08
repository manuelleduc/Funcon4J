package com.company;

import DSL.algebras.DSLBindAlg;
import DSL.algebras.WhileTrueAlg;

import funcons.algebras.ElseAlg;
import funcons.interpreter.ApplyFactory;
import funcons.interpreter.ElseFactory;
import funcons.signals.Signal;
import funcons.sorts.IEval;
import funcons.types.Environment;

public class Main {

    public static void main(java.lang.String[] args) {
        {
            ApplyFactory fac = new ApplyFactory() {};
            System.out.println("bind");
            IEval incr = fac.abs(fac.intAdd(fac.given(), fac.lit(1)));
            try {
                System.out.println(fac.apply(incr, fac.boundValue(fac.var("x")))
                        .eval((Environment)fac.supply(fac.lit(3), fac.bind(fac.var("x")))
                                .eval(new Environment())));
            } catch (Signal signal) {
                signal.printStackTrace();
            }
            System.out.println();
        }

        {
            ElseAlg<IEval> alg = new ElseFactory() {};
            System.out.println("else");
            IEval equalsZero = alg.abs(alg.seq(alg.only(alg.lit(0)), alg.bool(true)));
            IEval alwaysFalse = alg.abs(alg.seq(alg.any(), alg.bool(false)));
            IEval isZero = alg.preferOver(equalsZero, alwaysFalse);
            try {
                Environment env = (Environment)alg.supply(isZero, alg.bind(alg.var("isZero"))).eval(new Environment());
                System.out.println(alg.apply(alg.boundValue(alg.var("isZero")), alg.lit(1)).eval(env));
            } catch(Signal s) {
                System.out.println("Error occured: " + s);
            }
        }
    }

    public static <A> A exp1(WhileTrueAlg<A> alg) {
        return alg.ifElse(alg.lAnd(alg.bool(false), alg.bool(true)),
                alg.add(alg.lit(3), alg.lit(2)),
                alg.multiply(alg.lit(4), alg.lit(5)));
    }

    public static <A> A exp2(WhileTrueAlg<A> alg) {
        return alg.whileTrue(alg.bool(false), alg.add(alg.lit(3), alg.lit(4)));
    }

    public static <A> A bindStatement(DSLBindAlg<A> alg) {
        return alg.bindValue(alg.var("x"), alg.lit(3));
    }

    public static <A> A boundExp(DSLBindAlg<A> alg) {
        return alg.boundValue(alg.var("x"));
    }

    public static <A> A scopeStatement(DSLBindAlg<A> alg) {
        A env1 = alg.bindValue(alg.var("x"), alg.lit(3));
        A env2 = alg.bindValue(alg.var("x"), alg.lit(5));
        return alg.scope(env2, env1);
    }

    /*
    BindAlg<IEval> funcWhileTrueAlg = new BindFactory() {};
        DSLBindAlg<IEval> expControlAlg = new DSLBindFactory<IEval>() {
            @Override
            public BindAlg<IEval> bindAlg() {
                return funcWhileTrueAlg;
            }

            @Override
            public IntCalcAlg<IEval> intCalcAlg() {
                return funcWhileTrueAlg;
            }

            @Override
            public LogicIfTrueAlg<IEval> ifTrueAlg() {
                return funcWhileTrueAlg;
            }

            @Override
            public LogicWhileTrueAlg<IEval> whileTrueAlg() {
                return funcWhileTrueAlg;
            }
        };

        PrintableLogicControlFactory printableLogicControlFactory = new PrintableLogicControlFactory() {};

        WhileTrueAlg<IPrint> printableControlAlg = new ExpControlFactory<IPrint>() {
            @Override
            public IntCalcAlg<IPrint> intCalcAlg() {
                return printableLogicControlFactory;
            }

            @Override
            public LogicIfTrueAlg<IPrint> ifTrueAlg() {
                return printableLogicControlFactory;
            }

            @Override
            public LogicWhileTrueAlg<IPrint> whileTrueAlg() {
                return printableLogicControlFactory;
            }
        };

        System.out.println("Exp 1");
        System.out.println(((funcons.types.Int)exp1(expControlAlg).eval(new Environment())).intValue());
        System.out.println(exp1(printableControlAlg).print().stringValue());
        System.out.println();

        System.out.println("Exp 2");
        System.out.println(exp2(expControlAlg).eval(new Environment()));
        System.out.println(exp2(printableControlAlg).print().stringValue());
        System.out.println();

        {
            System.out.println("Bind & Bound");
            Environment env = (Environment) bindStatement(expControlAlg).eval(new Environment());
            System.out.println(boundExp(expControlAlg).eval(env));
            System.out.println();
        }

        {
            System.out.println("Scoping");
            Environment env = (Environment)scopeStatement(expControlAlg).eval(new Environment());
            System.out.println(boundExp(expControlAlg).eval(env));
            System.out.println();
        }

        {
            BindFactory fac = new BindFactory() {};
            System.out.println("Supply & Given");
            System.out.println(fac.supply(fac.lit(5), fac.intAdd(fac.given(), fac.lit(10))).eval(new Environment()));
            System.out.println();
        }

        {
            ApplyFactory fac = new ApplyFactory() {};
            System.out.println("Apply");
            IEval incr = fac.abs(fac.intAdd(fac.given(), fac.lit(1)));
            System.out.println(fac.apply(incr, fac.lit(5)).eval(new Environment()));
            System.out.println();
        }

     */
}
