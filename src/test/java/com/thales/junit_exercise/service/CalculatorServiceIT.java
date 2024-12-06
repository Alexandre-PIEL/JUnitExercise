package com.thales.junit_exercise.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.thales.junit_exercise.domain.Calculator;
import com.thales.junit_exercise.domain.model.CalculationModel;
import com.thales.junit_exercise.domain.model.CalculationType;

public class CalculatorServiceIT {

	// Mettre en place des objets réels non mockés
	private final Calculator calculator = new Calculator();
	private final SolutionFormatter formatter = new SolutionFormatterImpl();

	// Initialiser la classe à tester
	private final CalculatorService underTest = new CalculatorServiceImpl(calculator, formatter);

	@Test
	public void calculatorService_shouldCalculateASolution_whenGivenACalculationModel() {
		// GIVEN
		final CalculationModel calculation = new CalculationModel(CalculationType.ADDITION,
				100, 101);
		// WHEN
		final CalculationModel result = underTest.calculate(calculation);

		// THEN
		assertThat(result.getSolution()).isEqualTo(201);
	}
}
