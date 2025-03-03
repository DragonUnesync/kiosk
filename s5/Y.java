package S5;

public final class Y {
    private final C0168e0 cache;

    public /* synthetic */ Y(C0168e0 e0Var, X x8) {
        this(e0Var);
    }

    public void finalize() {
        try {
            super.finalize();
        } finally {
            this.cache.free(true);
        }
    }

    private Y(C0168e0 e0Var) {
        this.cache = e0Var;
    }
}
