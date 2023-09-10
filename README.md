# ListaAlunosApp

Aplicativo desenvolvido com objetivo pedagógico para apresentação do Listview. Apresentado aos estudantes do IFSP Campus Araraquara.

## Considerações

O aplicativo implementa uma classe Aluno e popula um List com vários alunos. Criou-se um layout personalizado para a apresentação dos dados. Contudo salienta-se que é desaconselhado o uso de Listview com layout personalizado devido a quantidade de chamadas ao método findViewById() que é realizado na classe AlunoAdapter. O uso dessa técnica há perda de performance do app. As alternativas viáveis são: 1) uso do padrão ViewHolder; 2) utilização do elemento RecyclerView. 

## Autor
Ednilson Geraldo Rossi

(linktr.ee/ednilsonrossi)[https://linktr.ee/ednilsonrossi]
