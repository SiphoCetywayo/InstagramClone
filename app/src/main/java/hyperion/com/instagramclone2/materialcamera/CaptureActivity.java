package hyperion.com.instagramclone2.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import hyperion.com.instagramclone2.materialcamera.internal.BaseCaptureActivity;
import hyperion.com.instagramclone2.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
