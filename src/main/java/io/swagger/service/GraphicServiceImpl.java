package io.swagger.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import io.swagger.model.Graphic;
import io.swagger.model.Magnitude;

@Service("GraphicService")
public class GraphicServiceImpl implements GraphicService {

    private static Map<Long, Graphic> graphics;
    static {
        graphics = new HashMap<>();

        Graphic graphic = new Graphic();
        graphic.setId(1L);
        graphic.setMagnitude(Magnitude.BPM);
        graphic.setData("{}");
        graphic.setStartDate(OffsetDateTime.now());
        graphic.setEndDate(OffsetDateTime.now());
    }

    @Override
    public boolean add(Graphic graphic) {
        graphics.put(graphic.getId(), graphic);
        return true;
    }

	@Override
	public boolean check(Graphic graphic) {
		return (null != graphic.getData() && !graphic.getData().isEmpty());
	}

	@Override
	public boolean update(Graphic graphic) {
        boolean result = false;
        if (graphics.containsKey(graphic.getId())) {
            result = add(graphic);
        }
        return result;
	}

	@Override
	public Graphic getById(Long id) {
        //return graphics.get(id);

                Graphic graphic = new Graphic();
        graphic.setId(1L);
        graphic.setMagnitude(Magnitude.BPM);
        graphic.setData("{}");
        graphic.setStartDate(OffsetDateTime.now());
        graphic.setEndDate(OffsetDateTime.now());


        return graphic;

	}

	@Override
	public boolean deleteById(Long id) {
        boolean result = false;
        if (graphics.containsKey(id)) {
            result = (graphics.remove(id) != null);
        }
        return result;
	}

	@Override
	public List<Graphic> findByMagnitude(Magnitude magnitude) {
        List<Graphic> listGraphics = new ArrayList<>();

        graphics.forEach((k, v) -> {
            if (magnitude.equals(v.getMagnitude())) {
                listGraphics.add(v);
            }
        });

        return listGraphics;
    }

	@Override
	public Graphic generate(Magnitude magnitude, OffsetDateTime startDate, OffsetDateTime endDate) {
        Graphic graphic = new Graphic();

        return graphic;
	}

	@Override
	public byte[] generatePdf(Long id) {
		return null;
	}

	@Override
	public byte[] generatePng(Long id) {
		return null;
	}

	@Override
	public boolean sendEmail(Long id) {
		return true;
	}

}
