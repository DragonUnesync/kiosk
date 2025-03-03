package a6;

import e6.C0847f;

public enum O {
    UNKNOWN(C0847f.cached("")),
    V00(C0847f.cached("0")),
    V07(C0847f.cached("7")),
    V08(C0847f.cached("8")),
    V13(C0847f.cached("13"));
    
    private final C0847f headerValue;

    private O(C0847f fVar) {
        this.headerValue = fVar;
    }

    public C0847f toAsciiString() {
        if (this != UNKNOWN) {
            return this.headerValue;
        }
        throw new IllegalStateException("Unknown web socket version: " + this);
    }
}
