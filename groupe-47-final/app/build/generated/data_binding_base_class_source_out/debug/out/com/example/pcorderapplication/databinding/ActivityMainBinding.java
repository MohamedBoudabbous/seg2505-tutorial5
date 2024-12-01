// Generated by view binder compiler. Do not edit!
package com.example.pcorderapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pcorderapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardEmailInput;

  @NonNull
  public final CardView cardPassword;

  @NonNull
  public final EditText emailInputUnique;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final LinearLayout loginRegisterContainer;

  @NonNull
  public final EditText passwordInputUnique;

  @NonNull
  public final TextView registerTextView;

  @NonNull
  public final TextView roleView;

  @NonNull
  public final ImageView uottawaLogo;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardEmailInput,
      @NonNull CardView cardPassword, @NonNull EditText emailInputUnique,
      @NonNull Button loginButton, @NonNull LinearLayout loginRegisterContainer,
      @NonNull EditText passwordInputUnique, @NonNull TextView registerTextView,
      @NonNull TextView roleView, @NonNull ImageView uottawaLogo) {
    this.rootView = rootView;
    this.cardEmailInput = cardEmailInput;
    this.cardPassword = cardPassword;
    this.emailInputUnique = emailInputUnique;
    this.loginButton = loginButton;
    this.loginRegisterContainer = loginRegisterContainer;
    this.passwordInputUnique = passwordInputUnique;
    this.registerTextView = registerTextView;
    this.roleView = roleView;
    this.uottawaLogo = uottawaLogo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardEmailInput;
      CardView cardEmailInput = ViewBindings.findChildViewById(rootView, id);
      if (cardEmailInput == null) {
        break missingId;
      }

      id = R.id.cardPassword;
      CardView cardPassword = ViewBindings.findChildViewById(rootView, id);
      if (cardPassword == null) {
        break missingId;
      }

      id = R.id.emailInputUnique;
      EditText emailInputUnique = ViewBindings.findChildViewById(rootView, id);
      if (emailInputUnique == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.loginRegisterContainer;
      LinearLayout loginRegisterContainer = ViewBindings.findChildViewById(rootView, id);
      if (loginRegisterContainer == null) {
        break missingId;
      }

      id = R.id.passwordInputUnique;
      EditText passwordInputUnique = ViewBindings.findChildViewById(rootView, id);
      if (passwordInputUnique == null) {
        break missingId;
      }

      id = R.id.registerTextView;
      TextView registerTextView = ViewBindings.findChildViewById(rootView, id);
      if (registerTextView == null) {
        break missingId;
      }

      id = R.id.roleView;
      TextView roleView = ViewBindings.findChildViewById(rootView, id);
      if (roleView == null) {
        break missingId;
      }

      id = R.id.uottawa_logo;
      ImageView uottawaLogo = ViewBindings.findChildViewById(rootView, id);
      if (uottawaLogo == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, cardEmailInput, cardPassword,
          emailInputUnique, loginButton, loginRegisterContainer, passwordInputUnique,
          registerTextView, roleView, uottawaLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}