package com.example.croppersample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.edmodo.cropper.CircleCropImageView;

public class CircularCropActivity extends Activity {

    private CircleCropImageView cropImageView;
    private ImageView resultImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_crop);

        cropImageView = (CircleCropImageView) findViewById(R.id.cropper);
        resultImageView = (ImageView) findViewById(R.id.result);
    }

    public void applyCrop(View view) {
        resultImageView.setImageBitmap(cropImageView.getCroppedImage());
    }

}
