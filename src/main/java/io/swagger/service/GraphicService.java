package io.swagger.service;

import java.util.Date;
import java.util.List;

import io.swagger.model.Graphic;
import io.swagger.model.Magnitude;

public interface GraphicService {

    public boolean check(Graphic graphic);
    public boolean add(Graphic graphic);
    public boolean update(Graphic graphic);
    public Graphic getById(Long id);
    public boolean deleteById(Long id);
    public List<Graphic> findByMagnitude(Magnitude magnitude);
    public Graphic generate(Magnitude magnitude, Date startDate, Date endDate);

    public byte[] generatePdf(Long id);
    public byte[] generatePng(Long id);
    public boolean sendEmail(Long id);

}

