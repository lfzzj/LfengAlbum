package com.lf.lfengalbum.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.model.MsgBean;

import java.util.ArrayList;
import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {

    private Context context;
    /**
     * 消息列表数据
     */
    private List<MsgBean> lists;

    /**
     * 标记展开的item
     */
    private int opened = -1;

    public MsgAdapter(Context context) {
        this.context = context;
        lists = new ArrayList<>();
    }

    /**
     * 设置列表数据
     *
     * @param lists
     */
    public void setLists(List<MsgBean> lists) {
        this.lists = lists;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_msg, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.bindView(position, lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvTitle;
        private TextView tvDetails;
        private RelativeLayout rlOperator;
        private RelativeLayout rlDetails;
        private Button btnDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDetails = itemView.findViewById(R.id.tv_details);
            rlOperator = itemView.findViewById(R.id.rl_rxjava_operator);
            rlDetails = itemView.findViewById(R.id.rl_details);
            btnDetails = itemView.findViewById(R.id.btn_details);

            rlOperator.setOnClickListener(this);
            btnDetails.setOnClickListener(this);
        }

        /**
         * 此方法实现列表数据的绑定和item的展开/关闭
         */
        void bindView(int pos, MsgBean bean) {
            tvTitle.setText(bean.title);
            tvDetails.setText(bean.content);

            if (pos == opened) {
                rlDetails.setVisibility(View.VISIBLE);
            } else {
                rlDetails.setVisibility(View.GONE);
            }

        }

        /**
         * item的点击事件
         *
         * @param v
         */
        @Override
        public void onClick(View v) {
            if (v == rlOperator) {
                if (lists.get(getAdapterPosition()).content.equals("")||lists.get(getAdapterPosition()).content==null){
                    return;
                }
                if (opened == getAdapterPosition()) {
                    //当点击的item已经被展开了, 就关闭.
                    opened = -1;
                    notifyItemChanged(getAdapterPosition());
                } else {
                    int oldOpened = opened;
                    opened = getAdapterPosition();
                    notifyItemChanged(oldOpened);
                    notifyItemChanged(opened);
                }
            } else if (v == btnDetails) {
                if (mListener != null) {
                    mListener.onClickListener(getAdapterPosition());
                }
            }
        }
    }

    private OnClickListener mListener;

    public void setOnClickListener(OnClickListener listener) {
        this.mListener = listener;
    }

    public interface OnClickListener {
        void onClickListener(int position);

    }

}
