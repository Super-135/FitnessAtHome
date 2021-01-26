package com.superlip.fitnessathome.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.superlip.fitnessathome.HomeElement;
import com.superlip.fitnessathome.R;

import java.util.ArrayList;

// Адаптер
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<HomeElement> homeElements;
    // Передаем в конструктор источник данных
    // В нашем случае это массив, но может быть и запросом к БД
    public HomeAdapter(ArrayList<HomeElement> homeElements) {
        this.homeElements = homeElements;
    }

    // Создать новый элемент пользовательского интерфейса
    // Запускается менеджером
    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Создаем новый элемент пользовательского интерфейса
        // Через Inflater
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_board_honor, viewGroup, false);
        // Здесь можно установить всякие параметры
        return new ViewHolder(v);
    }

    // Заменить данные в пользовательском интерфейсе
    // Вызывается менеджером
    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder viewHolder, int i) {
        // Получить элемент из источника данных (БД, интернет...)
        // Вынести на экран используя ViewHolder

        viewHolder.tvTitle.setText(homeElements.get(i).getNameElement());
        viewHolder.tv_min.setText(String.valueOf(homeElements.get(i).getMin()));
        viewHolder.tv_max.setText(String.valueOf(homeElements.get(i).getMax()));
        viewHolder.tv_current_value.setText(String.valueOf(homeElements.get(i).getCurrentValue()));
        viewHolder.seekBar_progress.setProgress(homeElements.get(i).getCurrentValue());
        // Пока работает только один отжимания.
        //viewHolder.tv_current_value.setText(String.valueOf(homeElements.get(i).getWeight()));

    }

    // Вернуть размер данных, вызывается менеджером
    @Override
    public int getItemCount() {
        return homeElements == null ? 0 : homeElements.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTitle;
        private TextView tv_min;
        private TextView tv_max;
        private TextView tv_current_value;
        private SeekBar seekBar_progress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tv_min = itemView.findViewById(R.id.tv_min);
            tv_max = itemView.findViewById(R.id.tv_max);
            tv_current_value = itemView.findViewById(R.id.tv_current_value);
            seekBar_progress = itemView.findViewById(R.id.seekBar_progress);
        }
    }
}
