package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import f.a.b.a.b;

class MediaBrowserCompat$ItemReceiver extends b {
    private final String l;

    private final b m;

    protected void a(int paramInt, Bundle paramBundle) {
        MediaSessionCompat.a(paramBundle);
        if (paramInt != 0 || paramBundle == null || !paramBundle.containsKey("media_item")) {
            this.m.a(this.l);
            return;
        }
        Parcelable parcelable = paramBundle.getParcelable("media_item");
        if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
            this.m.b((MediaBrowserCompat$MediaItem)parcelable);
            return;
        }
        this.m.a(this.l);
    }
}
