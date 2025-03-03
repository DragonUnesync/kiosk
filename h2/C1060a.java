package h2;

import B.C0003d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import l0.C1169b;

/* renamed from: h2.a  reason: case insensitive filesystem */
public abstract class C1060a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12533a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12534b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12535c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12536d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f12537f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f12538g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f12539h = {16843490};
    public static final int[] i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f12540j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f12541k = {16843489, 16843781, 16843892, 16843893};

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i8) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        int i9;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i10;
        Keyframe ofObject;
        Keyframe keyframe;
        String str2;
        int i11;
        TypedValue typedValue;
        boolean z;
        int i12;
        Keyframe keyframe2;
        int i13;
        float f8;
        int i14;
        TypedValue typedValue2;
        int i15;
        int i16;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z6 = false;
            int i17 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i18 = 1;
            if (next == 1) {
                break;
            }
            int i19 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, (ObjectAnimator) null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    TypedArray g8 = C1169b.g(resources2, theme2, attributeSet, f12539h);
                    if (!C1169b.d(xmlResourceParser2, "ordering")) {
                        i16 = 0;
                    } else {
                        i16 = g8.getInt(0, 0);
                    }
                    a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet3, i16);
                    g8.recycle();
                    valueAnimator = animatorSet3;
                } else {
                    String str3 = "propertyValuesHolder";
                    if (name.equals(str3)) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType != i17 && eventType != i18) {
                                if (eventType != i19) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals(str3)) {
                                        TypedArray g9 = C1169b.g(resources2, theme2, asAttributeSet, i);
                                        String c8 = C1169b.c(g9, xmlResourceParser2, "propertyName", i17);
                                        if (!C1169b.d(xmlResourceParser2, "valueType")) {
                                            i9 = 4;
                                        } else {
                                            i9 = g9.getInt(i19, 4);
                                        }
                                        int i20 = i9;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            attributeSet2 = asAttributeSet;
                                            if (next2 == i17 || next2 == 1) {
                                                int i21 = i20;
                                                str = str3;
                                                Context context2 = context;
                                            } else {
                                                if (xmlResourceParser.getName().equals("keyframe")) {
                                                    int[] iArr = f12540j;
                                                    i11 = i20;
                                                    str2 = str3;
                                                    if (i11 == 4) {
                                                        TypedArray g10 = C1169b.g(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                        if (!C1169b.d(xmlResourceParser2, "value")) {
                                                            typedValue2 = null;
                                                        } else {
                                                            typedValue2 = g10.peekValue(0);
                                                        }
                                                        if (typedValue2 == null || !c(typedValue2.type)) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 3;
                                                        }
                                                        g10.recycle();
                                                        i11 = i15;
                                                    }
                                                    TypedArray g11 = C1169b.g(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                    float f9 = -1.0f;
                                                    if (C1169b.d(xmlResourceParser2, "fraction")) {
                                                        f9 = g11.getFloat(3, -1.0f);
                                                    }
                                                    if (!C1169b.d(xmlResourceParser2, "value")) {
                                                        typedValue = null;
                                                    } else {
                                                        typedValue = g11.peekValue(0);
                                                    }
                                                    if (typedValue != null) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (i11 != 4) {
                                                        i12 = i11;
                                                    } else if (!z || !c(typedValue.type)) {
                                                        i12 = 0;
                                                    } else {
                                                        i12 = 3;
                                                    }
                                                    if (z) {
                                                        if (i12 == 0) {
                                                            if (!C1169b.d(xmlResourceParser2, "value")) {
                                                                f8 = 0.0f;
                                                            } else {
                                                                f8 = g11.getFloat(0, 0.0f);
                                                            }
                                                            keyframe2 = Keyframe.ofFloat(f9, f8);
                                                        } else if (i12 == 1 || i12 == 3) {
                                                            if (!C1169b.d(xmlResourceParser2, "value")) {
                                                                i14 = 0;
                                                            } else {
                                                                i14 = g11.getInt(0, 0);
                                                            }
                                                            keyframe2 = Keyframe.ofInt(f9, i14);
                                                        } else {
                                                            keyframe2 = null;
                                                        }
                                                    } else if (i12 == 0) {
                                                        keyframe2 = Keyframe.ofFloat(f9);
                                                    } else {
                                                        keyframe2 = Keyframe.ofInt(f9);
                                                    }
                                                    if (!C1169b.d(xmlResourceParser2, "interpolator")) {
                                                        i13 = 0;
                                                    } else {
                                                        i13 = g11.getResourceId(1, 0);
                                                    }
                                                    Context context3 = context;
                                                    if (i13 > 0) {
                                                        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context3, i13);
                                                        if (loadInterpolator != null) {
                                                            keyframe2.setInterpolator(loadInterpolator);
                                                        } else {
                                                            throw new NullPointerException("Failed to parse interpolator, no start tag found");
                                                        }
                                                    }
                                                    g11.recycle();
                                                    if (keyframe2 != null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(keyframe2);
                                                    }
                                                    xmlResourceParser.next();
                                                } else {
                                                    i11 = i20;
                                                    str2 = str3;
                                                    Context context4 = context;
                                                }
                                                resources2 = resources;
                                                theme2 = theme;
                                                str3 = str2;
                                                asAttributeSet = attributeSet2;
                                                i20 = i11;
                                                i17 = 3;
                                            }
                                        }
                                        int i212 = i20;
                                        str = str3;
                                        Context context22 = context;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            propertyValuesHolder = null;
                                        } else {
                                            Keyframe keyframe3 = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe4 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe4.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe4.setFraction(1.0f);
                                                } else {
                                                    int size2 = arrayList3.size();
                                                    if (keyframe4.getType() == Float.TYPE) {
                                                        keyframe = Keyframe.ofFloat(1.0f);
                                                    } else if (keyframe4.getType() == Integer.TYPE) {
                                                        keyframe = Keyframe.ofInt(1.0f);
                                                    } else {
                                                        keyframe = Keyframe.ofObject(1.0f);
                                                    }
                                                    arrayList3.add(size2, keyframe);
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe3.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    if (keyframe3.getType() == Float.TYPE) {
                                                        ofObject = Keyframe.ofFloat(0.0f);
                                                    } else if (keyframe3.getType() == Integer.TYPE) {
                                                        ofObject = Keyframe.ofInt(0.0f);
                                                    } else {
                                                        ofObject = Keyframe.ofObject(0.0f);
                                                    }
                                                    arrayList3.add(0, ofObject);
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList3.toArray(keyframeArr);
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Keyframe keyframe5 = keyframeArr[i22];
                                                if (keyframe5.getFraction() < 0.0f) {
                                                    if (i22 == 0) {
                                                        keyframe5.setFraction(0.0f);
                                                    } else {
                                                        int i23 = size - 1;
                                                        if (i22 == i23) {
                                                            keyframe5.setFraction(1.0f);
                                                        } else {
                                                            int i24 = i22 + 1;
                                                            int i25 = i22;
                                                            while (true) {
                                                                if (i24 >= i23) {
                                                                    break;
                                                                } else if (keyframeArr[i24].getFraction() >= 0.0f) {
                                                                    break;
                                                                } else {
                                                                    i25 = i24;
                                                                    i24++;
                                                                }
                                                            }
                                                            float fraction3 = (keyframeArr[i25 + 1].getFraction() - keyframeArr[i22 - 1].getFraction()) / ((float) ((i25 - i22) + 2));
                                                            int i26 = i22;
                                                            while (i26 <= i25) {
                                                                keyframeArr[i26].setFraction(keyframeArr[i26 - 1].getFraction() + fraction3);
                                                                i26++;
                                                                size = size;
                                                            }
                                                            i10 = size;
                                                            i22++;
                                                            size = i10;
                                                        }
                                                    }
                                                }
                                                i10 = size;
                                                i22++;
                                                size = i10;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(c8, keyframeArr);
                                            if (i212 == 3) {
                                                propertyValuesHolder.setEvaluator(C1067h.f12556a);
                                            }
                                        }
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = b(g9, i9, 0, 1, c8);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        g9.recycle();
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str3;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlResourceParser2 = xmlResourceParser;
                                    str3 = str;
                                    asAttributeSet = attributeSet2;
                                    i17 = 3;
                                    i18 = 1;
                                    i19 = 2;
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size3];
                            for (int i27 = 0; i27 < size3; i27++) {
                                propertyValuesHolderArr[i27] = (PropertyValuesHolder) arrayList2.get(i27);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(propertyValuesHolderArr);
                        }
                        z6 = true;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                }
                if (animatorSet2 != null && !z6) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                animatorArr[i28] = (Animator) it.next();
                i28++;
            }
            if (i8 == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder b(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            r0 = 2
            android.util.TypedValue r1 = r11.peekValue(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            if (r4 == 0) goto L_0x0011
            int r1 = r1.type
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            android.util.TypedValue r5 = r11.peekValue(r14)
            if (r5 == 0) goto L_0x001a
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            int r5 = r5.type
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            r7 = 4
            r8 = 3
            if (r12 != r7) goto L_0x0038
            if (r4 == 0) goto L_0x002d
            boolean r12 = c(r1)
            if (r12 != 0) goto L_0x0035
        L_0x002d:
            if (r6 == 0) goto L_0x0037
            boolean r12 = c(r5)
            if (r12 == 0) goto L_0x0037
        L_0x0035:
            r12 = 3
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r12 != 0) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            r9 = 0
            if (r12 != r0) goto L_0x00a6
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            m0.e[] r13 = B.C0003d.l(r12)
            m0.e[] r14 = B.C0003d.l(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0160
        L_0x0054:
            if (r13 == 0) goto L_0x0095
            h2.g r1 = new h2.g
            r1.<init>()
            if (r14 == 0) goto L_0x008c
            boolean r4 = B.C0003d.e(r13, r14)
            if (r4 == 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r3] = r13
            r11[r2] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
        L_0x006d:
            r9 = r11
            goto L_0x0160
        L_0x0070:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
            goto L_0x006d
        L_0x0095:
            if (r14 == 0) goto L_0x0160
            h2.g r11 = new h2.g
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r14
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0160
        L_0x00a6:
            if (r12 != r8) goto L_0x00ab
            h2.h r12 = h2.C1067h.f12556a
            goto L_0x00ac
        L_0x00ab:
            r12 = r9
        L_0x00ac:
            r8 = 5
            r10 = 0
            if (r7 == 0) goto L_0x00f4
            if (r4 == 0) goto L_0x00e0
            if (r1 != r8) goto L_0x00b9
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00bd
        L_0x00b9:
            float r13 = r11.getFloat(r13, r10)
        L_0x00bd:
            if (r6 == 0) goto L_0x00d7
            if (r5 != r8) goto L_0x00c6
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ca
        L_0x00c6:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ca:
            float[] r14 = new float[r0]
            r14[r3] = r13
            r14[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        L_0x00d4:
            r9 = r11
            goto L_0x0159
        L_0x00d7:
            float[] r11 = new float[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00d4
        L_0x00e0:
            if (r5 != r8) goto L_0x00e7
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00eb
        L_0x00e7:
            float r11 = r11.getFloat(r14, r10)
        L_0x00eb:
            float[] r13 = new float[r2]
            r13[r3] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x00d4
        L_0x00f4:
            if (r4 == 0) goto L_0x0138
            if (r1 != r8) goto L_0x00fe
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x010d
        L_0x00fe:
            boolean r0 = c(r1)
            if (r0 == 0) goto L_0x0109
            int r13 = r11.getColor(r13, r3)
            goto L_0x010d
        L_0x0109:
            int r13 = r11.getInt(r13, r3)
        L_0x010d:
            if (r6 == 0) goto L_0x012f
            if (r5 != r8) goto L_0x0117
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0126
        L_0x0117:
            boolean r0 = c(r5)
            if (r0 == 0) goto L_0x0122
            int r11 = r11.getColor(r14, r3)
            goto L_0x0126
        L_0x0122:
            int r11 = r11.getInt(r14, r3)
        L_0x0126:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0159
        L_0x012f:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0159
        L_0x0138:
            if (r6 == 0) goto L_0x0159
            if (r5 != r8) goto L_0x0142
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0151
        L_0x0142:
            boolean r13 = c(r5)
            if (r13 == 0) goto L_0x014d
            int r11 = r11.getColor(r14, r3)
            goto L_0x0151
        L_0x014d:
            int r11 = r11.getInt(r14, r3)
        L_0x0151:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L_0x0159:
            if (r9 == 0) goto L_0x0160
            if (r12 == 0) goto L_0x0160
            r9.setEvaluator(r12)
        L_0x0160:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1060a.b(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static boolean c(int i8) {
        if (i8 < 28 || i8 > 31) {
            return false;
        }
        return true;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i8;
        int i9;
        int i10;
        int i11;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i12;
        boolean z6;
        int i13;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int i14 = 0;
        int i15 = 1;
        TypedArray g8 = C1169b.g(resources2, theme2, attributeSet2, f12538g);
        TypedArray g9 = C1169b.g(resources2, theme2, attributeSet2, f12541k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i16 = 300;
        if (C1169b.d(xmlResourceParser2, "duration")) {
            i16 = g8.getInt(1, 300);
        }
        long j7 = (long) i16;
        if (!C1169b.d(xmlResourceParser2, "startOffset")) {
            i8 = 0;
        } else {
            i8 = g8.getInt(2, 0);
        }
        long j8 = (long) i8;
        if (!C1169b.d(xmlResourceParser2, "valueType")) {
            i9 = 4;
        } else {
            i9 = g8.getInt(7, 4);
        }
        if (C1169b.d(xmlResourceParser2, "valueFrom") && C1169b.d(xmlResourceParser2, "valueTo")) {
            if (i9 == 4) {
                TypedValue peekValue = g8.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i12 = peekValue.type;
                } else {
                    i12 = 0;
                }
                TypedValue peekValue2 = g8.peekValue(6);
                if (peekValue2 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    i13 = peekValue2.type;
                } else {
                    i13 = 0;
                }
                if ((!z || !c(i12)) && (!z6 || !c(i13))) {
                    i9 = 0;
                } else {
                    i9 = 3;
                }
            }
            PropertyValuesHolder b8 = b(g8, i9, 5, 6, "");
            if (b8 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{b8});
            }
        }
        valueAnimator.setDuration(j7);
        valueAnimator.setStartDelay(j8);
        if (!C1169b.d(xmlResourceParser2, "repeatCount")) {
            i10 = 0;
        } else {
            i10 = g8.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i10);
        if (!C1169b.d(xmlResourceParser2, "repeatMode")) {
            i11 = 1;
        } else {
            i11 = g8.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i11);
        if (g9 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String c8 = C1169b.c(g9, xmlResourceParser2, "pathData", 1);
            if (c8 != null) {
                String c9 = C1169b.c(g9, xmlResourceParser2, "propertyXName", 2);
                String c10 = C1169b.c(g9, xmlResourceParser2, "propertyYName", 3);
                if (c9 == null && c10 == null) {
                    throw new InflateException(g9.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m8 = C0003d.m(c8);
                PathMeasure pathMeasure = new PathMeasure(m8, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f8 = 0.0f;
                while (true) {
                    f8 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f8));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator = valueAnimator;
                    i15 = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(m8, false);
                int min = Math.min(100, ((int) (f8 / 0.5f)) + i15);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f9 = f8 / ((float) (min - 1));
                valueAnimator2 = valueAnimator;
                typedArray = g8;
                int i17 = 0;
                int i18 = 0;
                float f10 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i18 >= min) {
                        break;
                    }
                    int i19 = min;
                    pathMeasure2.getPosTan(f10 - ((Float) arrayList.get(i17)).floatValue(), fArr3, (float[]) null);
                    fArr[i18] = fArr3[0];
                    fArr2[i18] = fArr3[1];
                    f10 += f9;
                    int i20 = i17 + 1;
                    if (i20 < arrayList.size() && f10 > ((Float) arrayList.get(i20)).floatValue()) {
                        pathMeasure2.nextContour();
                        i17 = i20;
                    }
                    i18++;
                    min = i19;
                }
                if (c9 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(c9, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (c10 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(c10, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i14 = 0;
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i14 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                    } else {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = g8;
                objectAnimator2.setPropertyName(C1169b.c(g9, xmlResourceParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = g8;
        }
        if (!C1169b.d(xmlResourceParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i14 = typedArray2.getResourceId(i14, i14);
        }
        if (i14 > 0) {
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i14);
            if (loadInterpolator != null) {
                valueAnimator3 = valueAnimator2;
                valueAnimator3.setInterpolator(loadInterpolator);
            } else {
                throw new NullPointerException("Failed to parse interpolator, no start tag found");
            }
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (g9 != null) {
            g9.recycle();
        }
        return valueAnimator3;
    }
}
