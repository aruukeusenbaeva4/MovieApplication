package com.example.movieapplication.on_board.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapplication.data.model.OnBoardModel
import com.example.movieapplication.databinding.ItemOnBoardBinding


class OnBoardAdapter(val onBoardList: List<OnBoardModel>, val onStart: () -> Unit, val onSkip: (Int)-> Unit) :
    RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OnBoardViewHolder {
        return OnBoardViewHolder(
            ItemOnBoardBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(
        holder: OnBoardViewHolder,
        position: Int
    ) {
        holder.onBind(onBoardList[position], position)
    }

    override fun getItemCount(): Int {
        return onBoardList.size
    }

    inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(onBoardModel: OnBoardModel, position: Int) {
            binding.apply {
                tvTheme.text = onBoardModel.theme
                tvDesc.text = onBoardModel.desc

                tvSkip.setOnClickListener {
                    onSkip(position)
                }
                btnStart.setOnClickListener {
                    onStart()
            }
                if (position == onBoardList.size - 1) {
                    binding.tvSkip.visibility = View.INVISIBLE
                } else {
                    binding.btnStart.visibility = View.INVISIBLE
                }
            }

        }
    }
}