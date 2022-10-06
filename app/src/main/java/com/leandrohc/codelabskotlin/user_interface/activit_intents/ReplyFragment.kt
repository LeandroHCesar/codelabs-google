package com.leandrohc.codelabskotlin.user_interface.activit_intents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.leandrohc.codelabskotlin.R
import com.leandrohc.codelabskotlin.databinding.FragmentReplyBinding
import com.leandrohc.codelabskotlin.databinding.FragmentSendBinding
import com.leandrohc.codelabskotlin.util.navTo

class ReplyFragment : Fragment(R.layout.fragment_reply) {

    companion object {
        const val SEND = "SEND"
    }

    private lateinit var binding: FragmentReplyBinding
    private var send: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentReplyBinding.bind(view)
        binding.buttonReply.setOnClickListener {
            val args = Bundle()
            args.putString(SendFragment.REPLY, binding.inputReply.text.toString())
            navTo(R.id.action_replyFragment_to_sendFragment, args)
        }

        // obtem a mensagem enviada pelo fragment
        arguments?.let {
            send = it.getString(SEND, null)
        }

        //exibe a mensagem obtida
        send?.let {
            binding.textMessage.text = it
        }
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar?.hide()

    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity).supportActionBar?.show()
    }
}