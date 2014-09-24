package de.eightbitboy.moire.type;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

public abstract class AbstractMoire extends ImageView implements GestureDetector.OnGestureListener {

	protected GestureDetector gestureDetector;

	public AbstractMoire(Context context) {
		super(context);
		setUp(context);
		initialize();
	}

	public AbstractMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
		setUp(context);
		initialize();
	}

	public abstract void initialize();

	private void setUp(Context context) {
		this.gestureDetector = new GestureDetector(context, this);
	}

	@Override
	public boolean onDown(MotionEvent e) {
		Log.d("foo", "foo");
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		Log.d("foo", "foo");
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		Log.d("foo", "foo");
		return false;
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		Log.d("foo", "foo");
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		Log.d("foo", "foo");
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		Log.d("foo", "foo");
		return false;
	}
}