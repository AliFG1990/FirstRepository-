package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.media.e;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    private final String j;

    private final CharSequence k;

    private final CharSequence l;

    private final CharSequence m;

    private final Bitmap n;

    private final Uri o;

    private final Bundle p;

    private final Uri q;

    private Object r;

    MediaDescriptionCompat(Parcel paramParcel) {
        this.j = paramParcel.readString();
        this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
        this.l = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
        this.m = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.n = (Bitmap)paramParcel.readParcelable(classLoader);
        this.o = (Uri)paramParcel.readParcelable(classLoader);
        this.p = paramParcel.readBundle(classLoader);
        this.q = (Uri)paramParcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2) {
        this.j = paramString;
        this.k = paramCharSequence1;
        this.l = paramCharSequence2;
        this.m = paramCharSequence3;
        this.n = paramBitmap;
        this.o = paramUri1;
        this.p = paramBundle;
        this.q = paramUri2;
    }

    public static MediaDescriptionCompat a(Object paramObject) {
        // Byte code:
        //   0: aconst_null
        //   1: astore_1
        //   2: aconst_null
        //   3: astore_2
        //   4: aload_1
        //   5: astore_3
        //   6: aload_0
        //   7: ifnull -> 208
        //   10: getstatic android/os/Build$VERSION.SDK_INT : I
        //   13: istore #4
        //   15: aload_1
        //   16: astore_3
        //   17: iload #4
        //   19: bipush #21
        //   21: if_icmplt -> 208
        //   24: new android/support/v4/media/MediaDescriptionCompat$b
        //   27: dup
        //   28: invokespecial <init> : ()V
        //   31: astore #5
        //   33: aload #5
        //   35: aload_0
        //   36: invokestatic f : (Ljava/lang/Object;)Ljava/lang/String;
        //   39: invokevirtual f : (Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   42: pop
        //   43: aload #5
        //   45: aload_0
        //   46: invokestatic h : (Ljava/lang/Object;)Ljava/lang/CharSequence;
        //   49: invokevirtual i : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   52: pop
        //   53: aload #5
        //   55: aload_0
        //   56: invokestatic g : (Ljava/lang/Object;)Ljava/lang/CharSequence;
        //   59: invokevirtual h : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   62: pop
        //   63: aload #5
        //   65: aload_0
        //   66: invokestatic b : (Ljava/lang/Object;)Ljava/lang/CharSequence;
        //   69: invokevirtual b : (Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   72: pop
        //   73: aload #5
        //   75: aload_0
        //   76: invokestatic d : (Ljava/lang/Object;)Landroid/graphics/Bitmap;
        //   79: invokevirtual d : (Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   82: pop
        //   83: aload #5
        //   85: aload_0
        //   86: invokestatic e : (Ljava/lang/Object;)Landroid/net/Uri;
        //   89: invokevirtual e : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   92: pop
        //   93: aload_0
        //   94: invokestatic c : (Ljava/lang/Object;)Landroid/os/Bundle;
        //   97: astore_1
        //   98: aload_1
        //   99: ifnull -> 119
        //   102: aload_1
        //   103: invokestatic a : (Landroid/os/Bundle;)V
        //   106: aload_1
        //   107: ldc 'android.support.v4.media.description.MEDIA_URI'
        //   109: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
        //   112: checkcast android/net/Uri
        //   115: astore_3
        //   116: goto -> 121
        //   119: aconst_null
        //   120: astore_3
        //   121: aload_3
        //   122: ifnull -> 157
        //   125: aload_1
        //   126: ldc 'android.support.v4.media.description.NULL_BUNDLE_FLAG'
        //   128: invokevirtual containsKey : (Ljava/lang/String;)Z
        //   131: ifeq -> 145
        //   134: aload_1
        //   135: invokevirtual size : ()I
        //   138: iconst_2
        //   139: if_icmpne -> 145
        //   142: goto -> 159
        //   145: aload_1
        //   146: ldc 'android.support.v4.media.description.MEDIA_URI'
        //   148: invokevirtual remove : (Ljava/lang/String;)V
        //   151: aload_1
        //   152: ldc 'android.support.v4.media.description.NULL_BUNDLE_FLAG'
        //   154: invokevirtual remove : (Ljava/lang/String;)V
        //   157: aload_1
        //   158: astore_2
        //   159: aload #5
        //   161: aload_2
        //   162: invokevirtual c : (Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   165: pop
        //   166: aload_3
        //   167: ifnull -> 180
        //   170: aload #5
        //   172: aload_3
        //   173: invokevirtual g : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   176: pop
        //   177: goto -> 197
        //   180: iload #4
        //   182: bipush #23
        //   184: if_icmplt -> 197
        //   187: aload #5
        //   189: aload_0
        //   190: invokestatic a : (Ljava/lang/Object;)Landroid/net/Uri;
        //   193: invokevirtual g : (Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;
        //   196: pop
        //   197: aload #5
        //   199: invokevirtual a : ()Landroid/support/v4/media/MediaDescriptionCompat;
        //   202: astore_3
        //   203: aload_3
        //   204: aload_0
        //   205: putfield r : Ljava/lang/Object;
        //   208: aload_3
        //   209: areturn
    }

    public Object b() {
        Object object1 = this.r;
        Object object2 = object1;
        if (object1 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 21) {
                object2 = object1;
            } else {
                Object object = d.a.b();
                d.a.g(object, this.j);
                d.a.i(object, this.k);
                d.a.h(object, this.l);
                d.a.c(object, this.m);
                d.a.e(object, this.n);
                d.a.f(object, this.o);
                object1 = this.p;
                object2 = object1;
                if (i < 23) {
                    object2 = object1;
                    if (this.q != null) {
                        object2 = object1;
                        if (object1 == null) {
                            object2 = new Bundle();
                            object2.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                        }
                        object2.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.q);
                    }
                }
                d.a.d(object, (Bundle)object2);
                if (i >= 23)
                    e.a.a(object, this.q);
                object2 = d.a.a(object);
                this.r = object2;
            }
        }
        return object2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.k);
        stringBuilder.append(", ");
        stringBuilder.append(this.l);
        stringBuilder.append(", ");
        stringBuilder.append(this.m);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        if (Build.VERSION.SDK_INT < 21) {
            paramParcel.writeString(this.j);
            TextUtils.writeToParcel(this.k, paramParcel, paramInt);
            TextUtils.writeToParcel(this.l, paramParcel, paramInt);
            TextUtils.writeToParcel(this.m, paramParcel, paramInt);
            paramParcel.writeParcelable((Parcelable)this.n, paramInt);
            paramParcel.writeParcelable((Parcelable)this.o, paramInt);
            paramParcel.writeBundle(this.p);
            paramParcel.writeParcelable((Parcelable)this.q, paramInt);
        } else {
            d.i(b(), paramParcel, paramInt);
        }
    }

    static final class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public MediaDescriptionCompat a(Parcel param1Parcel) {
            return (Build.VERSION.SDK_INT < 21) ? new MediaDescriptionCompat(param1Parcel) : MediaDescriptionCompat.a(d.a(param1Parcel));
        }

        public MediaDescriptionCompat[] b(int param1Int) {
            return new MediaDescriptionCompat[param1Int];
        }
    }

    public static final class b {
        private String a;

        private CharSequence b;

        private CharSequence c;

        private CharSequence d;

        private Bitmap e;

        private Uri f;

        private Bundle g;

        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(CharSequence param1CharSequence) {
            this.d = param1CharSequence;
            return this;
        }

        public b c(Bundle param1Bundle) {
            this.g = param1Bundle;
            return this;
        }

        public b d(Bitmap param1Bitmap) {
            this.e = param1Bitmap;
            return this;
        }

        public b e(Uri param1Uri) {
            this.f = param1Uri;
            return this;
        }

        public b f(String param1String) {
            this.a = param1String;
            return this;
        }

        public b g(Uri param1Uri) {
            this.h = param1Uri;
            return this;
        }

        public b h(CharSequence param1CharSequence) {
            this.c = param1CharSequence;
            return this;
        }

        public b i(CharSequence param1CharSequence) {
            this.b = param1CharSequence;
            return this;
        }
    }
}
