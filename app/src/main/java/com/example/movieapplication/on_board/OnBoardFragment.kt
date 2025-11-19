package com.example.movieapplication.on_board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.movieapplication.R
import com.example.movieapplication.data.model.OnBoardModel
import com.example.movieapplication.databinding.FragmentOnBoardBinding
import com.example.movieapplication.on_board.adpter.OnBoardAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    private lateinit var adapter: OnBoardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OnBoardAdapter(getOnBoardList(), ::onClickStart, ::onSkip)

        binding.vpNotes.adapter= adapter

        binding.wormDotsIndicator.attachTo(binding.vpNotes)

    }
    private fun onClickStart(){
        findNavController().navigate(R.id.mainFragment)
    }

    private fun onSkip(position:Int){
        binding.vpNotes.currentItem = position+1
    }

    fun getOnBoardList():List<OnBoardModel>{
        return listOf(
            OnBoardModel(
                theme ="Удобство",
                desc = "Создавайте заметки в два клика! Записывайте мысли, идеи и важные задачи мгновенно.",
                "onboard1.json"
            ),
            OnBoardModel(
                theme ="Организация",
                desc = "Организуйте заметки по папкам и тегам. Легко находите нужную информацию в любое время.",
                 "onboard2.json"
            ),
            OnBoardModel(
                theme ="Синхронизация",
                desc = "Синхронизация на всех устройствах. Доступ к записям в любое время и в любом месте.",
                "onboard3.json"
            )
        )
    }
}