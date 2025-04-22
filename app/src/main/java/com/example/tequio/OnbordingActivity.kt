package com.example.tequio

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tequio.databinding.ActivityOnbordingBinding
import com.example.tequio.utils.FragmentCommunicator


class OnbordingActivity : AppCompatActivity(), FragmentCommunicator {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityOnbordingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnbordingBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    //funcion muestra loader
    override fun showLoader(value: Boolean) {
        binding.loaderContainerView.visibility = if (value) View.VISIBLE else View.GONE
    }
}