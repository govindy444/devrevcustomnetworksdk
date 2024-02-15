package com.example.devrevcustomnetworksdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomNetworkSDK.get("https://dummy.restapiexample.com/api/v1/employees", object : NetworkCallback {
            override fun onSuccess(response: String?) {
                // Handle successful response
                println("gggg"+response);
            }

            override fun onError(errorMessage: String?) {
                // Handle error
                println("gggg"+errorMessage);

            }
        })
    }

}