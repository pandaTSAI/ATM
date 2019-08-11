package com.example.atm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//TODO 2
//Adapter類別專門管理資料的來源跟展示
    public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.FunctionViewHolder>{
        private final String[] functions;
        Context context;

        public FunctionAdapter(Context context){
            this.context = context;
            functions = context.getResources().getStringArray(R.array.functions);
        }
        @NonNull
        @Override
        //產生ViewHolder
        public FunctionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(
                    android.R.layout.simple_list_item_1, parent, false);
            return new FunctionViewHolder(view);
        }
        //設定資料
        @Override
        public void onBindViewHolder(@NonNull FunctionViewHolder holder, int position) {
            holder.nameText.setText(functions[position]);
        }
        //提供筆數資料
        @Override
        public int getItemCount() {
            return functions.length;
        }
    //TODO 2

    //TODO 1
        //ViewHolder類別設計
        //ViewHolder專門儲存一列資料裡面的內容
        public class FunctionViewHolder extends RecyclerView.ViewHolder{
            TextView nameText;
            public FunctionViewHolder(@NonNull View itemView) {
                super(itemView);
                nameText = itemView.findViewById(android.R.id.text1);
            }
        }
    //TODO 1
    }
