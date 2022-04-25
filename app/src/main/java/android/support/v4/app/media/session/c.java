package  android.support.v4.app.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {
    final Object a;

    a b;

    a c;

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = e.a(new b(this));
        } else {
            this.c = new c(this);
        }
    }

    public void a(d paramd) {}

    public void b(Bundle paramBundle) {}

    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat paramMediaMetadataCompat) {}

    public void d(PlaybackStateCompat paramPlaybackStateCompat) {}

    public void e(List<MediaSessionCompat.QueueItem> paramList) {}

    public void f(CharSequence paramCharSequence) {}

    public void g() {}

    public void h(String paramString, Bundle paramBundle) {}

    void i(int paramInt, Object paramObject, Bundle paramBundle) {
        a a1 = this.b;
        if (a1 != null) {
            paramObject = a1.obtainMessage(paramInt, paramObject);
            paramObject.setData(paramBundle);
            paramObject.sendToTarget();
        }
    }

    private class a extends Handler {}

    private static class b implements e.a {
        private final WeakReference<c> a;

        b(c param1c) {
            this.a = new WeakReference<c>(param1c);
        }

        public void a(Object param1Object) {
            c c = this.a.get();
            if (c != null)
                c.c(MediaMetadataCompat.a(param1Object));
        }

        public void b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
            c c = this.a.get();
            if (c != null)
                c.a(new d(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5));
        }

        public void c(Object param1Object) {
            c c = this.a.get();
            if (c != null && c.c == null)
                c.d(PlaybackStateCompat.a(param1Object));
        }

        public void d(String param1String, Bundle param1Bundle) {
            c c = this.a.get();
            if (c != null && (c.c == null || Build.VERSION.SDK_INT >= 23))
                c.h(param1String, param1Bundle);
        }

        public void e0(CharSequence param1CharSequence) {
            c c = this.a.get();
            if (c != null)
                c.f(param1CharSequence);
        }

        public void g0() {
            c c = this.a.get();
            if (c != null)
                c.g();
        }

        public void q0(Bundle param1Bundle) {
            c c = this.a.get();
            if (c != null)
                c.b(param1Bundle);
        }

        public void u0(List<?> param1List) {
            c c = this.a.get();
            if (c != null)
                c.e(MediaSessionCompat.QueueItem.b(param1List));
        }
    }

    private static class c extends a.a {
        private final WeakReference<c> j;

        c(c param1c) {
            this.j = new WeakReference<c>(param1c);
        }

        public void G1(int param1Int) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(9, Integer.valueOf(param1Int), null);
        }

        public void M0(boolean param1Boolean) {}

        public void T4(PlaybackStateCompat param1PlaybackStateCompat) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(2, param1PlaybackStateCompat, null);
        }

        public void U4(String param1String, Bundle param1Bundle) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(1, param1String, param1Bundle);
        }

        public void e0(CharSequence param1CharSequence) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(6, param1CharSequence, null);
        }

        public void g0() {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(8, null, null);
        }

        public void k4(boolean param1Boolean) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(11, Boolean.valueOf(param1Boolean), null);
        }

        public void l5(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
            c c1 = this.j.get();
            if (c1 != null) {
                if (param1ParcelableVolumeInfo != null) {
                    d d = new d(param1ParcelableVolumeInfo.j, param1ParcelableVolumeInfo.k, param1ParcelableVolumeInfo.l, param1ParcelableVolumeInfo.m, param1ParcelableVolumeInfo.n);
                } else {
                    param1ParcelableVolumeInfo = null;
                }
                c1.i(4, param1ParcelableVolumeInfo, null);
            }
        }

        public void q0(Bundle param1Bundle) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(7, param1Bundle, null);
        }

        public void r1(MediaMetadataCompat param1MediaMetadataCompat) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(3, param1MediaMetadataCompat, null);
        }

        public void u0(List<MediaSessionCompat.QueueItem> param1List) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(5, param1List, null);
        }

        public void x2(int param1Int) {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(12, Integer.valueOf(param1Int), null);
        }

        public void z2() {
            c c1 = this.j.get();
            if (c1 != null)
                c1.i(13, null, null);
        }
    }
}
