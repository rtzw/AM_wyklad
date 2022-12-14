// Generated by view binder compiler. Do not edit!
package com.example.am_wyklad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.am_wyklad.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddParticipantsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addParticipant;

  @NonNull
  public final Button backButton;

  @NonNull
  public final RecyclerView recycleViewParticipants;

  private FragmentAddParticipantsBinding(@NonNull LinearLayout rootView,
      @NonNull Button addParticipant, @NonNull Button backButton,
      @NonNull RecyclerView recycleViewParticipants) {
    this.rootView = rootView;
    this.addParticipant = addParticipant;
    this.backButton = backButton;
    this.recycleViewParticipants = recycleViewParticipants;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddParticipantsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddParticipantsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_participants, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddParticipantsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addParticipant;
      Button addParticipant = ViewBindings.findChildViewById(rootView, id);
      if (addParticipant == null) {
        break missingId;
      }

      id = R.id.backButton;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.recycleViewParticipants;
      RecyclerView recycleViewParticipants = ViewBindings.findChildViewById(rootView, id);
      if (recycleViewParticipants == null) {
        break missingId;
      }

      return new FragmentAddParticipantsBinding((LinearLayout) rootView, addParticipant, backButton,
          recycleViewParticipants);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
