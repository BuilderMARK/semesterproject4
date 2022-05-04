package View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.semesterproject4.R;

import ViewModel.MainActivityVM;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainActivityVM viewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);
        displayData();

        Button refresh = findViewById(R.id.button);
        refresh.setOnClickListener(this);
    }

    private void displayData(){
        TextView data = findViewById(R.id.temperatureDisplay);
        data.setText(""+viewModel.getData());
    }

    private void genData(){
        viewModel.genData();
        displayData();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                genData();
        }
    }
}