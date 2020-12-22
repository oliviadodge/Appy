package com.livy.abhi.appy

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CognitiveDistortions : Fragment() {

    companion object {
        fun newInstance() = CognitiveDistortions()
    }

    private lateinit var viewModel: CognitiveDistortionsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.cognitive_distortions_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CognitiveDistortionsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}