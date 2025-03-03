package de.ozerov.fully;

import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import java.util.concurrent.CompletableFuture;

public abstract /* synthetic */ class F1 {
    public static /* synthetic */ GestureDescription.Builder b() {
        return new GestureDescription.Builder();
    }

    public static /* synthetic */ GestureDescription.StrokeDescription c(Path path) {
        return new GestureDescription.StrokeDescription(path, 0, 1);
    }

    public static /* synthetic */ CompletableFuture i() {
        return new CompletableFuture();
    }
}
