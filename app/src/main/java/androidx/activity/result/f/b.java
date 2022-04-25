package androidx.activity.result.f;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a<String[], Map<String, Boolean>> {
    public Map<String, Boolean> b(int paramInt, Intent paramIntent) {
        if (paramInt != -1)
            return Collections.emptyMap();
        if (paramIntent == null)
            return Collections.emptyMap();
        String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (arrayOfInt == null || arrayOfString == null)
            return Collections.emptyMap();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        int i = arrayOfString.length;
        for (paramInt = 0; paramInt < i; paramInt++) {
            boolean bool;
            String str = arrayOfString[paramInt];
            if (arrayOfInt[paramInt] == 0) {
                bool = true;
            } else {
                bool = false;
            }
            hashMap.put(str, Boolean.valueOf(bool));
        }
        return (Map)hashMap;
    }
}
