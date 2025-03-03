package e6;

public interface J {
    int refCnt();

    boolean release();

    J touch(Object obj);
}
