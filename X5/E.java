package X5;

import java.util.Map;

public final class E implements Map.Entry {
    private final Map.Entry<CharSequence, CharSequence> entry;
    private String name;
    private String value;

    public E(Map.Entry<CharSequence, CharSequence> entry2) {
        this.entry = entry2;
    }

    public String toString() {
        return this.entry.toString();
    }

    public String getKey() {
        if (this.name == null) {
            this.name = this.entry.getKey().toString();
        }
        return this.name;
    }

    public String getValue() {
        if (this.value == null && this.entry.getValue() != null) {
            this.value = this.entry.getValue().toString();
        }
        return this.value;
    }

    public String setValue(String str) {
        String value2 = getValue();
        this.entry.setValue(str);
        return value2;
    }
}
