package  android.support.v4.app.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {
    final Object a;

    private final List<c> b;

    private HashMap<c, a> c;

    final MediaSessionCompat.Token d;

    void a() {
        if (this.d.a() == null)
            return;
        for (c c : this.b) {
            a a = new a(c);
            this.c.put(c, a);
            c.c = a;
            try {
                this.d.a().l1(a);
                c.i(13, null, null);
            } catch (RemoteException remoteException) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
                break;
            }
        }
        this.b.clear();
    }

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> j;

        protected void onReceiveResult(int param1Int, Bundle param1Bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.j.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || param1Bundle == null)
                return;
            synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                mediaControllerCompat$MediaControllerImplApi21.d.b(b.a.f0(e.a(param1Bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.d.c(param1Bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
                return;
            }
        }
    }

    private static class a extends c.c {
        a(c param1c) {
            super(param1c);
        }

        public void e0(CharSequence param1CharSequence) {
            throw new AssertionError();
        }

        public void g0() {
            throw new AssertionError();
        }

        public void l5(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void q0(Bundle param1Bundle) {
            throw new AssertionError();
        }

        public void r1(MediaMetadataCompat param1MediaMetadataCompat) {
            throw new AssertionError();
        }

        public void u0(List<MediaSessionCompat.QueueItem> param1List) {
            throw new AssertionError();
        }
    }
}
