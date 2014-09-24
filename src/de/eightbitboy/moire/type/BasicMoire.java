package de.eightbitboy.moire.type;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public abstract class BasicMoire extends ImageView {

	public BasicMoire(Context context) {
		super(context);
		initialize();
	}

	public BasicMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize();
	}

	public abstract void initialize();
}