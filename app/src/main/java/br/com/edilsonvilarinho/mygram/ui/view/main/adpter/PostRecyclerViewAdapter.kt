package br.com.edilsonvilarinho.mygram.ui.view.main.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.edilsonvilarinho.mygram.R
import br.com.edilsonvilarinho.mygram.data.model.Post
import com.facebook.shimmer.ShimmerFrameLayout
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

class PostRecyclerViewAdapter :
    RecyclerView.Adapter<PostRecyclerViewAdapter.ViewHolder>() {

    var mPosts = emptyList<Post>()
        set(value) {
            notifyDataSetChanged()
            field = value
        }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username = itemView.findViewById<TextView>(R.id.username)
        val picture = itemView.findViewById<ImageView>(R.id.picture)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val shimmerLayoutPicturePostImg = itemView.findViewById<ShimmerFrameLayout>(R.id.shimmerLayoutPicturePostImg)
        val shimmerLayoutPicturePostUsername = itemView.findViewById<ShimmerFrameLayout>(R.id.shimmerLayoutPicturePostUsername)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.list_item_post, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post: Post = mPosts[position]
        val username = holder.username
        username.text = post.username
        val picture = holder.picture
        val shimmerLayoutPicturePostUsername = holder.shimmerLayoutPicturePostUsername
        shimmerLayoutPicturePostUsername.visibility = View.VISIBLE
        Picasso.get()
            .load(post.img)
            .error(R.drawable.ic_round_account_circle)
            .into(picture, object : Callback {
                override fun onSuccess() {
                    shimmerLayoutPicturePostUsername.visibility = View.GONE
                }

                override fun onError(e: Exception?) {
                    shimmerLayoutPicturePostUsername.visibility = View.GONE
                }
            })

        val imageView = holder.imageView
        val shimmerLayoutPicturePostImg = holder.shimmerLayoutPicturePostImg
        shimmerLayoutPicturePostImg.visibility = View.VISIBLE
        Picasso.get()
            .load(post.img)
            .error(R.drawable.ic_round_account_circle)
            .into(imageView, object : Callback {
                override fun onSuccess() {
                    shimmerLayoutPicturePostImg.visibility = View.GONE
                }

                override fun onError(e: Exception?) {
                    shimmerLayoutPicturePostImg.visibility = View.GONE
                }
            })
    }

    override fun getItemCount(): Int {
        return mPosts.size
    }

}