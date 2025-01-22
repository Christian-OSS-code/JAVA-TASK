from unittest import TestCase

import compoundinterestcalculator
import totalperiodcalculator

class TestCompoundInterestCalculator(TestCase):
    def testthatcompoundinterestcalculatorexists(self):
        compoundinterestcalculator.get_compoundinterestcalculator(5.0, 12)

    def test_that_compoundinterestcalculator_returns_correct_interest_estimate(self):
        actual = compoundinterestcalculator.get_compoundinterestcalculator(5.0, 12)
        expected = 0.004166666666666667
        self.assertEqual(actual, expected)


    def test_that_compoundinterestcalculator_returns_correct_value_for_total_period(self):
        actual = totalperiodcalculator.get_totalperiodcalculator(10.0, 12)
        expected = 120.0
        self.assertEqual(actual, expected)
