package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    private final int j;

    private final MediaDescriptionCompat k;

    MediaBrowserCompat$MediaItem(Parcel paramParcel) {
        this.j = paramParcel.readInt();
        this.k = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaItem{");
        stringBuilder.append("mFlags=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mDescription=");
        stringBuilder.append(this.k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.j);
        this.k.writeToParcel(paramParcel, paramInt);
    }

    static final class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public MediaBrowserCompat$MediaItem a(Parcel param1Parcel) {
            return new MediaBrowserCompat$MediaItem(param1Parcel);
        }

        public MediaBrowserCompat$MediaItem[] b(int param1Int) {
            return new MediaBrowserCompat$MediaItem[param1Int];
        }
    }
}
