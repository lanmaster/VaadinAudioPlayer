package com.vaadin.addon.audio.shared;

import java.util.ArrayList;
import java.util.List;

public class SharedEffect {
	
	public enum EffectName {
		BalanceEffect,
		FilterEffect,
		PitchEffect,
		VolumeEffect
	}
	
	private String id;
	private EffectName name;
	private List<SharedEffectProperty> properties = new ArrayList<SharedEffectProperty>();
	
	public SharedEffect() {
		
	}
	
	public SharedEffect(String id, EffectName name) {
		this.id = id;
		this.name = name;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public EffectName getName() {
		return name;
	}
	
	public void setName(EffectName name) {
		this.name = name;
	}

	public void setProperties(List<SharedEffectProperty> properties) {
		this.properties.clear();
		this.properties.addAll(properties);
	}
	
	public List<SharedEffectProperty> getProperties() {
		return properties;
	}
	
}
