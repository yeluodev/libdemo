package com.yeluodev.lib.utils;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.yeluodev.lib.R;

public class ToastUtil {

	private static TextView tv;
	private static String oldMsg;
	protected static Toast toast   = null;
	private static long oneTime=0;
	private static long twoTime=0;

	private ToastUtil(){
		throw new AssertionError();
	}

	/**
	 * toast显示字符串
	 * @param context
	 * @param s
     */
	public static void showToast(Context context, String s){
		if(toast==null){
			View toastRoot = LayoutInflater.from(context).inflate(R.layout.layout_toast_default,null);
			toast = new Toast(context);
			toast.setView(toastRoot);
			tv=(TextView)toastRoot.findViewById(R.id.tv_toast);
			tv.setText(s);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
			oneTime= System.currentTimeMillis();
		}else{
			twoTime= System.currentTimeMillis();
			if(s.equals(oldMsg)){
				if(twoTime-oneTime> Toast.LENGTH_SHORT){
					toast.show();
				}
			}else{
				oldMsg = s;
				tv.setText(s);
				toast.show();
			}		
		}
		oneTime=twoTime;
	}

	/**
	 * toast显示id资源
	 * @param context
	 * @param resId
     */
	public static void showToast(Context context, int resId){
		showToast(context, context.getString(resId));
	}

}