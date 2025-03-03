package X5;

import f6.C0934y;
import g6.B;
import j$.util.DesugarTimeZone;
import java.util.BitSet;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X5.n  reason: case insensitive filesystem */
public final class C0363n {
    private static final String[] CALENDAR_MONTH_TO_SHORT_NAME = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAY_OF_WEEK_TO_SHORT_NAME = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final BitSet DELIMITERS;
    private static final C0934y INSTANCES = new C0362m();
    private final GregorianCalendar cal;
    private int dayOfMonth;
    private boolean dayOfMonthFound;
    private int hours;
    private int minutes;
    private int month;
    private boolean monthFound;
    private final StringBuilder sb;
    private int seconds;
    private boolean timeFound;
    private int year;
    private boolean yearFound;

    static {
        BitSet bitSet = new BitSet();
        DELIMITERS = bitSet;
        bitSet.set(9);
        for (char c8 = ' '; c8 <= '/'; c8 = (char) (c8 + 1)) {
            DELIMITERS.set(c8);
        }
        for (char c9 = ';'; c9 <= '@'; c9 = (char) (c9 + 1)) {
            DELIMITERS.set(c9);
        }
        for (char c10 = '['; c10 <= '`'; c10 = (char) (c10 + 1)) {
            DELIMITERS.set(c10);
        }
        for (char c11 = '{'; c11 <= '~'; c11 = (char) (c11 + 1)) {
            DELIMITERS.set(c11);
        }
    }

    public /* synthetic */ C0363n(C0362m mVar) {
        this();
    }

    private StringBuilder append0(Date date, StringBuilder sb2) {
        this.cal.setTime(date);
        sb2.append(DAY_OF_WEEK_TO_SHORT_NAME[this.cal.get(7) - 1]);
        sb2.append(", ");
        appendZeroLeftPadded(this.cal.get(5), sb2).append(' ');
        sb2.append(CALENDAR_MONTH_TO_SHORT_NAME[this.cal.get(2)]);
        sb2.append(' ');
        sb2.append(this.cal.get(1));
        sb2.append(' ');
        appendZeroLeftPadded(this.cal.get(11), sb2).append(':');
        appendZeroLeftPadded(this.cal.get(12), sb2).append(':');
        StringBuilder appendZeroLeftPadded = appendZeroLeftPadded(this.cal.get(13), sb2);
        appendZeroLeftPadded.append(" GMT");
        return appendZeroLeftPadded;
    }

    private static StringBuilder appendZeroLeftPadded(int i, StringBuilder sb2) {
        if (i < 10) {
            sb2.append('0');
        }
        sb2.append(i);
        return sb2;
    }

    public static String format(Date date) {
        return formatter().format0((Date) B.checkNotNull(date, "date"));
    }

    private String format0(Date date) {
        append0(date, this.sb);
        return this.sb.toString();
    }

    private static C0363n formatter() {
        C0363n nVar = (C0363n) INSTANCES.get();
        nVar.reset();
        return nVar;
    }

    public void reset() {
        this.timeFound = false;
        this.hours = -1;
        this.minutes = -1;
        this.seconds = -1;
        this.dayOfMonthFound = false;
        this.dayOfMonth = -1;
        this.monthFound = false;
        this.month = -1;
        this.yearFound = false;
        this.year = -1;
        this.cal.clear();
        this.sb.setLength(0);
    }

    private C0363n() {
        this.cal = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        this.sb = new StringBuilder(29);
        reset();
    }
}
