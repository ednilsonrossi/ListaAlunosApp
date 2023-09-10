package br.edu.ifsp.dmo.listviewexemplolistaalunos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlunoAdapter extends ArrayAdapter<Aluno> {

    public AlunoAdapter(@NonNull Context context, @NonNull List<Aluno> objects) {
        super(context, R.layout.aluno_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.aluno_item, null);
        }
        Aluno aluno = getItem(position);
        ((TextView)convertView.findViewById(R.id.text_nome)).setText(aluno.getNome());
        ((TextView)convertView.findViewById(R.id.text_prontuario)).setText(String.valueOf(aluno.getProntuario()) );
        ((TextView)convertView.findViewById(R.id.text_curso)).setText(aluno.getCurso());

        return convertView;
    }
}
