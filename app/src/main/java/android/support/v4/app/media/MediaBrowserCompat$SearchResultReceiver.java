package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import f.a.b.a.b;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends b {
    private final String l;

    private final Bundle m;

    private final c n;

    protected void a(int paramInt, Bundle paramBundle) {
        ArrayList<MediaBrowserCompat$MediaItem> arrayList;
        MediaSessionCompat.a(paramBundle);
        if (paramInt != 0 || paramBundle == null || !paramBundle.containsKey("search_results")) {
            this.n.a(this.l, this.m);
            return;
        }
        Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
        paramBundle = null;
        if (arrayOfParcelable != null) {
            ArrayList<MediaBrowserCompat$MediaItem> arrayList1 = new ArrayList();
            int i = arrayOfParcelable.length;
            paramInt = 0;
            while (true) {
                arrayList = arrayList1;
                if (paramInt < i) {
                    arrayList1.add((MediaBrowserCompat$MediaItem)arrayOfParcelable[paramInt]);
                    paramInt++;
                    continue;
                }
                break;
            }
        }
        this.n.b(this.l, this.m, arrayList);
    }
}
