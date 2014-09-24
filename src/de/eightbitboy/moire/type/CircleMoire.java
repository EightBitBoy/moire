package de.eightbitboy.moire.type;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;

public class CircleMoire extends AbstractMoire {

	private static final int SPACE = 7;
	private static final int OFFSET = 30;

	public CircleMoire(Context context) {
		super(context);
	}

	public CircleMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void initialize() {
		this.setOnDragListener(new OnDragListener() {
			@Override
			public boolean onDrag(View v, DragEvent event) {
				return false;
			}
		});
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

		for (int i = 0; i < width; i += SPACE) {
			canvas.drawCircle(centerX, centerY, i, paint);
		}

	}

	@Override
	public boolean onDragEvent(DragEvent event) {
		return super.onDragEvent(event);
	}
}