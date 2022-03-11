package com.alexaded.easylang_20.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexaded.easylang_20.ClickLang
import com.alexaded.easylang_20.R
import com.alexaded.easylang_20.models.SelectedLangModel
import kotlinx.android.synthetic.main.item_translate_to.view.*

open class SelectedLangAdapter(private val context: Context, private val onClickLanguage: ClickLang, private val languages : ArrayList<SelectedLangModel>) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_translate_to,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is MyViewHolder) {
            holder.itemView.tv_language_name.text = languages[position].langName
            holder.itemView.setOnClickListener {
                onClickLanguage.onSelectedLanguageClicked(languages[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return languages.size
    }

    private class MyViewHolder(view: View): RecyclerView.ViewHolder(view)
}
