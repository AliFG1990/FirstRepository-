package android.support.v4.graphics.drawable;

import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompatParcelizer;
import androidx.versionedparcelable.a;

public final class IconCompatParcelizer extends IconCompatParcelizer {
    public static IconCompat read(a parama) {
        return IconCompatParcelizer.read(parama);
    }

    public static void write(IconCompat paramIconCompat, a parama) {
        IconCompatParcelizer.write(paramIconCompat, parama);
    }
}
