package com.example.fragment_to_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentTwo : Fragment() {

//    var outPutTextView:TextView?=null
    var inputText: String?=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View =  inflater.inflate(R.layout.fragment_two, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var outPutTextView = view?.findViewById<TextView>(R.id.outPutTextView)
        inputText = arguments?.getString("inputText")
        outPutTextView?.text = inputText
    }

}