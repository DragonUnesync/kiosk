package org.acra.plugins;

import P6.f;
import r7.C1392a;
import r7.C1395d;
import x7.a;

public abstract class HasConfigPlugin implements a {
    private final Class<? extends C1392a> configClass;

    public HasConfigPlugin(Class<? extends C1392a> cls) {
        f.e(cls, "configClass");
        this.configClass = cls;
    }

    public boolean enabled(C1395d dVar) {
        f.e(dVar, "config");
        C1392a g8 = N7.a.g(dVar, this.configClass);
        if (g8 != null) {
            return g8.k();
        }
        return false;
    }
}
