package com.aszm.crm.module;

import com.aszm.crm.common.view.CustomProgressDialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;

public class BaseActivity extends Activity {

	private CustomProgressDialog progressDialog;

	/**
	 * 时间较短 Tost
	 * 
	 * @param pMsg
	 *            Tost 内容
	 */
	protected void showShortToast(String pMsg) {
		Toast.makeText(this, pMsg, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 时间较长 Tost
	 * 
	 * @param pMsg
	 *            Tost 内容
	 */
	protected void showLongToast(String pMsg) {
		Toast.makeText(this, pMsg, Toast.LENGTH_LONG).show();
	}

	// 定义一个显示消息的对话框
	public void showDialog(String msg, String title) {
		// 创建一个AlertDialog.Builder对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this).setMessage(
				msg).setTitle(title);
		builder.setPositiveButton("确定", null);
		builder.create().show();
	}

	/**
	 * @author sunglasses
	 * @param tip
	 *            加载提示信息
	 */
	public void showLoadingDialog(String tip) {

		if (progressDialog == null) {
			progressDialog = CustomProgressDialog.createDialog(this);
			if (tip != null) {
				progressDialog.setMessage(tip);
			} else {
				progressDialog.setMessage("正在加载...");
			}
		}
		progressDialog.show();
	}

	public void dismissLoadingDialog() {
		if (progressDialog != null) {
			progressDialog.dismiss();
			progressDialog = null;
		}
	}
}
