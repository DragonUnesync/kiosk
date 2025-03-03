package i5;

import D4.i;
import m6.b;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int f12755a;

    /* renamed from: b  reason: collision with root package name */
    public int f12756b;

    /* renamed from: c  reason: collision with root package name */
    public int f12757c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f12758d;

    public void a(b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f12758d;
        int i = this.f12755a;
        int hashCode = bVar.hashCode() * -1640531527;
        int i8 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj3 = objArr[i8];
        if (obj3 != null) {
            if (!obj3.equals(bVar)) {
                do {
                    i8 = (i8 + 1) & i;
                    obj2 = objArr[i8];
                    if (obj2 == null) {
                    }
                } while (!obj2.equals(bVar));
                return;
            }
            return;
        }
        objArr[i8] = bVar;
        int i9 = this.f12756b + 1;
        this.f12756b = i9;
        if (i9 >= this.f12757c) {
            Object[] objArr2 = this.f12758d;
            int length = objArr2.length;
            int i10 = length << 1;
            int i11 = i10 - 1;
            Object[] objArr3 = new Object[i10];
            while (true) {
                int i12 = i9 - 1;
                if (i9 != 0) {
                    do {
                        length--;
                        obj = objArr2[length];
                    } while (obj == null);
                    int hashCode2 = obj.hashCode() * -1640531527;
                    int i13 = (hashCode2 ^ (hashCode2 >>> 16)) & i11;
                    if (objArr3[i13] != null) {
                        do {
                            i13 = (i13 + 1) & i11;
                        } while (objArr3[i13] != null);
                    }
                    objArr3[i13] = objArr2[length];
                    i9 = i12;
                } else {
                    this.f12755a = i11;
                    this.f12757c = (int) (((float) i10) * 0.75f);
                    this.f12758d = objArr3;
                    return;
                }
            }
        }
    }

    public void b() {
        Object[] objArr;
        int i;
        Object obj;
        int i8 = this.f12756b + 1;
        this.f12756b = i8;
        if (i8 > this.f12757c) {
            Object[] objArr2 = this.f12758d;
            if (objArr2.length < 1073741824) {
                int length = objArr2.length;
                int i9 = length << 1;
                int i10 = i9 - 1;
                Object[] objArr3 = new Object[i9];
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    Object obj2 = objArr2[i11];
                    if (obj2 != null) {
                        Class<q> cls = q.class;
                        if (obj2.getClass() == cls) {
                            q qVar = (q) obj2;
                            int i13 = i11 + length;
                            q qVar2 = null;
                            q qVar3 = null;
                            q qVar4 = null;
                            q qVar5 = null;
                            while (true) {
                                if ((qVar.f12752a & i10) == i11) {
                                    if (qVar3 == null) {
                                        objArr3[i11] = qVar;
                                    } else {
                                        qVar3.f12754c = qVar;
                                        qVar4 = qVar3;
                                    }
                                    qVar3 = qVar;
                                } else {
                                    if (qVar2 == null) {
                                        objArr3[i13] = qVar;
                                    } else {
                                        qVar2.f12754c = qVar;
                                        qVar5 = qVar2;
                                    }
                                    qVar2 = qVar;
                                }
                                i = i12 + 1;
                                obj = qVar.f12754c;
                                objArr = objArr2;
                                if (obj.getClass() != cls) {
                                    break;
                                }
                                qVar = (q) obj;
                                i12 = i;
                                objArr2 = objArr;
                            }
                            if ((((i) obj).f1232a.hashCode() & i10) == i11) {
                                if (qVar3 == null) {
                                    objArr3[i11] = obj;
                                } else {
                                    qVar3.f12754c = obj;
                                }
                                if (qVar2 != null) {
                                    if (qVar5 == null) {
                                        objArr3[i13] = qVar2.f12753b;
                                    } else {
                                        qVar5.f12754c = qVar2.f12753b;
                                    }
                                }
                            } else {
                                if (qVar2 == null) {
                                    objArr3[i13] = obj;
                                } else {
                                    qVar2.f12754c = obj;
                                }
                                if (qVar3 != null) {
                                    if (qVar4 == null) {
                                        objArr3[i11] = qVar3.f12753b;
                                    } else {
                                        qVar4.f12754c = qVar3.f12753b;
                                    }
                                }
                            }
                            i12 = i;
                        } else {
                            objArr = objArr2;
                            objArr3[((i) obj2).f1232a.hashCode() & i10] = obj2;
                        }
                    } else {
                        objArr = objArr2;
                    }
                    i11++;
                    objArr2 = objArr;
                }
                this.f12758d = objArr3;
                this.f12756b = i12;
                this.f12757c = (int) (((float) i9) * 0.25f);
            }
        }
    }

    public void c(i iVar) {
        Object[] objArr = this.f12758d;
        String str = iVar.f1232a;
        int hashCode = str.hashCode();
        int length = (objArr.length - 1) & hashCode;
        Object obj = objArr[length];
        if (obj == null) {
            objArr[length] = iVar;
            this.f12755a++;
            return;
        }
        Class<q> cls = q.class;
        if (obj.getClass() == cls) {
            while (true) {
                q qVar = (q) obj;
                if (qVar.f12752a != hashCode || !((i) qVar.f12753b).f1232a.equals(str)) {
                    Object obj2 = qVar.f12754c;
                    if (obj2.getClass() == cls) {
                        obj = obj2;
                    } else {
                        String str2 = ((i) obj2).f1232a;
                        if (str2.equals(str)) {
                            qVar.f12754c = iVar;
                            return;
                        }
                        qVar.f12754c = new q(obj2, str2.hashCode(), iVar);
                        this.f12755a++;
                        b();
                        return;
                    }
                } else {
                    qVar.f12753b = iVar;
                    return;
                }
            }
        } else {
            String str3 = ((i) obj).f1232a;
            if (str3.equals(str)) {
                objArr[length] = iVar;
                return;
            }
            objArr[length] = new q(obj, str3.hashCode(), iVar);
            this.f12755a++;
            b();
        }
    }

    public void d(int i, int i8, Object[] objArr) {
        int i9;
        Object obj;
        this.f12756b--;
        while (true) {
            int i10 = i + 1;
            while (true) {
                i9 = i10 & i8;
                obj = objArr[i9];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i11 = (hashCode ^ (hashCode >>> 16)) & i8;
                if (i <= i9) {
                    if (i >= i11 || i11 > i9) {
                        break;
                    }
                    i10 = i9 + 1;
                } else {
                    if (i >= i11 && i11 > i9) {
                        break;
                    }
                    i10 = i9 + 1;
                }
            }
            objArr[i] = obj;
            i = i9;
        }
    }

    public void e() {
        q qVar;
        Object obj;
        int i = this.f12755a - 1;
        this.f12755a = i;
        if (i < this.f12757c) {
            Object[] objArr = this.f12758d;
            if (objArr.length > 16) {
                int length = objArr.length;
                int i8 = length >> 1;
                Object[] objArr2 = new Object[i8];
                int i9 = this.f12756b;
                System.arraycopy(objArr, 0, objArr2, 0, i8);
                for (int i10 = i8; i10 < length; i10++) {
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        int i11 = i10 - i8;
                        Object obj3 = objArr2[i11];
                        if (obj3 == null) {
                            objArr2[i11] = obj2;
                        } else {
                            Class<q> cls = q.class;
                            if (obj3.getClass() == cls) {
                                while (true) {
                                    qVar = (q) obj3;
                                    obj = qVar.f12754c;
                                    if (obj.getClass() != cls) {
                                        break;
                                    }
                                    obj3 = obj;
                                }
                                qVar.f12754c = new q(obj, ((i) obj).f1232a.hashCode(), obj2);
                            } else {
                                objArr2[i11] = new q(obj3, ((i) obj3).f1232a.hashCode(), obj2);
                            }
                            i9++;
                        }
                    }
                }
                this.f12758d = objArr2;
                this.f12756b = i9;
                this.f12757c = (int) (((float) i8) * 0.25f);
            }
        }
    }
}
