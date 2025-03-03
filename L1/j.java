package l1;

import O6.l;
import P0.c;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.acra.collector.ConfigurationCollector;
import p1.o;
import r.C1366a;

public final /* synthetic */ class j implements c, l, C1366a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13136U;

    public /* synthetic */ j(int i) {
        this.f13136U = i;
    }

    public Object a(Object obj) {
        return ConfigurationCollector.getValueArrays$lambda$11((ConfigurationCollector.Prefix) obj);
    }

    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        return null;
    }

    public Constructor b() {
        Class<o> cls = o.class;
        switch (this.f13136U) {
            case 2:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cls).getConstructor(new Class[]{Integer.TYPE});
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cls).getConstructor((Class[]) null);
        }
    }
}
