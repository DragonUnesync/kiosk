package androidx.camera.extensions;

import B.r;
import F.h;
import a0.j;
import androidx.camera.extensions.impl.InitializerImpl;

class ExtensionsManager$1 implements InitializerImpl.OnExtensionsInitializedCallback {
    final /* synthetic */ r val$cameraProvider;
    final /* synthetic */ j val$completer;

    public ExtensionsManager$1(j jVar, r rVar) {
        this.val$completer = jVar;
        this.val$cameraProvider = rVar;
    }

    public void onFailure(int i) {
        h.l("ExtensionsManager", "Failed to initialize extensions");
        j jVar = this.val$completer;
        ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability = ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE;
        jVar.a(a.a());
    }

    public void onSuccess() {
        h.j("ExtensionsManager", "Successfully initialized extensions");
        j jVar = this.val$completer;
        ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability = ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE;
        jVar.a(a.a());
    }
}
