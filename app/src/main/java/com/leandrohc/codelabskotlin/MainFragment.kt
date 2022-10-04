package com.leandrohc.codelabskotlin

import android.os.Bundle
import android.view.View
import com.leandrohc.codelabskotlin.databinding.FragmentMainBinding

class MainFragment : androidx.fragment.app.Fragment(R.layout.fragment_main){

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FragmentMainBinding.bind(view)
    }

}