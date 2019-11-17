package io.swagger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import io.swagger.model.Graphic;
import io.swagger.model.Magnitude;

@Service("GraphicService")
public class GraphicServiceImpl implements GraphicService {

    private static List<Graphic> graphics;
    static {
        graphics = new ArrayList<>();
    }

    @Override
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

	@Override
	public boolean check(Graphic graphic) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByMagnitude(Magnitude magnitude) {
		// TODO Auto-generated method stub

	}

	@Override
	public void generate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generatePdf() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generatePng() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub

	}

}
