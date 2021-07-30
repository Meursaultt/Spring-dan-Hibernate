package com.anggraan.utomo.springdemo.practice.di;

import com.anggraan.utomo.springdemo.FortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService
{
    private String[] data ={"GoodLuck brother", "Tidak ada kata menyerah dalam belajar",
    "Lebih baik mati saat belajar daripada mati dalam kebodohan"};

    private Random randomArray = new Random();

    @Override
    public String getFortune()
    {
        int index = randomArray.nextInt(data.length);
        return data[index];
    }
}
