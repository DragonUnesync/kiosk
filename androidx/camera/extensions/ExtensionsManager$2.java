package androidx.camera.extensions;

import a0.j;
import androidx.camera.extensions.impl.InitializerImpl;

class ExtensionsManager$2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
    final /* synthetic */ a this$0;
    final /* synthetic */ j val$completer;

    public ExtensionsManager$2(a aVar, j jVar) {
        this.this$0 = aVar;
        this.val$completer = jVar;
    }

    public void onFailure(int i) {
        this.val$completer.b(new Exception("Failed to deinitialize extensions."));
    }

    public void onSuccess() {
        this.val$completer.a((Object) null);
    }
}
