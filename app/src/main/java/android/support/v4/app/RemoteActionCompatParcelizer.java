package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.core.app.RemoteActionCompatParcelizer;
import androidx.versionedparcelable.a;

public final class RemoteActionCompatParcelizer extends RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a parama) {
        return RemoteActionCompatParcelizer.read(parama);
    }

    public static void write(RemoteActionCompat paramRemoteActionCompat, a parama) {
        RemoteActionCompatParcelizer.write(paramRemoteActionCompat, parama);
    }
}
