package de.eightbitboy.moire.type;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;

public class CircleMoire extends BasicMoire {

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
		circle.getPaint().setColor(0xff0000ff);
		circle.setBounds(0, 0, width, height);

		circle.draw(canvas);
	}
}