package f6;

import g6.B;
import g6.C0969b0;
import h6.C1082c;
import h6.d;

public abstract class S implements C0910C {
    private static final C1082c logger = d.getInstance((Class<?>) S.class);
    private final boolean logNotifyFailure;
    private final L[] promises;

    @SafeVarargs
    public S(boolean z, L... lArr) {
        B.checkNotNull(lArr, "promises");
        for (L checkNotNullWithIAE : lArr) {
            B.checkNotNullWithIAE(checkNotNullWithIAE, "promise");
        }
        this.promises = (L[]) lArr.clone();
        this.logNotifyFailure = z;
    }

    public static <V, F extends C0909B> F cascade(boolean z, F f8, L l8) {
        l8.addListener(new P(f8));
        f8.addListener(new Q(z, new L[]{l8}, l8, f8));
        return f8;
    }

    public void operationComplete(C0909B b8) {
        C1082c cVar;
        if (this.logNotifyFailure) {
            cVar = logger;
        } else {
            cVar = null;
        }
        int i = 0;
        if (b8.isSuccess()) {
            Object obj = b8.get();
            L[] lArr = this.promises;
            int length = lArr.length;
            while (i < length) {
                C0969b0.trySuccess(lArr[i], obj, cVar);
                i++;
            }
        } else if (b8.isCancelled()) {
            L[] lArr2 = this.promises;
            int length2 = lArr2.length;
            while (i < length2) {
                C0969b0.tryCancel(lArr2[i], cVar);
                i++;
            }
        } else {
            Throwable cause = b8.cause();
            L[] lArr3 = this.promises;
            int length3 = lArr3.length;
            while (i < length3) {
                C0969b0.tryFailure(lArr3[i], cause, cVar);
                i++;
            }
        }
    }
}
