package com.company;

import DSL.BoolLogicalAndFactory;
import DSL.ExpControlFactory;
import DSL.IntMulFactory;
import DSL.algebras.BoolLogicalAndAlg;
import DSL.algebras.IfElseAlg;
import DSL.algebras.IntMulAlg;

import DSL.algebras.WhileTrueAlg;
import funcons.interpreter.LogicIfTrueFactory;
import funcons.interpreter.IntCalcFactory;
import funcons.interpreter.LogicWhileTrueFactory;
import funcons.prettyprinter.PrintableLogicControlFactory;
import funcons.prettyprinter.PrintableIntCalcFactory;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Number;
import funcons.types.String;

public class Main {

    public static void main(java.lang.String[] args) {
        IntMulAlg<IEval<Number>> intExpAlg = new IntMulFactory<>(new IntCalcFactory());
        BoolLogicalAndAlg<IEval<Bool>> boolExpAlg = new BoolLogicalAndFactory<>(new LogicIfTrueFactory<>());
        IfElseAlg<IEval<Bool>, IEval<Number>> expControlAlg =
                new ExpControlFactory<>(new LogicIfTrueFactory<>(), new LogicWhileTrueFactory());

        IntMulAlg<IEval<String>> printableIntExpAlg = new IntMulFactory<>(new PrintableIntCalcFactory());
        BoolLogicalAndAlg<IEval<String>> printableExpMulAlg = new BoolLogicalAndFactory<>(new PrintableLogicControlFactory());
        ExpControlFactory<IEval<String>, IEval<String>, IEval<String>> printableControlAlg =
                new ExpControlFactory<>(new PrintableLogicControlFactory(), new PrintableLogicControlFactory());

        System.out.println("Exp 1");
        System.out.println(exp1(intExpAlg, boolExpAlg, expControlAlg).eval().intValue());
        System.out.println(exp1(printableIntExpAlg, printableExpMulAlg, printableControlAlg).eval().stringValue());
        System.out.println();

        System.out.println("Exp 2");
        //System.out.println(exp2(intExpAlg, boolExpAlg, expControlAlg).eval().intValue());
        System.out.println(exp2(printableIntExpAlg, printableExpMulAlg, printableControlAlg).eval().stringValue());
        System.out.println();
    }

    public static <A, B> A exp1(IntMulAlg<A> intExpAlg, BoolLogicalAndAlg<B> boolExpAlg, IfElseAlg<B, A> ifElseAlg) {
        return ifElseAlg.ifElse(boolExpAlg.lAnd(boolExpAlg.bool(false), boolExpAlg.bool(true)),
                intExpAlg.add(intExpAlg.lit(3), intExpAlg.lit(2)),
                intExpAlg.multiply(intExpAlg.lit(4), intExpAlg.lit(5)));
    }

    public static <A> A exp2(IntMulAlg<A> intExpAlg, BoolLogicalAndAlg<A> boolExpAlg, WhileTrueAlg<A, A> whileTrueAlg) {
        return whileTrueAlg.whileTrue(boolExpAlg.bool(false), intExpAlg.add(intExpAlg.lit(3), intExpAlg.lit(4)));
    }
}
