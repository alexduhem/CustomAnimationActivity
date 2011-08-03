package com.sakaroz.animationchange;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends Activity {
	private static final int DIALOG_CUSTOM_ANIMATION = 1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onButtonDownUpActivityClick(View view){
    	startActivity(new Intent(this, DownUpActivity.class));
    }
    
    public void onButtonDialogClick(View view){
    	showDialog(DIALOG_CUSTOM_ANIMATION);
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
		case DIALOG_CUSTOM_ANIMATION:
			CustomAlertDialog dialog = new CustomAlertDialog(this);
			dialog.setTitle("Hello custom anim !");
			dialog.setCancelable(true);
			dialog.setMessage("This anim is so sexy... ;)");
			return dialog;
		}
    	return super.onCreateDialog(id);
    }
}