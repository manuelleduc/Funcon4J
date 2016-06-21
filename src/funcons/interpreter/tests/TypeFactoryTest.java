package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.cl.CLVariant;
import funcons.values.ids.Meta;
import funcons.values.ids.TypeVar;
import funcons.values.signals.FailureTrue;
import funcons.values.types.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeFactoryTest implements AllFactory {

    @Test
    public void testType() throws Exception {
        Type t = (Type)type("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Type("foo"), t);
    }

    @Test
    public void testTypeVar() throws Exception {
        TypeVar tv = (TypeVar)typeVar("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TypeVar("foo"), tv);
    }

    @Test
    public void testTag() throws Exception {
        Tag t = (Tag)tag("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tag("foo"), t);
    }

    @Test
    public void testClVariant() throws Exception {
        Variant v = (Variant)clVariant("foo", lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new CLVariant("foo", new Int(0)), v);
    }

    @Test
    public void testMeta() throws Exception {
        Meta m = (Meta)meta("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Meta("foo"), m);
    }

    @Test
    public void testNomTag() throws Exception {
        NominalTag n1 = (NominalTag)nomTag(freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        NominalTag n2 = (NominalTag)nomTag(freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        Token t = (Token)freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        n1 = (NominalTag)nomTag((e,f,s,g) -> t).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalTag)nomTag((e,f,s,g) -> t).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n1, n2);
    }

    @Test
    public void testNomVal() throws Exception {
        NominalVal n1 = (NominalVal)nomVal(nomTag(freshToken()), lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        NominalVal n2 = (NominalVal)nomVal(nomTag(freshToken()), lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        NominalTag nt = (NominalTag)nomTag(freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        n1 = (NominalVal)nomVal((e,f,s,g) -> nt, lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalVal)nomVal((e,f,s,g) -> nt, lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        n1 = (NominalVal)nomVal((e,f,s,g) -> nt, lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalVal)nomVal((e,f,s,g) -> nt, lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n1, n2);
    }

    @Test
    public void testNomValSelect() throws Exception {
        Token t = (Token)freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        IEval val = nomValSelect(nomTag((e,f,s,g) -> t), nomVal(nomTag((e,f,s,g) -> t), lit(0)));
        Int i = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        val = nomValSelect(nomTag(freshToken()), nomVal(nomTag(freshToken()), lit(0)));
        try {
            @SuppressWarnings("unused")
            Int i2 = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch(FailureTrue e) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testScopeNominalCoercion() throws Exception {
        IEval val = scopeNominalCoercion(type("foo"), type("bar"), abs(any(), lit(0)));
        Int i = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testDepends() throws Exception {
        Depends d = (Depends)depends(type("foo"), type("bar")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Depends(new Type("foo"), new Type("bar")), d);
    }

    @Test
    public void testTupleType() throws Exception {
        TupleType tt = (TupleType)tupleType().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(), tt);
        tt = (TupleType)tupleType(type("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo")), tt);
        tt = (TupleType)tupleType(type("foo"), type("bar")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar")), tt);
        tt = (TupleType)tupleType(type("foo"), type("bar"), type("baz")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar"), new Type("baz")), tt);
    }

    @Test
    public void testTupleTypePrefix() throws Exception {
        IEval tupleType = tupleTypePrefix(type("foo"), tupleType(type("bar")));
        TupleType tt = (TupleType)tupleType.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar")), tt);
    }

    @Test
    public void testProjectType() throws Exception {
        IEval type = projectType(lit(1), tupleType(type("foo"), type("bar"), type("baz")));
        Type t = (Type)type.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Type("bar"), t);
    }

    @Test
    public void testTyped() throws Exception {
        Int i = (Int)typed(lit(0), type("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testBoundType() throws Exception {
        Null n = (Null)boundType(id("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }

    @Test
    public void testFreshToken() throws Exception {
        Token t1 = (Token)freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(t1);
        Token t2 = (Token)freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(t1, t2);
    }

    @Test
    public void testNewType() throws Exception {
        NominalType t1 = (NominalType)newType(lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(t1);
        NominalType t2 = (NominalType)newType(lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(t1, t2);
    }

    @Test
    public void testTypeDef() throws Exception {
        Environment env = (Environment)typeDef(id("foo"), newType(lit(0))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(env);
    }

    @Test
    public void testRestrictDomain() throws Exception {
        IEval id = restrictDomain(abs(given()), type("foo"));
        Int i = (Int)apply(id, lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testPattAtType() throws Exception {
        IEval patt = pattAtType(bind(id("foo")), type("bar"));
        IEval env = match(lit(0), patt);
        Int i = (Int)scope(env, boundValue(id("foo"))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testVariantMatch() throws Exception {
        IEval env = variantMatch(tag("foo"), clVariant("foo", lit(0)), bind(id("bar")));
        Int i = (Int)scope(env, boundValue(id("bar"))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        try {
            env = variantMatch(tag("foobar"), clVariant("foo", lit(0)), bind(id("bar")));
            i = (Int)scope(env, boundValue(id("bar"))).eval(new Environment(), new Forwards(), new Store(), new Null());
            assertEquals(new Integer(0), i.intValue());
        } catch(FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testUnknownType() throws Exception {
        UnknownType unknown = (UnknownType)unknownType().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new UnknownType(), unknown);
    }
}