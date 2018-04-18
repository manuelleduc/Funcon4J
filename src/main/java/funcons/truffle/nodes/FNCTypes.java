package funcons.truffle.nodes;

import com.oracle.truffle.api.dsl.TypeSystem;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;


// TODO function
// TODO null values
@TypeSystem({IInteger.class, IBool.class, FNCFunction.class})
public abstract class FNCTypes {

}
