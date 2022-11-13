package com.example.geek_m5_hw2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.geek_m5_hw2.databinding.FragmentFirstBinding
import com.example.geek_m5_hw2.model.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            requestBtn.setOnClickListener {

                App.api.calculate(firstnameEd.text.toString(), secondnameEd.text.toString())
                    .enqueue((object :
                        Callback<LoveModel> {
                        override fun onResponse(
                            call: Call<LoveModel>,
                            response: Response<LoveModel>
                        ) {

                            val bundle = Bundle()
                            bundle.putSerializable("KEY", response.body())
                            findNavController().navigate(R.id.secondFragment,bundle)




                            Log.e("ololo", "onResponse ${response.body()?.percentage}")
                        }

                        override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                            Log.e("ololo", "onFailure: ${t.message}")
                        }

                    }))
            }

        }

//            TODO(LoveModel result = "34"
//                    count = 4
//                    hash = 0
//                    shadow$_klass_ = {Class@1627} "class java.lang.String"
//                    shadow$_monitor_ = 0)
    }
}

