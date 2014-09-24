package de.eightbitboy.moire.type;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class CircleMoire extends AbstractMoire {

	public static int SPACE = 20;

	public int offset = 0;

	public CircleMoire(Context context) {
		super(context);
	}

	public CircleMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void initialize() {

	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		int width = canvas.getWidth();
		int height = canvas.getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(0);
		paint.setColor(0xffffffff);

		for (int i = 0; i < width; i += this.SPACE) {
			canvas.drawCircle(centerX, centerY - this.offset, i, paint);
		}

		for (int i = 0; i < width; i += this.SPACE) {
			canvas.drawCircle(centerX, centerY + this.offset, i, paint);
		}
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		Log.d("foo", distanceX + "");
		return super.onScroll(e1, e2, distanceX, distanceY);
	}
}