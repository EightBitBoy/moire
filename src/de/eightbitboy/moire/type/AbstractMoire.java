package de.eightbitboy.moire.type;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public abstract class AbstractMoire extends ImageView {

	public AbstractMoire(Context context) {
		super(context);
		initialize();
	}

	public AbstractMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize();
	}

	public abstract void initialize();
}