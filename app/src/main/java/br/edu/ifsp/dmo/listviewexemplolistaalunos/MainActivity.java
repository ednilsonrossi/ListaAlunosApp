package br.edu.ifsp.dmo.listviewexemplolistaalunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Aluno> alunos;
    private ListView listView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        listView = findViewById(R.id.listview);

        AlunoAdapter adapter = new AlunoAdapter(this, alunos);
        listView.setAdapter(adapter);
    }
    
    private void load(){
        alunos = new ArrayList<>();
        alunos.add(new Aluno(123, "Rafael", "DMO"));
        alunos.add(new Aluno(234, "Edilson", "EDA"));
        alunos.add(new Aluno(345, "Daniel", "PRS"));
        alunos.add(new Aluno(456, "Amanda", "PRS"));
        alunos.add(new Aluno(567, "Tais", "LPE"));
        alunos.add(new Aluno(678, "Isabela", "DMO"));
        alunos.add(new Aluno(789, "Leonardo", "EDA"));
        alunos.add(new Aluno(890, "Cecilia", "DMO"));
        alunos.add(new Aluno(901, "Eduardo", "DMO"));
    }
}