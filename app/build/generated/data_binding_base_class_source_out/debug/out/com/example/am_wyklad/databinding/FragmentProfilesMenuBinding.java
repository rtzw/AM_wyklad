// Generated by view binder compiler. Do not edit!
package com.example.am_wyklad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.am_wyklad.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfilesMenuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button createNewProfile;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final Button yourProfiles;

  private FragmentProfilesMenuBinding(@NonNull LinearLayout rootView,
      @NonNull Button createNewProfile, @NonNull Button logoutButton,
      @NonNull Button yourProfiles) {
    this.rootView = rootView;
    this.createNewProfile = createNewProfile;
    this.logoutButton = logoutButton;
    this.yourProfiles = yourProfiles;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfilesMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfilesMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profiles_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfilesMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createNewProfile;
      Button createNewProfile = ViewBindings.findChildViewById(rootView, id);
      if (createNewProfile == null) {
        break missingId;
      }

      id = R.id.logoutButton;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.yourProfiles;
      Button yourProfiles = ViewBindings.findChildViewById(rootView, id);
      if (yourProfiles == null) {
        break missingId;
      }

      return new FragmentProfilesMenuBinding((LinearLayout) rootView, createNewProfile,
          logoutButton, yourProfiles);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
