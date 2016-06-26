package funcons.helper;

import org.rascalmpl.value.IList;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.INumber;
import org.rascalmpl.value.IValue;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RascalValueComperator {

    public static int compare(IValue a, IValue b) {
        if (a instanceof INumber && b instanceof INumber) {
            return compare((INumber)a, (INumber)b);
        }
        if (a instanceof IList && b instanceof IList) {
            return compare((IList)a, (IList)b);
        }
        if (a instanceof IMap && b instanceof IMap) {
            return compare((IMap)a, (IMap)b);
        }
        throw new NotImplementedException();
    }

    public static int compare(INumber a, INumber b) {
        if (a.greater(b).getValue()) {
            return 1;
        }
        if (a.equal(b).getValue()) {
            return 0;
        }
        return -1;
    }

    public static int compare(IList a, IList b) {
        for (int i = 0, length = Math.min(a.length(), b.length()); i < length; i++) {
            int compareResult = compare(a.get(i), b.get(i));
            if (compareResult != 0) {
                return compareResult;
            }
        }
        return a.length() - b.length();
    }

    public static int compare(IMap a, IMap b) {
        int compareResult = 0;
        for (IValue key : a) {
            if (b.containsKey(key)) {
                compareResult += compare(a.get(key), b.get(key));
            }
        }
        if (compareResult > 0) {
            return 1;
        }
        if (compareResult < 0) {
            return -1;
        }
        return 0;
    }


}
