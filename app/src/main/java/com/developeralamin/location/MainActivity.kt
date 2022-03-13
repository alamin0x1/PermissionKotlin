package com.developeralamin.location

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var premissions = arrayOf("android.permission.WRITE_EXTERNAL_STORAGE",
        "android.permission.CALL_PHONE",
        "android.permission.CAMERA", "android.permission.SEND_SMS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(premissions, 80);

        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 80) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            } else {

            }
        }
    }
}