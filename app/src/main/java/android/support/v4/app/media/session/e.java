package android.support.v4.app.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class e {
    public static Object a(a parama) {
        return new b<a>(parama);
    }

    public static interface a {
        void a(Object param1Object);

        void b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5);

        void c(Object param1Object);

        void d(String param1String, Bundle param1Bundle);

        void e0(CharSequence param1CharSequence);

        void g0();

        void q0(Bundle param1Bundle);

        void u0(List<?> param1List);
    }

    static class b<T extends a> extends MediaController.Callback {
        protected final T a;

        public b(T param1T) {
            this.a = param1T;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo param1PlaybackInfo) {
            this.a.b(param1PlaybackInfo.getPlaybackType(), e.c.b(param1PlaybackInfo), param1PlaybackInfo.getVolumeControl(), param1PlaybackInfo.getMaxVolume(), param1PlaybackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle param1Bundle) {
            MediaSessionCompat.a(param1Bundle);
            this.a.q0(param1Bundle);
        }

        public void onMetadataChanged(MediaMetadata param1MediaMetadata) {
            this.a.a(param1MediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState param1PlaybackState) {
            this.a.c(param1PlaybackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> param1List) {
            this.a.u0(param1List);
        }

        public void onQueueTitleChanged(CharSequence param1CharSequence) {
            this.a.e0(param1CharSequence);
        }

        public void onSessionDestroyed() {
            this.a.g0();
        }

        public void onSessionEvent(String param1String, Bundle param1Bundle) {
            MediaSessionCompat.a(param1Bundle);
            this.a.d(param1String, param1Bundle);
        }
    }

    public static class c {
        public static AudioAttributes a(Object param1Object) {
            return ((MediaController.PlaybackInfo)param1Object).getAudioAttributes();
        }

        public static int b(Object param1Object) {
            return c(a(param1Object));
        }

        private static int c(AudioAttributes param1AudioAttributes) {
            if ((param1AudioAttributes.getFlags() & 0x1) == 1)
                return 7;
            if ((param1AudioAttributes.getFlags() & 0x4) == 4)
                return 6;
            int i = param1AudioAttributes.getUsage();
            if (i != 13) {
                switch (i) {
                    default:
                        return 3;
                    case 6:
                        return 2;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return 5;
                    case 4:
                        return 4;
                    case 3:
                        return 8;
                    case 2:
                        break;
                }
                return 0;
            }
            return 1;
        }
    }
}
