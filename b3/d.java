package B3;

import A.f;
import D2.D;
import T2.e;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import h0.C1026a;
import h0.C1029d;
import java.util.List;
import java.util.WeakHashMap;
import v0.C1510H;

public final class d implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f395U;

    public /* synthetic */ d(int i) {
        this.f395U = i;
    }

    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.f395U) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    k kVar = (k) message.obj;
                    j jVar = kVar.i;
                    if (jVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                        if (layoutParams instanceof C1029d) {
                            C1029d dVar = (C1029d) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            f fVar = baseTransientBottomBar$Behavior.i;
                            fVar.getClass();
                            fVar.f17V = kVar.f435t;
                            baseTransientBottomBar$Behavior.f9157b = new f(kVar);
                            C1026a aVar = dVar.f12261a;
                            if (aVar != baseTransientBottomBar$Behavior) {
                                if (aVar != null) {
                                    aVar.e();
                                }
                                dVar.f12261a = baseTransientBottomBar$Behavior;
                                dVar.f12262b = true;
                            }
                            dVar.f12266g = 80;
                        }
                        jVar.f412h0 = true;
                        kVar.f423g.addView(jVar);
                        jVar.f412h0 = false;
                        kVar.e();
                        jVar.setVisibility(4);
                    }
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (jVar.isLaidOut()) {
                        kVar.d();
                        return true;
                    }
                    kVar.f433r = true;
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    k kVar2 = (k) message.obj;
                    int i8 = message.arg1;
                    AccessibilityManager accessibilityManager = kVar2.f434s;
                    if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                        j jVar2 = kVar2.i;
                        if (jVar2.getVisibility() == 0) {
                            if (jVar2.getAnimationMode() == 1) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                                ofFloat.setInterpolator(kVar2.f421d);
                                ofFloat.addUpdateListener(new c(kVar2, 0, (byte) 0));
                                ofFloat.setDuration((long) kVar2.f419b);
                                ofFloat.addListener(new b(kVar2, i8, 0));
                                ofFloat.start();
                                return true;
                            }
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int height = jVar2.getHeight();
                            ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            }
                            valueAnimator.setIntValues(new int[]{0, height});
                            valueAnimator.setInterpolator(kVar2.e);
                            valueAnimator.setDuration((long) kVar2.f420c);
                            valueAnimator.addListener(new b(kVar2, i8, 2));
                            valueAnimator.addUpdateListener(new c(kVar2, 3, (byte) 0));
                            valueAnimator.start();
                            return true;
                        }
                    }
                    kVar2.b();
                    return true;
                }
            case 1:
                if (message.what != 1) {
                    return false;
                }
                ((D) message.obj).e();
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                e eVar = (e) message.obj;
                eVar.f4994X.n(eVar);
                return true;
        }
    }
}
