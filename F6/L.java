package f6;

public interface L extends C0909B {
    L addListener(C0910C c8);

    L setFailure(Throwable th);

    L setSuccess(Object obj);

    boolean setUncancellable();

    boolean tryFailure(Throwable th);

    boolean trySuccess(Object obj);
}
