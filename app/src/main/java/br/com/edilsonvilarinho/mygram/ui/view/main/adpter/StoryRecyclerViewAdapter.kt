package br.com.edilsonvilarinho.mygram.ui.view.main.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.R
import br.com.edilsonvilarinho.mygram.data.model.Story
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

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
        val progressBar = itemView.findViewById<ProgressBar>(R.id.progressBar)
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
        val picture = holder.picture
        val progressBar = holder.progressBar
        progressBar.visibility = View.VISIBLE
        Picasso.get()
            .load(user.img)
            .error(R.drawable.ic_round_account_circle)
            .into(picture, object : Callback {
                override fun onSuccess() {
                    progressBar.visibility = View.GONE
                }

                override fun onError(e: Exception?) {
                    progressBar.visibility = View.GONE
                }
            })
    }

    override fun getItemCount(): Int {
        return mStorys.size
    }

}