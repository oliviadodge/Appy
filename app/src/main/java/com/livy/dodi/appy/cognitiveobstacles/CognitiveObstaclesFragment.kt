package com.livy.dodi.appy.cognitiveobstacles

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.livy.dodi.appy.R

class CognitiveObstaclesFragment : Fragment() {

    companion object {
        fun newInstance() = CognitiveObstaclesFragment()
    }

    private lateinit var viewModel: CognitiveObstaclesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.cognitive_obstacles_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CognitiveObstaclesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}