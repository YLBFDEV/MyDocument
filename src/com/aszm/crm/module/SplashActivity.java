package com.aszm.crm.module;

import com.aszm.crm.R;
import com.aszm.crm.R.anim;
import com.aszm.crm.R.id;
import com.aszm.crm.R.layout;
import com.aszm.crm.module.activity.LoginActivity;
import com.aszm.crm.module.activity.SimpActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends Activity {
	private TextView fullscreen_content;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		findView();
		init();
	}

	private void findView() {
		fullscreen_content = (TextView) findViewById(R.id.fullscreen_content);
	}

	private void init() {
		AnimationSet animationSet = new AnimationSet(true);
		Animation animation = AnimationUtils.loadAnimation(this,
				R.anim.scale_demo);
		AnimationListeners(animation);
		fullscreen_content.startAnimation(animation);
	}

	private void AnimationListeners(Animation animation) {
		animation.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				startMainActivity();
			}
		});
	}

	protected void startMainActivity() {
		Intent mainIntent = new Intent(SplashActivity.this, LoginActivity.class);
		startActivity(mainIntent);
		finish();
	}

}
