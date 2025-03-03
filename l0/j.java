package l0;

import android.content.res.Resources;
import j$.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f13081a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f13082b;

    public j(Resources resources, Resources.Theme theme) {
        this.f13081a = resources;
        this.f13082b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f13081a.equals(jVar.f13081a) || !Objects.equals(this.f13082b, jVar.f13082b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f13081a, this.f13082b});
    }
}
