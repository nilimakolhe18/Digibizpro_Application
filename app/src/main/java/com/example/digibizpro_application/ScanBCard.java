package com.example.digibizpro_application;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class ScanBCard extends AppCompatActivity {
    SurfaceView surfaceView;
    TextView txtBarcodeValue;
    ImageView imgclose;
    CameraSource cameraSource;
    private TextView tvScanFormat, tvScanContent;

    private LinearLayout llSearch;

    private BarcodeDetector barcodeDetector;
    private static final int REQUEST_CAMERA_PERMISSION = 201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_b_card);
        surfaceView = findViewById(R.id.surfaceview);

        imgclose = findViewById(R.id.imgclose);
        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        init();


    }

    private void init() {
        barcodeDetector = new BarcodeDetector.Builder(this)
                .setBarcodeFormats(Barcode.ALL_FORMATS)
                .build();

        cameraSource = new CameraSource.Builder(this, barcodeDetector)
                .setRequestedPreviewSize(1920, 1080)
                .setAutoFocusEnabled(true) //you should add this feature
                .build();

        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                try {
                    if (ActivityCompat.checkSelfPermission(ScanBCard.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                        cameraSource.start(surfaceView.getHolder());
                    } else {
                        ActivityCompat.requestPermissions(ScanBCard.this, new
                                String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                cameraSource.stop();
            }
        });


        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {
            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {
                final SparseArray<Barcode> barcodes = detections.getDetectedItems();
                if (barcodes.size() != 0) {


                    txtBarcodeValue.post(new Runnable() {

                        @Override
                        public void run() {

                            if (barcodes.valueAt(0).email != null) {

                            } else {

                            }
                        }
                    });

                }
            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
        cameraSource.release();
    }

    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

}


//        getWindow().setFormat(PixelFormat.UNKNOWN);
//        surfaceView = (SurfaceView)findViewById(R.id.camerapreview);
//        surfaceHolder = surfaceView.getHolder();
//        surfaceHolder.addCallback(this);
//        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
//
//        controlInflater = LayoutInflater.from(getBaseContext());
//        View viewControl = controlInflater.inflate(R.layout.control, null);
//        LinearLayout.LayoutParams layoutParamsControl
//                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
//                LinearLayout.LayoutParams.FILL_PARENT);
//        this.addContentView(viewControl, layoutParamsControl);


//    @Override
//    public void surfaceChanged(SurfaceHolder holder, int format, int width,
//                               int height) {
//// TODO Auto-generated method stub
//        if(previewing){
//            camera.stopPreview();
//            previewing = false;
//        }
//
//        if (camera != null){
//            try {
//                camera.setPreviewDisplay(surfaceHolder);
//                camera.startPreview();
//                previewing = true;
//            } catch (IOException e) {
//// TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Override
//    public void surfaceCreated(SurfaceHolder holder) {
//// TODO Auto-generated method stub
//        camera = camera.open();
//    }
//
//    @Override
//    public void surfaceDestroyed(SurfaceHolder holder) {
//// TODO Auto-generated method stub
//        camera.stopPreview();
//        camera.release();
//        camera = null;
//        previewing = false;
//    }
//}

//        imgclose = findViewById(R.id.imgclose);
//        imgflashlight = findViewById(R.id.imgflashlight);
//        imgcamera = findViewById(R.id.imgcamera);
//        surfaceView = (SurfaceView) findViewById(R.id.surfaceview);
//
//        objCameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
//        try {
//            mCameraId = objCameraManager.getCameraIdList()[0];
//        } catch (CameraAccessException e) {
//            e.printStackTrace();
//        }
//        imgcamera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                init();
//            }
//        });
//        imgclose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
//        imgflashlight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (hasCameraFlash) {
//                    if (imgflashlight.equals(R.drawable.ic_splash_on)) {
//                        //btnFlashLight.setText("FLASHLIGHT OFF");
//                        // btnBlinkFlashLight.setText("BLINK FLASHLIGHT OFF");
//                        flashLightOff();
//                    } else {
//
//                        //  btnBlinkFlashLight.setText("BLINK FLASHLIGHT ON");
//                        //btnFlashLight.setText("FLASHLIGHT ON");
//                        flashLightOn();
//                    }
//                } else {
//                    Toast.makeText(ScanBCard.this, "No flash available on your device",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//
////            private void turnOnLight() {
////                try {
////                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
////                        objCameraManager.setTorchMode(mCameraId, true);
////                        //playOnOffSound();
////                        imgflashlight.setImageResource(R.drawable.ic_splash_on);
////                    }
////                } catch (Exception e) {
////                    e.printStackTrace();
////                }
////            }
//
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            private void flashLightOn() {
//                CameraManager cameraManager = null;
//                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//                    cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
//                }
//
//                try {
//                    String cameraId = null;
//                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//                        cameraId = cameraManager.getCameraIdList()[0];
//                    }
//                    cameraManager.setTorchMode(cameraId, true);
//                } catch (CameraAccessException e) {
//                }
//            }
//
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            private void flashLightOff() {
//                CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
//                try {
//                    String cameraId = cameraManager.getCameraIdList()[0];
//                    cameraManager.setTorchMode(cameraId, false);
//                } catch (CameraAccessException e) {
//                }
//            }
//
//
//        });
//    }
//
//    private void init() {
//        barcodeDetector = new BarcodeDetector.Builder(this)
//                .setBarcodeFormats(Barcode.ALL_FORMATS)
//                .build();
//
//        cameraSource = new CameraSource.Builder(this, barcodeDetector)
//                .setRequestedPreviewSize(1920, 1080)
//                .setAutoFocusEnabled(true) //you should add this feature
//                .build();
//
////        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
////            @Override
////            public void surfaceCreated(SurfaceHolder holder) {
////                try {
////                    if (ActivityCompat.checkSelfPermission(ScanBCard.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
////                        cameraSource.start(surfaceView.getHolder());
////                    } else {
////                        ActivityCompat.requestPermissions(ScanBCard.this, new
////                                String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
////                    }
////
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////
////
////            }
//
////            @Override
////            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
////            }
////
////            @Override
////            public void surfaceDestroyed(SurfaceHolder holder) {
////                cameraSource.stop();
////            }
////        });
////
////
////        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
////            @Override
////            public void release() {
////            }
////
////            @Override
////            public void receiveDetections(Detector.Detections<Barcode> detections) {
////                final SparseArray<Barcode> barcodes = detections.getDetectedItems();
////                if (barcodes.size() != 0) {
////
////
////                    txtBarcodeValue.post(new Runnable() {
////
////                        @Override
////                        public void run() {
////
////                            if (barcodes.valueAt(0).email != null) {
//////                                txtBarcodeValue.removeCallbacks(null);
//////                                intentData = barcodes.valueAt(0).email.address;
//////                                txtBarcodeValue.setText(intentData);
//////                                isEmail = true;
////                                // btnAction.setText("ADD CONTENT TO THE MAIL");
////                            } else {
//////                                isEmail = false;
//////                                btnAction.setText("LAUNCH URL");
//////                                intentData = barcodes.valueAt(0).displayValue;
//////                                txtBarcodeValue.setText(intentData);
////
////                            }
////                        }
////                    });
////
////                }
////            }
////        });
////    }
////
////    @Override
////    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
////        switch (requestCode) {
////            case CAMERA_REQUEST:
////                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
////                    hasCameraFlash = getPackageManager().
////                            hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
////                } else {
////                    // btnFlashLight.setEnabled(false);
////                    //btnBlinkFlashLight.setEnabled(false);
////                    Toast.makeText(
////                            ScanBCard.this, "Permission Denied for the Camera", Toast.LENGTH_SHORT).show();
////                }
////                break;
////        }
////    }
////
////    @Override
////    protected void onPause() {
////        super.onPause();
////        cameraSource.release();
////    }
////
////    @Override
////    protected void onResume() {
////        super.onResume();
////        init();
////    }
//
//    }
//}