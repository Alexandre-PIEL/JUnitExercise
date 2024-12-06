package com.thales.junit_exercise.service;

import java.util.List;
import java.util.stream.Stream;

import com.thales.junit_exercise.domain.model.CalculationModel;

public interface BatchCalculatorService {
	public List<CalculationModel> batchCalculate(Stream<String> operations);
}
