package  android.support.v4.app.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    final int j;

    final long k;

    final long l;

    final float m;

    final long n;

    final int o;

    final CharSequence p;

    final long q;

    List<CustomAction> r;

    final long s;

    final Bundle t;

    private Object u;

    PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List<CustomAction> paramList, long paramLong5, Bundle paramBundle) {
        this.j = paramInt1;
        this.k = paramLong1;
        this.l = paramLong2;
        this.m = paramFloat;
        this.n = paramLong3;
        this.o = paramInt2;
        this.p = paramCharSequence;
        this.q = paramLong4;
        this.r = new ArrayList<CustomAction>(paramList);
        this.s = paramLong5;
        this.t = paramBundle;
    }

    PlaybackStateCompat(Parcel paramParcel) {
        this.j = paramParcel.readInt();
        this.k = paramParcel.readLong();
        this.m = paramParcel.readFloat();
        this.q = paramParcel.readLong();
        this.l = paramParcel.readLong();
        this.n = paramParcel.readLong();
        this.p = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
        this.r = paramParcel.createTypedArrayList(CustomAction.CREATOR);
        this.s = paramParcel.readLong();
        this.t = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.o = paramParcel.readInt();
    }

    public static PlaybackStateCompat a(Object paramObject) {
        PlaybackStateCompat playbackStateCompat;
        List<Object> list1 = null;
        Bundle bundle = null;
        List<Object> list2 = list1;
        if (paramObject != null) {
            list2 = list1;
            if (Build.VERSION.SDK_INT >= 21) {
                list1 = g.d(paramObject);
                if (list1 != null) {
                    list2 = new ArrayList(list1.size());
                    Iterator iterator = list1.iterator();
                    while (iterator.hasNext())
                        list2.add(CustomAction.a(iterator.next()));
                } else {
                    list2 = null;
                }
                if (Build.VERSION.SDK_INT >= 22)
                    bundle = h.a(paramObject);
                playbackStateCompat = new PlaybackStateCompat(g.i(paramObject), g.h(paramObject), g.c(paramObject), g.g(paramObject), g.a(paramObject), 0, g.e(paramObject), g.f(paramObject), (List)list2, g.b(paramObject), bundle);
                playbackStateCompat.u = paramObject;
            }
        }
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.j);
        stringBuilder.append(", position=");
        stringBuilder.append(this.k);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.l);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.m);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.q);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.n);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.o);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.p);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.r);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.s);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.j);
        paramParcel.writeLong(this.k);
        paramParcel.writeFloat(this.m);
        paramParcel.writeLong(this.q);
        paramParcel.writeLong(this.l);
        paramParcel.writeLong(this.n);
        TextUtils.writeToParcel(this.p, paramParcel, paramInt);
        paramParcel.writeTypedList(this.r);
        paramParcel.writeLong(this.s);
        paramParcel.writeBundle(this.t);
        paramParcel.writeInt(this.o);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        private final String j;

        private final CharSequence k;

        private final int l;

        private final Bundle m;

        private Object n;

        CustomAction(Parcel param1Parcel) {
            this.j = param1Parcel.readString();
            this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
            this.l = param1Parcel.readInt();
            this.m = param1Parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String param1String, CharSequence param1CharSequence, int param1Int, Bundle param1Bundle) {
            this.j = param1String;
            this.k = param1CharSequence;
            this.l = param1Int;
            this.m = param1Bundle;
        }

        public static CustomAction a(Object param1Object) {
            if (param1Object == null || Build.VERSION.SDK_INT < 21)
                return null;
            CustomAction customAction = new CustomAction(g.a.a(param1Object), g.a.d(param1Object), g.a.c(param1Object), g.a.b(param1Object));
            customAction.n = param1Object;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append(this.k);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.l);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.m);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel param1Parcel, int param1Int) {
            param1Parcel.writeString(this.j);
            TextUtils.writeToParcel(this.k, param1Parcel, param1Int);
            param1Parcel.writeInt(this.l);
            param1Parcel.writeBundle(this.m);
        }

        static final class a implements Parcelable.Creator<CustomAction> {
            public PlaybackStateCompat.CustomAction a(Parcel param2Parcel) {
                return new PlaybackStateCompat.CustomAction(param2Parcel);
            }

            public PlaybackStateCompat.CustomAction[] b(int param2Int) {
                return new PlaybackStateCompat.CustomAction[param2Int];
            }
        }
    }

    static final class a implements Parcelable.Creator<CustomAction> {
        public PlaybackStateCompat.CustomAction a(Parcel param1Parcel) {
            return new PlaybackStateCompat.CustomAction(param1Parcel);
        }

        public PlaybackStateCompat.CustomAction[] b(int param1Int) {
            return new PlaybackStateCompat.CustomAction[param1Int];
        }
    }

    static final class a implements Parcelable.Creator<PlaybackStateCompat> {
        public PlaybackStateCompat a(Parcel param1Parcel) {
            return new PlaybackStateCompat(param1Parcel);
        }

        public PlaybackStateCompat[] b(int param1Int) {
            return new PlaybackStateCompat[param1Int];
        }
    }
}
