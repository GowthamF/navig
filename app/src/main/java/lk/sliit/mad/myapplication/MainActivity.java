package lk.sliit.mad.myapplication;


import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    ImageView drawingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //lifttoauditorium();
        //lifttolibrary();
        //lifttomscroom();
       //lifttomultimedia();
        //lifttohallone();
       //lifttodccnlab();
       //lifttoStaffroom();
       //lifttoWashroom();
       //lifttocommomroom();



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

    public void lifttomultimedia()
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
        p.moveTo(220,330);
        p.lineTo(220,730);
        p.moveTo(220,730);
        p.lineTo(300,730);
        p.moveTo(300,730);
        p.lineTo(300,820);
        p.moveTo(220,330);
        p.lineTo(190,330);
        canvas.drawPath(p, paint);
    }

    public void lifttohallone()
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
        p.moveTo(220,520);
        p.lineTo(220,730);
        p.moveTo(220,730);
        p.lineTo(300,730);
        p.moveTo(300,730);
        p.lineTo(300,820);
        p.moveTo(220,520);
        p.lineTo(240,520);

        canvas.drawPath(p, paint);
    }

    public void lifttodccnlab()
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

        p.moveTo(300,700);
        p.lineTo(380,700);
        p.moveTo(300,700);
        p.lineTo(300,820);


        canvas.drawPath(p, paint);
    }

    public void lifttoStaffroom()
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


        p.moveTo(330,770);
        p.lineTo(330,820);

        p.moveTo(330,770);
        p.lineTo(490,770);

        p.moveTo(490,770);
        p.lineTo(490,1150);

        p.moveTo(490,1150);
        p.lineTo(510,1150);


        canvas.drawPath(p, paint);
    }

    public void lifttoWashroom()
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


        p.moveTo(330,770);
        p.lineTo(330,820);

        p.moveTo(330,770);
        p.lineTo(490,770);

        p.moveTo(490,770);
        p.lineTo(490,940);

        p.moveTo(490,940);
        p.lineTo(620,940);



        canvas.drawPath(p, paint);
    }

    public void lifttocommomroom()
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


        p.moveTo(330,770);
        p.lineTo(330,820);

        p.moveTo(330,770);
        p.lineTo(480,770);

        p.moveTo(480,770);
        p.lineTo(480,910);

        p.moveTo(480,910);
        p.lineTo(650,910);




        canvas.drawPath(p, paint);
    }




}






