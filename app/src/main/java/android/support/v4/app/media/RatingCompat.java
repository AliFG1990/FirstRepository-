package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    private final int j;

    private final float k;

    RatingCompat(int paramInt, float paramFloat) {
        this.j = paramInt;
        this.k = paramFloat;
    }

    public int describeContents() {
        return this.j;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.j);
        stringBuilder.append(" rating=");
        float f = this.k;
        if (f < 0.0F) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.j);
        paramParcel.writeFloat(this.k);
    }

    static final class a implements Parcelable.Creator<RatingCompat> {
        public RatingCompat a(Parcel param1Parcel) {
            return new RatingCompat(param1Parcel.readInt(), param1Parcel.readFloat());
        }

        public RatingCompat[] b(int param1Int) {
            return new RatingCompat[param1Int];
        }
    }
}
