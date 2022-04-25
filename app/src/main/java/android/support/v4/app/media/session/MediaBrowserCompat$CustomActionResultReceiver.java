package  android.support.v4.app.media.session;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import f.a.b.a.b;

class MediaBrowserCompat$CustomActionResultReceiver extends b {
    private final String l;

    private final Bundle m;

    private final a n;

    protected void a(int paramInt, Bundle paramBundle) {
        if (this.n == null)
            return;
        MediaSessionCompat.a(paramBundle);
        if (paramInt != -1) {
            if (paramInt != 0) {
                if (paramInt != 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown result code: ");
                    stringBuilder.append(paramInt);
                    stringBuilder.append(" (extras=");
                    stringBuilder.append(this.m);
                    stringBuilder.append(", resultData=");
                    stringBuilder.append(paramBundle);
                    stringBuilder.append(")");
                    Log.w("MediaBrowserCompat", stringBuilder.toString());
                } else {
                    this.n.b(this.l, this.m, paramBundle);
                }
            } else {
                this.n.c(this.l, this.m, paramBundle);
            }
        } else {
            this.n.a(this.l, this.m, paramBundle);
        }
    }
}
