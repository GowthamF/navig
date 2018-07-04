package lk.sliit.mad.myapplication;


import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView drawingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //lifttoauditorium();
        //lifttolibrary();
        lifttomscroom();



    }

    public void lifttoauditorium()
    {
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);

        // Path

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // paint.setColor(Color.BLACK);
        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
        paint.setStrokeWidth(5);
        Path p = new Path();
        p.moveTo(220,270);
        p.lineTo(220,730);
        p.moveTo(220,730);
        p.lineTo(300,730);
        p.moveTo(300,730);
        p.lineTo(300,820);
        canvas.drawPath(p, paint);
    }

    public void lifttolibrary()
    {
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);

        // Path

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // paint.setColor(Color.BLACK);
        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
        paint.setStrokeWidth(5);
        Path p = new Path();

        p.moveTo(300,730);
        p.lineTo(300,820);
        p.moveTo(300,730);
        p.lineTo(190,730);
        canvas.drawPath(p, paint);
    }
    public void lifttomscroom()
    {
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);

        // Path

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // paint.setColor(Color.BLACK);
        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
        paint.setStrokeWidth(5);
        Path p = new Path();
        p.moveTo(220,500);
        p.lineTo(220,730);
        p.moveTo(220,500);
        p.lineTo(190,500);
        p.moveTo(220,730);
        p.lineTo(300,730);
        p.moveTo(300,730);
        p.lineTo(300,820);

        canvas.drawPath(p, paint);
    }


    }






