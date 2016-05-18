package funcons.values;

public class Record implements Value {
    private Map<Field, Value> map;

    public Record(Map<Field, Value> m) {
        map = m;
    }

    public Value select(Field f) {
        return map.val(f);
    }

    public Record over(Record other) {
        return new Record(other.map.extend(map));
    }

    public Record union(Record other) {
        return new Record(map.extend(other.map));
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Record && ((Record)obj).map.equals(map);
    }
}
