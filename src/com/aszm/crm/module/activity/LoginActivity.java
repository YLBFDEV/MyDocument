package com.aszm.crm.module.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aszm.crm.R;
import com.aszm.crm.module.BaseActivity;

public class LoginActivity extends BaseActivity {
	private EditText e1, e2;
	private Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		findView();
		init();
		ClickListener();

	}

	private void ClickListener() {

	}

	private void init() {

	}

	private void findView() {

	}
}
