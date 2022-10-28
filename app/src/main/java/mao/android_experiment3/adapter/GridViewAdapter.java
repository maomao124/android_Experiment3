package mao.android_experiment3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mao.android_experiment3.R;
import mao.android_experiment3.entity.GridViewInfo;

/**
 * Project name(项目名称)：android_Experiment3
 * Package(包名): mao.android_experiment3.adapter
 * Class(类名): GridViewAdapter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 10:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class GridViewAdapter extends BaseAdapter
{
    /**
     * 上下文
     */
    private final Context context;

    /**
     * 列表
     */
    private final List<GridViewInfo> list;

    public GridViewAdapter(Context context, List<GridViewInfo> list)
    {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        GridViewHolder gridViewHolder;

        if (convertView == null)
        {
            gridViewHolder = new GridViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_gridview, null);
            gridViewHolder.title = convertView.findViewById(R.id.title);
            gridViewHolder.icon = convertView.findViewById(R.id.icon);
            gridViewHolder.content = convertView.findViewById(R.id.content);
            convertView.setTag(gridViewHolder);
        }
        else
        {
            gridViewHolder = (GridViewHolder) convertView.getTag();
        }
        GridViewInfo gridViewInfo = list.get(position);
        gridViewHolder.title.setText(gridViewInfo.getTitle());
        gridViewHolder.icon.setImageResource(gridViewInfo.getIcon());
        gridViewHolder.content.setText(gridViewInfo.getContent());
        return convertView;
    }


    /**
     * 网格视图持有人
     *
     * @author mao
     */
    private static class GridViewHolder
    {
        /**
         * 标题
         */
        public TextView title;
        /**
         * 图标
         */
        public ImageView icon;
        /**
         * 内容
         */
        public TextView content;
    }
}
