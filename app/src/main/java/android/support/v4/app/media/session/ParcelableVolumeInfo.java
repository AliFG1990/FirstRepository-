package  android.support.v4.app.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    public int j;

    public int k;

    public int l;

    public int m;

    public int n;

    public ParcelableVolumeInfo(Parcel paramParcel) {
        this.j = paramParcel.readInt();
        this.l = paramParcel.readInt();
        this.m = paramParcel.readInt();
        this.n = paramParcel.readInt();
        this.k = paramParcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.j);
        paramParcel.writeInt(this.l);
        paramParcel.writeInt(this.m);
        paramParcel.writeInt(this.n);
        paramParcel.writeInt(this.k);
    }

    static final class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public ParcelableVolumeInfo a(Parcel param1Parcel) {
            return new ParcelableVolumeInfo(param1Parcel);
        }

        public ParcelableVolumeInfo[] b(int param1Int) {
            return new ParcelableVolumeInfo[param1Int];
        }
    }
}
