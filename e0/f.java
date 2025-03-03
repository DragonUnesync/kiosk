package E0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import n2.a;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public final TextView f1306b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1308d = true;

    public f(TextView textView) {
        this.f1306b = textView;
        this.f1307c = new d(textView);
    }

    public final InputFilter[] M(InputFilter[] inputFilterArr) {
        if (!this.f1308d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            d dVar = this.f1307c;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i10] == dVar) {
                return inputFilterArr;
            } else {
                i10++;
            }
        }
    }

    public final void W0(boolean z) {
        if (z) {
            TextView textView = this.f1306b;
            textView.setTransformationMethod(o1(textView.getTransformationMethod()));
        }
    }

    public final void X0(boolean z) {
        this.f1308d = z;
        TextView textView = this.f1306b;
        textView.setTransformationMethod(o1(textView.getTransformationMethod()));
        textView.setFilters(M(textView.getFilters()));
    }

    public final TransformationMethod o1(TransformationMethod transformationMethod) {
        if (this.f1308d) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new j(transformationMethod);
            }
            return transformationMethod;
        } else if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f1315a;
        } else {
            return transformationMethod;
        }
    }

    public final boolean t0() {
        return this.f1308d;
    }
}
