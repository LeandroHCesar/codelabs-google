package com.leandrohc.codelabskotlin.user_interface.interactive_ui

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.leandrohc.codelabskotlin.R
import com.leandrohc.codelabskotlin.databinding.FragmentInterativeUiBinding

class InteractiveUiFragment : Fragment(R.layout.fragment_interative_ui){

    private lateinit var binding: FragmentInterativeUiBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentInterativeUiBinding.bind(view)
        binding.showCount.text = count.toString()
        binding.buttonToast.setOnClickListener { showToast() }
        binding.buttonCount.setOnClickListener { contUP(); showCounter() }
    }

    private fun showToast() { Toast.makeText(requireContext(), "Hello toast!", Toast.LENGTH_SHORT).show() }

    private fun contUP() = count ++

    private fun showCounter() { binding.showCount.text = count.toString() }
}