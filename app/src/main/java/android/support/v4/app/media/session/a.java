package android.support.v4.app.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public interface a extends IInterface {
    void G1(int paramInt);

    void M0(boolean paramBoolean);

    void T4(PlaybackStateCompat paramPlaybackStateCompat);

    void U4(String paramString, Bundle paramBundle);

    void e0(CharSequence paramCharSequence);

    void g0();

    void k4(boolean paramBoolean);

    void l5(ParcelableVolumeInfo paramParcelableVolumeInfo);

    void q0(Bundle paramBundle);

    void r1(MediaMetadataCompat paramMediaMetadataCompat);

    void u0(List<MediaSessionCompat.QueueItem> paramList);

    void x2(int paramInt);

    void z2();

    public static abstract class a extends Binder implements a {
        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public IBinder asBinder() {
            return (IBinder)this;
        }

        public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
            Bundle bundle;
            if (param1Int1 != 1598968902) {
                ParcelableVolumeInfo parcelableVolumeInfo1;
                Bundle bundle1;
                CharSequence charSequence1;
                MediaMetadataCompat mediaMetadataCompat1;
                boolean bool1 = false;
                boolean bool2 = false;
                ParcelableVolumeInfo parcelableVolumeInfo2 = null;
                Bundle bundle2 = null;
                CharSequence charSequence2 = null;
                MediaMetadataCompat mediaMetadataCompat2 = null;
                PlaybackStateCompat playbackStateCompat2 = null;
                Parcel parcel = null;
                switch (param1Int1) {
                    default:
                        return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2);
                    case 13:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        z2();
                        return true;
                    case 12:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        x2(param1Parcel1.readInt());
                        return true;
                    case 11:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (param1Parcel1.readInt() != 0)
                            bool2 = true;
                        k4(bool2);
                        return true;
                    case 10:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        bool2 = bool1;
                        if (param1Parcel1.readInt() != 0)
                            bool2 = true;
                        M0(bool2);
                        return true;
                    case 9:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        G1(param1Parcel1.readInt());
                        return true;
                    case 8:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        param1Parcel2 = parcel;
                        if (param1Parcel1.readInt() != 0)
                            parcelableVolumeInfo1 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(param1Parcel1);
                        l5(parcelableVolumeInfo1);
                        return true;
                    case 7:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcelableVolumeInfo1 = parcelableVolumeInfo2;
                        if (param1Parcel1.readInt() != 0)
                            bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1);
                        q0(bundle1);
                        return true;
                    case 6:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        bundle1 = bundle2;
                        if (param1Parcel1.readInt() != 0)
                            charSequence1 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel1);
                        e0(charSequence1);
                        return true;
                    case 5:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        u0(param1Parcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 4:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        charSequence1 = charSequence2;
                        if (param1Parcel1.readInt() != 0)
                            mediaMetadataCompat1 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(param1Parcel1);
                        r1(mediaMetadataCompat1);
                        return true;
                    case 3:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mediaMetadataCompat1 = mediaMetadataCompat2;
                        if (param1Parcel1.readInt() != 0)
                            playbackStateCompat1 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(param1Parcel1);
                        T4(playbackStateCompat1);
                        return true;
                    case 2:
                        param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        g0();
                        return true;
                    case 1:
                        break;
                }
                param1Parcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String str = param1Parcel1.readString();
                PlaybackStateCompat playbackStateCompat1 = playbackStateCompat2;
                if (param1Parcel1.readInt() != 0)
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1);
                U4(str, bundle);
                return true;
            }
            bundle.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }
}
