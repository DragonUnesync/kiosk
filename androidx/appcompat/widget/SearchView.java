package androidx.appcompat.widget;

import H6.b;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.C1183b;
import o.C1285o;
import o.C1307z0;
import o.T0;
import o.W0;
import o.X0;
import o.Y0;
import o.Z0;
import o.a1;
import o.c1;
import z0.C1639a;

public class SearchView extends C1307z0 implements C1183b {

    /* renamed from: d1  reason: collision with root package name */
    public static final b f7468d1;

    /* renamed from: A0  reason: collision with root package name */
    public final ImageView f7469A0;

    /* renamed from: B0  reason: collision with root package name */
    public final Drawable f7470B0;

    /* renamed from: C0  reason: collision with root package name */
    public final int f7471C0;

    /* renamed from: D0  reason: collision with root package name */
    public final int f7472D0;

    /* renamed from: E0  reason: collision with root package name */
    public final Intent f7473E0;

    /* renamed from: F0  reason: collision with root package name */
    public final Intent f7474F0;

    /* renamed from: G0  reason: collision with root package name */
    public final CharSequence f7475G0;

    /* renamed from: H0  reason: collision with root package name */
    public X0 f7476H0;

    /* renamed from: I0  reason: collision with root package name */
    public View.OnFocusChangeListener f7477I0;

    /* renamed from: J0  reason: collision with root package name */
    public Y0 f7478J0;

    /* renamed from: K0  reason: collision with root package name */
    public View.OnClickListener f7479K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f7480L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f7481M0;

    /* renamed from: N0  reason: collision with root package name */
    public C1639a f7482N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f7483O0;

    /* renamed from: P0  reason: collision with root package name */
    public CharSequence f7484P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f7485Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f7486R0;

    /* renamed from: S0  reason: collision with root package name */
    public int f7487S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f7488T0;

    /* renamed from: U0  reason: collision with root package name */
    public String f7489U0;

    /* renamed from: V0  reason: collision with root package name */
    public CharSequence f7490V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f7491W0;

    /* renamed from: X0  reason: collision with root package name */
    public int f7492X0;

    /* renamed from: Y0  reason: collision with root package name */
    public SearchableInfo f7493Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public Bundle f7494Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final T0 f7495a1 = new T0(this, 0);

    /* renamed from: b1  reason: collision with root package name */
    public final T0 f7496b1 = new T0(this, 1);

    /* renamed from: c1  reason: collision with root package name */
    public final WeakHashMap f7497c1 = new WeakHashMap();

    /* renamed from: m0  reason: collision with root package name */
    public final SearchAutoComplete f7498m0;

    /* renamed from: n0  reason: collision with root package name */
    public final View f7499n0;

    /* renamed from: o0  reason: collision with root package name */
    public final View f7500o0;
    public final View p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ImageView f7501q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ImageView f7502r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ImageView f7503s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f7504t0;

    /* renamed from: u0  reason: collision with root package name */
    public final View f7505u0;

    /* renamed from: v0  reason: collision with root package name */
    public a1 f7506v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Rect f7507w0 = new Rect();

    /* renamed from: x0  reason: collision with root package name */
    public final Rect f7508x0 = new Rect();

    /* renamed from: y0  reason: collision with root package name */
    public final int[] f7509y0 = new int[2];

    /* renamed from: z0  reason: collision with root package name */
    public final int[] f7510z0 = new int[2];

    public static class SearchAutoComplete extends C1285o {

        /* renamed from: b0  reason: collision with root package name */
        public int f7511b0 = getThreshold();

        /* renamed from: c0  reason: collision with root package name */
        public SearchView f7512c0;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f7513d0;

        /* renamed from: e0  reason: collision with root package name */
        public final d f7514e0 = new d(this);

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i8 < 480) {
                return 160;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            b bVar = SearchView.f7468d1;
            bVar.getClass();
            b.a();
            Method method = bVar.f2204c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            if (this.f7511b0 <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f7513d0) {
                d dVar = this.f7514e0;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f7512c0;
            searchView.y(searchView.f7481M0);
            searchView.post(searchView.f7495a1);
            if (searchView.f7498m0.hasFocus()) {
                searchView.n();
            }
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f7512c0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f7512c0.hasFocus() && getVisibility() == 0) {
                this.f7513d0 = true;
                Context context = getContext();
                b bVar = SearchView.f7468d1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f7514e0;
            if (!z) {
                this.f7513d0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f7513d0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f7513d0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f7512c0 = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f7511b0 = i;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [H6.b, java.lang.Object] */
    static {
        b bVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            ? obj = new Object();
            obj.f2202a = null;
            obj.f2203b = null;
            obj.f2204c = null;
            b.a();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                obj.f2202a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                obj.f2203b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                obj.f2204c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            bVar = obj;
        }
        f7468d1 = bVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r20, android.util.AttributeSet r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r3 = r21
            r5 = 2130969536(0x7f0403c0, float:1.7547757E38)
            r6.<init>(r7, r3, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f7507w0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f7508x0 = r0
            r8 = 2
            int[] r0 = new int[r8]
            r6.f7509y0 = r0
            int[] r0 = new int[r8]
            r6.f7510z0 = r0
            o.T0 r0 = new o.T0
            r1 = 0
            r0.<init>(r6, r1)
            r6.f7495a1 = r0
            o.T0 r0 = new o.T0
            r1 = 1
            r0.<init>(r6, r1)
            r6.f7496b1 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r6.f7497c1 = r0
            androidx.appcompat.widget.a r9 = new androidx.appcompat.widget.a
            r9.<init>(r6)
            androidx.appcompat.widget.b r10 = new androidx.appcompat.widget.b
            r10.<init>(r6)
            o.V0 r11 = new o.V0
            r11.<init>(r6)
            C3.x r12 = new C3.x
            r0 = 2
            r12.<init>(r0, r6)
            d3.e r13 = new d3.e
            r0 = 3
            r13.<init>(r0, r6)
            o.S0 r14 = new o.S0
            r14.<init>(r6)
            int[] r2 = g.C0940a.f11832u
            d4.k r15 = new d4.k
            r4 = 0
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r3, r2, r5, r4)
            r15.<init>((android.content.Context) r7, (android.content.res.TypedArray) r1)
            r0 = r19
            r16 = r1
            r1 = r20
            r3 = r21
            r8 = 0
            r4 = r16
            v0.C1510H.o(r0, r1, r2, r3, r4, r5)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r20)
            r1 = 19
            r2 = 2131558425(0x7f0d0019, float:1.8742165E38)
            r3 = r16
            int r1 = r3.getResourceId(r1, r2)
            r2 = 1
            r0.inflate(r1, r6, r2)
            r0 = 2131362462(0x7f0a029e, float:1.8344705E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r0
            r6.f7498m0 = r0
            r0.setSearchView(r6)
            r1 = 2131362458(0x7f0a029a, float:1.8344697E38)
            android.view.View r1 = r6.findViewById(r1)
            r6.f7499n0 = r1
            r1 = 2131362461(0x7f0a029d, float:1.8344703E38)
            android.view.View r1 = r6.findViewById(r1)
            r6.f7500o0 = r1
            r4 = 2131362528(0x7f0a02e0, float:1.834484E38)
            android.view.View r4 = r6.findViewById(r4)
            r6.p0 = r4
            r5 = 2131362456(0x7f0a0298, float:1.8344693E38)
            android.view.View r5 = r6.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6.f7501q0 = r5
            r7 = 2131362459(0x7f0a029b, float:1.83447E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f7502r0 = r7
            r2 = 2131362457(0x7f0a0299, float:1.8344695E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r6.f7503s0 = r2
            r8 = 2131362463(0x7f0a029f, float:1.8344707E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r6.f7504t0 = r8
            r17 = r10
            r10 = 2131362460(0x7f0a029c, float:1.8344701E38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r6.f7469A0 = r10
            r18 = r13
            r13 = 20
            android.graphics.drawable.Drawable r13 = r15.I(r13)
            r1.setBackground(r13)
            r1 = 25
            android.graphics.drawable.Drawable r1 = r15.I(r1)
            r4.setBackground(r1)
            r1 = 23
            android.graphics.drawable.Drawable r4 = r15.I(r1)
            r5.setImageDrawable(r4)
            r4 = 15
            android.graphics.drawable.Drawable r4 = r15.I(r4)
            r7.setImageDrawable(r4)
            r4 = 12
            android.graphics.drawable.Drawable r4 = r15.I(r4)
            r2.setImageDrawable(r4)
            r4 = 28
            android.graphics.drawable.Drawable r4 = r15.I(r4)
            r8.setImageDrawable(r4)
            android.graphics.drawable.Drawable r1 = r15.I(r1)
            r10.setImageDrawable(r1)
            r1 = 22
            android.graphics.drawable.Drawable r1 = r15.I(r1)
            r6.f7470B0 = r1
            android.content.res.Resources r1 = r19.getResources()
            r4 = 2131951637(0x7f130015, float:1.9539694E38)
            java.lang.String r1 = r1.getString(r4)
            com.bumptech.glide.c.w(r5, r1)
            r1 = 26
            r4 = 2131558424(0x7f0d0018, float:1.8742163E38)
            int r1 = r3.getResourceId(r1, r4)
            r6.f7471C0 = r1
            r1 = 13
            r4 = 0
            int r1 = r3.getResourceId(r1, r4)
            r6.f7472D0 = r1
            r5.setOnClickListener(r9)
            r2.setOnClickListener(r9)
            r7.setOnClickListener(r9)
            r8.setOnClickListener(r9)
            r0.setOnClickListener(r9)
            r0.addTextChangedListener(r14)
            r0.setOnEditorActionListener(r11)
            r0.setOnItemClickListener(r12)
            r1 = r18
            r0.setOnItemSelectedListener(r1)
            r1 = r17
            r0.setOnKeyListener(r1)
            o.U0 r1 = new o.U0
            r1.<init>(r6)
            r0.setOnFocusChangeListener(r1)
            r1 = 18
            r2 = 1
            boolean r1 = r3.getBoolean(r1, r2)
            r6.setIconifiedByDefault(r1)
            r1 = -1
            r2 = 2
            int r2 = r3.getDimensionPixelSize(r2, r1)
            if (r2 == r1) goto L_0x0191
            r6.setMaxWidth(r2)
        L_0x0191:
            r2 = 14
            java.lang.CharSequence r2 = r3.getText(r2)
            r6.f7475G0 = r2
            r2 = 21
            java.lang.CharSequence r2 = r3.getText(r2)
            r6.f7484P0 = r2
            r2 = 6
            int r2 = r3.getInt(r2, r1)
            if (r2 == r1) goto L_0x01ab
            r6.setImeOptions(r2)
        L_0x01ab:
            r2 = 5
            int r2 = r3.getInt(r2, r1)
            if (r2 == r1) goto L_0x01b5
            r6.setInputType(r2)
        L_0x01b5:
            r1 = 1
            boolean r1 = r3.getBoolean(r1, r1)
            r6.setFocusable(r1)
            r15.M2()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.speech.action.WEB_SEARCH"
            r1.<init>(r2)
            r6.f7473E0 = r1
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)
            java.lang.String r3 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r4 = "web_search"
            r1.putExtra(r3, r4)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.RECOGNIZE_SPEECH"
            r1.<init>(r3)
            r6.f7474F0 = r1
            r1.addFlags(r2)
            int r0 = r0.getDropDownAnchor()
            android.view.View r0 = r6.findViewById(r0)
            r6.f7505u0 = r0
            if (r0 == 0) goto L_0x01f6
            j3.a r1 = new j3.a
            r2 = 1
            r1.<init>(r2, r6)
            r0.addOnLayoutChangeListener(r1)
        L_0x01f6:
            boolean r0 = r6.f7480L0
            r6.y(r0)
            r19.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131165238);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131165239);
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    public final void b() {
        if (!this.f7491W0) {
            this.f7491W0 = true;
            SearchAutoComplete searchAutoComplete = this.f7498m0;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f7492X0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public final void clearFocus() {
        this.f7486R0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f7486R0 = false;
    }

    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f7490V0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f7492X0);
        this.f7491W0 = false;
    }

    public int getImeOptions() {
        return this.f7498m0.getImeOptions();
    }

    public int getInputType() {
        return this.f7498m0.getInputType();
    }

    public int getMaxWidth() {
        return this.f7487S0;
    }

    public CharSequence getQuery() {
        return this.f7498m0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f7484P0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f7493Y0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f7475G0;
        }
        return getContext().getText(this.f7493Y0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f7472D0;
    }

    public int getSuggestionRowLayout() {
        return this.f7471C0;
    }

    public C1639a getSuggestionsAdapter() {
        return this.f7482N0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f7490V0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f7494Z0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f7493Y0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7494Z0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        b bVar = f7468d1;
        bVar.getClass();
        b.a();
        Method method = bVar.f2202a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused) {
            }
        }
        bVar.getClass();
        b.a();
        Method method2 = bVar.f2203b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f7480L0) {
            clearFocus();
            y(true);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f7495a1);
        post(this.f7496b1);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        if (z) {
            int[] iArr = this.f7509y0;
            SearchAutoComplete searchAutoComplete = this.f7498m0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f7510z0;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            Rect rect = this.f7507w0;
            rect.set(i12, i11, searchAutoComplete.getWidth() + i12, searchAutoComplete.getHeight() + i11);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f7508x0;
            rect2.set(i13, 0, i14, i15);
            a1 a1Var = this.f7506v0;
            if (a1Var == null) {
                a1 a1Var2 = new a1(searchAutoComplete, rect2, rect);
                this.f7506v0 = a1Var2;
                setTouchDelegate(a1Var2);
                return;
            }
            a1Var.f13914b.set(rect2);
            Rect rect3 = a1Var.f13916d;
            rect3.set(rect2);
            int i16 = -a1Var.e;
            rect3.inset(i16, i16);
            a1Var.f13915c.set(rect);
        }
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        if (this.f7481M0) {
            super.onMeasure(i, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.f7487S0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f7487S0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.f7487S0) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, O7.b.MAX_POW2), View.MeasureSpec.makeMeasureSpec(size2, O7.b.MAX_POW2));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z0 z02 = (Z0) parcelable;
        super.onRestoreInstanceState(z02.f367U);
        y(z02.f13908W);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, o.Z0, B0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new B0.b(super.onSaveInstanceState());
        bVar.f13908W = this.f7481M0;
        return bVar;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f7495a1);
    }

    public final boolean p(int i) {
        int i8;
        Uri uri;
        String k8;
        Y0 y02 = this.f7478J0;
        if (y02 != null) {
            y02.c(i);
            return false;
        }
        Cursor cursor = this.f7482N0.f16406W;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i9 = c1.f13932s0;
                String k9 = c1.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (k9 == null) {
                    k9 = this.f7493Y0.getSuggestIntentAction();
                }
                if (k9 == null) {
                    k9 = "android.intent.action.SEARCH";
                }
                String k10 = c1.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (k10 == null) {
                    k10 = this.f7493Y0.getSuggestIntentData();
                }
                if (!(k10 == null || (k8 = c1.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    k10 = k10 + "/" + Uri.encode(k8);
                }
                if (k10 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(k10);
                }
                intent = l(k9, uri, c1.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), c1.k(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e8) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e8);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public final void q(int i) {
        if (this.f7478J0 == null) {
            Editable text = this.f7498m0.getText();
            Cursor cursor = this.f7482N0.f16406W;
            if (cursor != null) {
                if (cursor.moveToPosition(i)) {
                    String b8 = this.f7482N0.b(cursor);
                    if (b8 != null) {
                        setQuery(b8);
                    } else {
                        setQuery(text);
                    }
                } else {
                    setQuery(text);
                }
            }
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (this.f7486R0 || !isFocusable()) {
            return false;
        }
        if (this.f7481M0) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f7498m0.requestFocus(i, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            X0 x02 = this.f7476H0;
            if (x02 != null) {
                text.toString();
                x02.b();
            }
            if (this.f7493Y0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f7494Z0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f7479K0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f7480L0 != z) {
            this.f7480L0 = z;
            y(z);
            v();
        }
    }

    public void setImeOptions(int i) {
        this.f7498m0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f7498m0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f7487S0 = i;
        requestLayout();
    }

    public void setOnCloseListener(W0 w02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f7477I0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(X0 x02) {
        this.f7476H0 = x02;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f7479K0 = onClickListener;
    }

    public void setOnSuggestionListener(Y0 y02) {
        this.f7478J0 = y02;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f7484P0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f7485Q0 = z;
        C1639a aVar = this.f7482N0;
        if (aVar instanceof c1) {
            c1 c1Var = (c1) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            c1Var.f13938k0 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i;
        this.f7493Y0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f7493Y0.getImeOptions());
            int inputType = this.f7493Y0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f7493Y0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            C1639a aVar = this.f7482N0;
            if (aVar != null) {
                aVar.a((Cursor) null);
            }
            if (this.f7493Y0.getSuggestAuthority() != null) {
                c1 c1Var = new c1(getContext(), this, this.f7493Y0, this.f7497c1);
                this.f7482N0 = c1Var;
                searchAutoComplete.setAdapter(c1Var);
                c1 c1Var2 = (c1) this.f7482N0;
                if (this.f7485Q0) {
                    i = 2;
                } else {
                    i = 1;
                }
                c1Var2.f13938k0 = i;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f7493Y0;
        boolean z6 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f7493Y0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f7473E0;
            } else if (this.f7493Y0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f7474F0;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z = false;
                }
                z6 = z;
            }
        }
        this.f7488T0 = z6;
        if (z6) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f7481M0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f7483O0 = z;
        y(this.f7481M0);
    }

    public void setSuggestionsAdapter(C1639a aVar) {
        this.f7482N0 = aVar;
        this.f7498m0.setAdapter(aVar);
    }

    public final void t() {
        int i;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f7498m0.getText());
        if (!isEmpty || (this.f7480L0 && !this.f7491W0)) {
            i = 0;
        } else {
            i = 8;
        }
        ImageView imageView = this.f7503s0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f7498m0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f7500o0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.p0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.f7480L0;
        SearchAutoComplete searchAutoComplete = this.f7498m0;
        if (z && (drawable = this.f7470B0) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i;
        if ((this.f7483O0 || this.f7488T0) && !this.f7481M0 && (this.f7502r0.getVisibility() == 0 || this.f7504t0.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.p0.setVisibility(i);
    }

    public final void x(boolean z) {
        int i;
        boolean z6 = this.f7483O0;
        if (!z6 || ((!z6 && !this.f7488T0) || this.f7481M0 || !hasFocus() || (!z && this.f7488T0))) {
            i = 8;
        } else {
            i = 0;
        }
        this.f7502r0.setVisibility(i);
    }

    public final void y(boolean z) {
        int i;
        int i8;
        int i9;
        this.f7481M0 = z;
        int i10 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f7498m0.getText());
        this.f7501q0.setVisibility(i);
        x(!isEmpty);
        if (z) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        this.f7499n0.setVisibility(i8);
        ImageView imageView = this.f7469A0;
        if (imageView.getDrawable() == null || this.f7480L0) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        imageView.setVisibility(i9);
        t();
        if (this.f7488T0 && !this.f7481M0 && isEmpty) {
            this.f7502r0.setVisibility(8);
            i10 = 0;
        }
        this.f7504t0.setVisibility(i10);
        w();
    }
}
