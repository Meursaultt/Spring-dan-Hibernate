package com.anggraan.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ExerFileFortuneService implements FortuneService
{
    private String fileName =
            "C:\\Users\\ASUS\\Documents\\Development\\Java\\SpringHibernate\\05SpringConfigurationAnnotationDependencyInjection\\src\\com\\anggraan\\springdemo\\fortune-data.txt";
    private List<String> theFortunes;

    // create a random number generator
    private Random random = new Random();

    public ExerFileFortuneService()
    {
        File file = new File(fileName);
        System.out.println("Reading fortunes from file: " + file.getName());
        System.out.println("File exists: " + file.exists());

        // initialize array list
        theFortunes = new ArrayList<>();

        // read fortunes from file
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String tempLine;
            while ((tempLine = br.readLine()) != null)
            {
                theFortunes.add(tempLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune()
    {
        // pick a random String from the array
        int index = random.nextInt(theFortunes.size());
        return theFortunes.get(index);
    }
}
