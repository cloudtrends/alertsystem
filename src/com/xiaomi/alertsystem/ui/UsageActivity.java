/**
 * All rights Reserved, Designed By NoOps.me
 * Company: XIAOMI.COM
 * @author:    
 *      Xiaodong Pan <panxiaodong@xiaomi.com>
 *      Wei Lai  <laiwei@xiaomi.com
 * @version    V1.0 
 */

package com.xiaomi.alertsystem.ui;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.xiaomi.alertsystem.R;

public class UsageActivity extends BaseActivity {

	private View mBack;
	private TextView mUsageText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usage);
		findViews();
		setListens();
	}

	private void findViews() {
		mBack = findViewById(R.id.goback);
	}

	private void setListens() {
		mBack.setOnClickListener(gobackListener);   
	}

	private OnClickListener gobackListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			UsageActivity.this.finish();
		}
	};
}
