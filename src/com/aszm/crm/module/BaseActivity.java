package com.aszm.crm.module;

import com.aszm.crm.common.view.CustomProgressDialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;

public class BaseActivity extends Activity {

	private CustomProgressDialog progressDialog;

	/**
	 * ʱ��϶� Tost
	 * 
	 * @param pMsg
	 *            Tost ����
	 */
	protected void showShortToast(String pMsg) {
		Toast.makeText(this, pMsg, Toast.LENGTH_SHORT).show();
	}

	/**
	 * ʱ��ϳ� Tost
	 * 
	 * @param pMsg
	 *            Tost ����
	 */
	protected void showLongToast(String pMsg) {
		Toast.makeText(this, pMsg, Toast.LENGTH_LONG).show();
	}

	// ����һ����ʾ��Ϣ�ĶԻ���
	public void showDialog(String msg, String title) {
		// ����һ��AlertDialog.Builder����
		AlertDialog.Builder builder = new AlertDialog.Builder(this).setMessage(
				msg).setTitle(title);
		builder.setPositiveButton("ȷ��", null);
		builder.create().show();
	}

	/**
	 * @author sunglasses
	 * @param tip
	 *            ������ʾ��Ϣ
	 */
	public void showLoadingDialog(String tip) {

		if (progressDialog == null) {
			progressDialog = CustomProgressDialog.createDialog(this);
			if (tip != null) {
				progressDialog.setMessage(tip);
			} else {
				progressDialog.setMessage("���ڼ���...");
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
