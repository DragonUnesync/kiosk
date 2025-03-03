package T5;

import f6.C0910C;
import f6.L;

/* renamed from: T5.u0  reason: case insensitive filesystem */
public interface C0274u0 extends P, L {
    C0274u0 addListener(C0910C c8);

    K channel();

    C0274u0 removeListener(C0910C c8);

    C0274u0 setFailure(Throwable th);

    C0274u0 setSuccess();

    C0274u0 setSuccess(Void voidR);

    boolean trySuccess();
}
