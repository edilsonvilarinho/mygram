package br.com.edilsonvilarinho.mygram.ui.view.main.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.R
import br.com.edilsonvilarinho.mygram.data.model.Story

class StoryRecyclerViewAdapter :
    RecyclerView.Adapter<StoryRecyclerViewAdapter.ViewHolder>() {

    var mStorys = emptyList<Story>()
        set(value) {
            notifyDataSetChanged()
            field = value
        }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username = itemView.findViewById<TextView>(R.id.username)
        val picture = itemView.findViewById<ImageView>(R.id.picture)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.list_item_user_istory, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: Story = mStorys[position]
        val username = holder.username
        username.text = user.username
    }

    override fun getItemCount(): Int {
        return mStorys.size
    }

}