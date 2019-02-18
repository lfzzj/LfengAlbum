package com.lf.lfengalbum.util;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class Utils {

	/**
	 * 查找Button、ImageButton并设置单击监听器
	 * @param view
	 * @param listener 监听监听器
	 */
	public static void setButtonOnClickListener(View view, OnClickListener listener) {
		// 遍历view里面所有的Button和ImageButton
		if (view instanceof Button || view instanceof ImageButton) {
			view.setOnClickListener(listener);
		} else if (view instanceof ViewGroup) {
			ViewGroup viewGroup = (ViewGroup) view;
			for (int i = 0; i < viewGroup.getChildCount(); i++) {
				View child = viewGroup.getChildAt(i);
				setButtonOnClickListener(child, listener);
			}
		}
	}

	/**
	 * 在屏幕中间显示一个Toast
	 * @param text
	 */
	public static void showToast(Context context, String text) {
		Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}


}

