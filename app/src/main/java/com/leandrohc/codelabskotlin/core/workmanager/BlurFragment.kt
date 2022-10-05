package com.leandrohc.codelabskotlin.core.workmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leandrohc.codelabskotlin.R

class BlurFragment : Fragment(R.layout.fragment_blur) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blur, container, false)
    }
}