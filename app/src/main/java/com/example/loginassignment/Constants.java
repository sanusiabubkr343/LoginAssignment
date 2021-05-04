package com.example.loginassignment;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    List<Model> arrayList  = new ArrayList<>();

    public List<Model> getArrayList() {
        Model model = new Model();
        model.setText("Python");
        model.setTitle("Python");
        model.setImage(R.drawable.python);
        model.setDetails("Python was conceived in the late 1980s by Guido van Rossum at Centrum Wiskunde & Informatica (CWI) in the Netherlands as a successor to ABC programming language, which was inspired by SETL, capable of exception handling and interfacing with the Amoeba operating system. Its implementation began in December 1989.");
        arrayList.add(model);

        Model model1 = new Model();
        model1.setText("Java");
        model1.setTitle("Java");
        model1.setImage(R.drawable.java);
        model1.setDetails("Java Version History The history of Java is very interesting. Java was originally designed for interactive television, but it was too advanced technology for the digital cable television industry at the time. The history of Java starts with the Green Team. Java team members (also known as Green Team)");
        arrayList.add(model1);


        Model model2 = new Model();
        model2.setText("JavaScript");
        model2.setTitle("Javascript");
        model2.setImage(R.drawable.javascript);
        model2.setDetails("JavaScript Until recently, the prevailing view assumed lorem ipsum was born as a nonsense text. “It's not Latin, though it looks like it, and it actually says nothing,” Before & After magazine answered a curious reader, “Its ‘words’ loosely approximate the frequency with which letters occur in English, which is why at a glance it looks pretty real.");
        arrayList.add(model2);

        Model model3 = new Model();
        model3.setText("Kotlin");
        model3.setTitle("Kotlin");
        model3.setImage(R.drawable.kotlin);
        model3.setDetails(" Kotlin ,the prevailing view assumed lorem ipsum was born as a nonsense text. “It's not Latin,  but quickly became known as LiveScript and, later...");
        arrayList.add(model3);

        Model model4 = new Model();
        model4.setText("PHP");
        model4.setTitle("PHP");
        model4.setImage(R.drawable.php);
        model4.setDetails(" Php Until recently, the prevailing view assumed lorem ipsum was born as a nonsense text. “It's not Latin, though it looks like it, and it actually says nothing,” Before & After magazine answered a curious reader, “Its ‘words’ loosely approximate the frequency with which letters occur in English, which is why at a glance it looks pretty real.");
        arrayList.add(model4);

        return arrayList;
    }
}
