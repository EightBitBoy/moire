package de.eightbitboy.moire.type;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;

public class CircleMoire extends BasicMoire {

	public static int SPACE = 7;
	public static int OFFSET = 30;

	public CircleMoire(Context context) {
		super(context);
	}

	public CircleMoire(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		int width = canvas.getWidth();
		int height = canvas.getHeight();

		ShapeDrawable circle = new ShapeDrawable(new OvalShape());
		circle.getPaint().setAntiAlias(true);
		circle.getPaint().setStyle(Style.STROKE);
		circle.getPaint().setStrokeWidth(0);
		circle.getPaint().setColor(0xff0000ff);

		for (int i = 0; i < width; i += SPACE) {
			circle.setBounds(0 + i, 0 + i, width - i, height - i);
			circle.draw(canvas);
		}

		for (int i = 0; i < width; i += SPACE) {
			circle.setBounds(0 + i, 0 + OFFSET + i, width - i, height + OFFSET - i);
			circle.draw(canvas);
		}
	}
}