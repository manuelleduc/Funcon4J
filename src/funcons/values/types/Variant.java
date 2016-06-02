package funcons.values.types;

import funcons.values.Value;

public interface Variant extends Value {
    Tag tag();
    Value value();
}
