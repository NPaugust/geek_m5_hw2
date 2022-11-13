package com.example.geek_m5_hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.geek_m5_hw2.databinding.FragmentSecondBinding
import com.example.geek_m5_hw2.model.LoveModel


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loveModel = arguments?.getSerializable("KEY") as LoveModel
        binding.tv1.text = loveModel.fname
        binding.tv2.text = loveModel.sname
        binding.tv3.text = loveModel.percentage
        binding.tv4.text = loveModel.result

        binding.resultTv.setOnClickListener{
            findNavController().navigateUp()
        }
    }

}