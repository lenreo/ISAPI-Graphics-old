package io.swagger.service;

import org.springframework.stereotype.Component;

import io.swagger.model.Graphic;
import io.swagger.model.Magnitude;

@Component
public interface GraphicService {

    public boolean check(Graphic graphic);
    public void add(Graphic graphic);
    public void update();
    public void getById(Long id);
    public void deleteById(Long id);
    public void findByMagnitude(Magnitude magnitude);
    public void generate();

    public void generatePdf();
    public void generatePng();
    public void sendEmail();

}

