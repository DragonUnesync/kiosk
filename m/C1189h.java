package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.C0940a;
import j0.f;
import java.io.IOException;
import n.m;
import n.p;
import o.C1286o0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m.h  reason: case insensitive filesystem */
public final class C1189h extends MenuInflater {
    public static final Class[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f13301f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f13302a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f13303b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f13304c;

    /* renamed from: d  reason: collision with root package name */
    public Object f13305d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f13301f = clsArr;
    }

    public C1189h(Context context) {
        super(context);
        this.f13304c = context;
        Object[] objArr = {context};
        this.f13302a = objArr;
        this.f13303b = objArr;
    }

    public static Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        boolean z;
        int i;
        char c8;
        char c9;
        boolean z6;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        C1188g gVar = new C1188g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            z = true;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        while (!z8) {
            if (eventType != z) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z9 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z9 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            z = true;
                            i = 2;
                        } else if (name2.equals("group")) {
                            gVar.f13279b = 0;
                            gVar.f13280c = 0;
                            gVar.f13281d = 0;
                            gVar.e = 0;
                            gVar.f13282f = z;
                            gVar.f13283g = z;
                        } else if (name2.equals("item")) {
                            if (!gVar.f13284h) {
                                p pVar = gVar.z;
                                if (pVar == null || !pVar.f13533b.hasSubMenu()) {
                                    gVar.f13284h = z;
                                    gVar.b(gVar.f13278a.add(gVar.f13279b, gVar.i, gVar.f13285j, gVar.f13286k));
                                } else {
                                    gVar.f13284h = z;
                                    gVar.b(gVar.f13278a.addSubMenu(gVar.f13279b, gVar.i, gVar.f13285j, gVar.f13286k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z8 = true;
                            eventType = xmlResourceParser.next();
                            z = true;
                            i = 2;
                        }
                    }
                } else if (!z9) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1189h hVar = gVar.f13277E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f13304c.obtainStyledAttributes(attributeSet2, C0940a.f11827p);
                        gVar.f13279b = obtainStyledAttributes.getResourceId(z ? 1 : 0, 0);
                        gVar.f13280c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f13281d = obtainStyledAttributes.getInt(4, 0);
                        gVar.e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f13282f = obtainStyledAttributes.getBoolean(2, z);
                        gVar.f13283g = obtainStyledAttributes.getBoolean(0, z);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = hVar.f13304c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, C0940a.f11828q);
                        gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                        gVar.f13285j = (obtainStyledAttributes2.getInt(5, gVar.f13280c) & -65536) | (obtainStyledAttributes2.getInt(6, gVar.f13281d) & 65535);
                        gVar.f13286k = obtainStyledAttributes2.getText(7);
                        gVar.f13287l = obtainStyledAttributes2.getText(8);
                        gVar.f13288m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            c8 = 0;
                        } else {
                            c8 = string.charAt(0);
                        }
                        gVar.f13289n = c8;
                        gVar.f13290o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            c9 = 0;
                        } else {
                            c9 = string2.charAt(0);
                        }
                        gVar.f13291p = c9;
                        gVar.f13292q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            gVar.f13293r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            gVar.f13293r = gVar.e;
                        }
                        gVar.f13294s = obtainStyledAttributes2.getBoolean(3, false);
                        gVar.f13295t = obtainStyledAttributes2.getBoolean(4, gVar.f13282f);
                        gVar.f13296u = obtainStyledAttributes2.getBoolean(1, gVar.f13283g);
                        gVar.f13297v = obtainStyledAttributes2.getInt(21, -1);
                        gVar.f13300y = obtainStyledAttributes2.getString(12);
                        gVar.f13298w = obtainStyledAttributes2.getResourceId(13, 0);
                        gVar.f13299x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6 && gVar.f13298w == 0 && gVar.f13299x == null) {
                            gVar.z = (p) gVar.a(string3, f13301f, hVar.f13303b);
                        } else {
                            if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            gVar.z = null;
                        }
                        gVar.f13273A = obtainStyledAttributes2.getText(17);
                        gVar.f13274B = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            gVar.f13276D = C1286o0.c(obtainStyledAttributes2.getInt(19, -1), gVar.f13276D);
                        } else {
                            gVar.f13276D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = f.c(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            gVar.f13275C = colorStateList;
                        } else {
                            gVar.f13275C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        gVar.f13284h = false;
                        XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                        eventType = xmlResourceParser.next();
                        z = true;
                        i = 2;
                    } else {
                        if (name3.equals("menu")) {
                            gVar.f13284h = true;
                            SubMenu addSubMenu = gVar.f13278a.addSubMenu(gVar.f13279b, gVar.i, gVar.f13285j, gVar.f13286k);
                            gVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                            str = name3;
                            z9 = true;
                        }
                        eventType = xmlResourceParser.next();
                        z = true;
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                z = true;
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.f13304c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof m) {
                m mVar = (m) menu;
                if (!mVar.f13493j0) {
                    mVar.w();
                    z = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z) {
                ((m) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e8) {
            throw new InflateException("Error inflating menu XML", e8);
        } catch (IOException e9) {
            throw new InflateException("Error inflating menu XML", e9);
        } catch (Throwable th) {
            if (0 != 0) {
                ((m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
