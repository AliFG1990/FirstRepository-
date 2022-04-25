package  android.support.v4.app.media.session;

import android.media.session.MediaSession;

class f {
    public static Object a(Object paramObject) {
        return ((MediaSession.QueueItem)paramObject).getDescription();
    }

    public static long b(Object paramObject) {
        return ((MediaSession.QueueItem)paramObject).getQueueId();
    }
}
