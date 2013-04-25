package com.jeavox.voxmusic;

import android.os.Bundle;
import android.app.Activity;
import android.app.WallpaperManager;
import android.view.Menu;
import android.widget.LinearLayout;

public class VoxMusicMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setBackgroundDrawable();
	}
	
	private void setBackgroundDrawable() {
		WallpaperManager wm = WallpaperManager.getInstance(this);
		LinearLayout lyGBG = (LinearLayout) this.findViewById(R.id.gbg);
		lyGBG.setBackgroundDrawable(wm.getDrawable());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
