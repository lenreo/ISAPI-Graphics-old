package io.swagger.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import io.swagger.model.Graphic;
import io.swagger.model.Magnitude;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service("GraphicService")
public class GraphicServiceImpl implements GraphicService {

    private static final Logger log = LoggerFactory.getLogger(GraphicServiceImpl.class);

    private static Map<Long, Graphic> graphics;
    static {
        log.info("Init static");
        graphics = new HashMap<>();

        Graphic graphic = new Graphic();
        graphic.setId(1L);
        graphic.setMagnitude(Magnitude.BPM);
        graphic.setData("{}");
        graphic.setStartDate(LocalDateTime.now());
        graphic.setEndDate(LocalDateTime.now());

        graphics.put(graphic.getId(), graphic);
    }

    @Override
    public boolean add(Graphic graphic) {
        log.info("add: " + graphic.toString());
        graphics.put(graphic.getId(), graphic);
        return true;
    }

	@Override
	public boolean check(Graphic graphic) {
        log.info("check: " + graphic.toString());
		return (null != graphic.getData() && !graphic.getData().isEmpty());
	}

	@Override
	public boolean update(Graphic graphic) {
        log.info("update: " + graphic.toString());
        boolean result = false;
        if (graphics.containsKey(graphic.getId())) {
            result = add(graphic);
        }
        return result;
	}

	@Override
	public Graphic getById(Long id) {
        log.info("getById: " + id);
        return graphics.get(id);
	}

	@Override
	public boolean deleteById(Long id) {
        log.info("deteleById: " + id);
        boolean result = false;
        if (graphics.containsKey(id)) {
            result = (graphics.remove(id) != null);
        }
        return result;
	}

	@Override
	public List<Graphic> findByMagnitude(Magnitude magnitude) {
        log.info("findByMagnitude: " + magnitude.toString());
        List<Graphic> listGraphics = new ArrayList<>();

        graphics.forEach((k, v) -> {
            if (magnitude.equals(v.getMagnitude())) {
                listGraphics.add(v);
            }
        });

        return listGraphics;
    }

	@Override
	public Graphic generate(Magnitude magnitude, LocalDateTime startDate, LocalDateTime endDate) {
        log.info("generate: " + magnitude.toString() + " " + startDate + " " + endDate);
        Graphic graphic = new Graphic();

        return graphic;
	}

	@Override
	public byte[] generatePdf(Long id) {
        log.info("generatePdf: " + id);
		return null;
	}

	@Override
	public byte[] generatePng(Long id) {
        log.info("generatePng: " + id);
		return null;
	}

	@Override
	public boolean sendEmail(Long id) {
        log.info("sendEmail: " + id);
		return true;
	}

}
