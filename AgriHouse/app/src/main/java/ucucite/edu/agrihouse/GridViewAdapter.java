package ucucite.edu.agrihouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GridViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public GridViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row_items, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.tvname);
            holder.mDescTv = view.findViewById(R.id.tvDesc);
            holder.mIconIv = view.findViewById(R.id.imageview);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Alugbati")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, alugbati.class);
                    intent.putExtra("actionBarTitle", "Alugbati");
                    intent.putExtra("contentTv", "This is Alugbati detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Ampalaya")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ampalaya.class);
                    intent.putExtra("actionBarTitle", "Ampalaya");
                    intent.putExtra("contentTv", "This is Ampalaya detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Banana")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, banana.class);
                    intent.putExtra("actionBarTitle", "Banana");
                    intent.putExtra("contentTv", "This is Banana detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Cabbage")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cabbage.class);
                    intent.putExtra("actionBarTitle", "Cabbage");
                    intent.putExtra("contentTv", "This is Cabbage detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Calamansi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, calamansi.class);
                    intent.putExtra("actionBarTitle", "Calamansi");
                    intent.putExtra("contentTv", "This is Calamansi detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Carrots")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, carrots.class);
                    intent.putExtra("actionBarTitle", "Carrots");
                    intent.putExtra("contentTv", "This is Carrots detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Celery")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, celery.class);
                    intent.putExtra("actionBarTitle", "Celery");
                    intent.putExtra("contentTv", "This is Celery detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Cocumber")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cocumber.class);
                    intent.putExtra("actionBarTitle", "Cocumber");
                    intent.putExtra("contentTv", "This is Cocumber detail...");
                    mContext.startActivity(intent);
                }
//
                if (modellist.get(postition).getTitle().equals("Corn")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, corn.class);
                    intent.putExtra("actionBarTitle", "Corn");
                    intent.putExtra("contentTv", "This is Corn detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Eggplant")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eggplant.class);
                    intent.putExtra("actionBarTitle", "Eggplant");
                    intent.putExtra("contentTv", "This is Eggplant detail...");
                    mContext.startActivity(intent);
                }
//
                if (modellist.get(postition).getTitle().equals("Ginger")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ginger.class);
                    intent.putExtra("actionBarTitle", "Ginger");
                    intent.putExtra("contentTv", "This is Ginger detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Kangkong")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, kangkong.class);
                    intent.putExtra("actionBarTitle", "Kangkong");
                    intent.putExtra("contentTv", "This is Kangkong detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Lettuce")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, lettuce.class);
                    intent.putExtra("actionBarTitle", "Lettuce");
                    intent.putExtra("contentTv", "This is Lettuce detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Manggo")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, manggo.class);
                    intent.putExtra("actionBarTitle", "Manggo");
                    intent.putExtra("contentTv", "This is Manggo detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Mustasa")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, mustasa.class);
                    intent.putExtra("actionBarTitle", "Mustasa");
                    intent.putExtra("contentTv", "This is Mustasa detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Onion")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, onion.class);
                    intent.putExtra("actionBarTitle", "Onion");
                    intent.putExtra("contentTv", "This is Onion detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Papaya")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, papaya.class);
                    intent.putExtra("actionBarTitle", "Papaya");
                    intent.putExtra("contentTv", "This is Papaya detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Patola")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, patola.class);
                    intent.putExtra("actionBarTitle", "Patola");
                    intent.putExtra("contentTv", "This is Patola detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Rice")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, rice.class);
                    intent.putExtra("actionBarTitle", "Rice");
                    intent.putExtra("contentTv", "This is Rice detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Sigarilyas")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sigarilyas.class);
                    intent.putExtra("actionBarTitle", "Sigarilyas");
                    intent.putExtra("contentTv", "This is Sigarilyas detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Sitaw")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sitaw.class);
                    intent.putExtra("actionBarTitle", "Sitaw");
                    intent.putExtra("contentTv", "This is Sitaw detail...");
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("Upo")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, upo.class);
                    intent.putExtra("actionBarTitle", "Upo");
                    intent.putExtra("contentTv", "This is Upo detail...");
                    mContext.startActivity(intent);
                }


                if (modellist.get(postition).getTitle().equals("Watermelon")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, watermelon.class);
                    intent.putExtra("actionBarTitle", "Watermelon");
                    intent.putExtra("contentTv", "This is Watermelon detail...");
                    mContext.startActivity(intent);
                }

            }
        });

        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model beefModel : arrayList){
                if (beefModel.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(beefModel);
                }
            }
        }
        notifyDataSetChanged();
    }

}

