package com.example.fragment_to_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FragmentOne : Fragment() {
    private lateinit var communicator: Communicator
//    var btnSend:Button?=null
//    var editText:EditText?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_one, container, false) as ViewGroup
        communicator = activity as Communicator
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btnSend=view?.findViewById<Button>(R.id.btnSend)
        var editText=view?.findViewById<EditText>(R.id.editText)
        btnSend?.setOnClickListener {
            communicator.passData(editText!!.text.toString())
        }
    }
}