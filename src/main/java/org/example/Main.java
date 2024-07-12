package org.example;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
//        OkHttpClient client = new OkHttpClient();
//        String url = "https://fakestoreapi.com/products/1";
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        try (Response response = client.newCall(request).execute()) {
//            if (!response.isSuccessful()) System.out.println("something went wrong!!!");
//            System.out.println(response.body().string());
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }

//        creating a retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);
        Todo t = todoService.getTodoById("5").execute().body();
        System.out.println("todo object downloaded is "+ t.toString());
    }
}