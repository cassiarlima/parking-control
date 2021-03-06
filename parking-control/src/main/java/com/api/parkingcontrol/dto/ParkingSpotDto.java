package com.api.parkingcontrol.dto;


import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class ParkingSpotDto {
	
	@NotNull
	private String parkingSpotNumber;
	
	@NotNull
	@Size(max = 7)
	private String licenseCar;
	
	@NotNull
	private String brandCar;
	
	@NotNull
	private String modelCar;
	
	@NotNull
	private String colorCar;
	
	@NotNull
	private String responsibleName;
	
	@NotNull
	private String apartment;
	
	@NotNull
	private String block;

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public String getLicenseCar() {
		return licenseCar;
	}

	public void setLicenseCar(String licenseCar) {
		this.licenseCar = licenseCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
	
	

}
