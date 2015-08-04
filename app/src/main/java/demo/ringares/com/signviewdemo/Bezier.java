package demo.ringares.com.signviewdemo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/**
 * Created by ls
 * on 2015/7/30
 * Description
 */
public class Bezier {
    private PointF startPoint;
    private PointF control1;
    private PointF endPoint;


    /** Draws a variable-width Bezier curve. */
    public void draw(Canvas canvas, Paint paint, float startWidth, float endWidth) {
        float originalWidth = paint.getStrokeWidth();
        float widthDelta = endWidth - startWidth;

//        for (int i = 0; i < drawSteps; i++) {
//            // Calculate the Bezier (x, y) coordinate for this step.
//            float t = ((float) i) / drawSteps;
//            float tt = t * t;
//            float ttt = tt * t;
//            float u = 1 - t;
//            float uu = u * u;
//            float uuu = uu * u;
//
//            float x = uuu * startPoint.x;
//            x += 3 * uu * t * control1.x;
//            x += 3 * u * tt * control2.x;
//            x += ttt * endPoint.x;
//
//            float y = uuu * startPoint.y;
//            y += 3 * uu * t * control1.y;
//            y += 3 * u * tt * control2.y;
//            y += ttt * endPoint.y;
//
//            // Set the incremental stroke width and draw.
//            paint.setStrokeWidth(startWidth + ttt * widthDelta);
//            canvas.drawPoint(x, y, paint);
//        }

        paint.setStrokeWidth(originalWidth);
    }

}
