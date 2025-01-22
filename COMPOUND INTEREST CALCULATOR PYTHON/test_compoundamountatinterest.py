from unittest import TestCase

import compoundinterestcalculator
import totalperiodcalculator
import interestatlowerbound
import interestatupperbound
import lowerboundcompoundamount
import compoundamountatinterest
import upperboundcompoundamount


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


    def test_that_compoundinterestcalculator_returns_correct_interest_for_lower_bound(self):
        actual = interestatlowerbound.get_interestatlowerbound(4.0, 12)
        expected = 0.0033333333333333335
        self.assertEqual(actual, expected)

    
    def test_that_compoundinterestcalculator_returns_correct_interest_for_upper_bound(self):
        actual = interestatupperbound.get_interestatupperbound(6.0, 12)
        expected = 0.005
        self.assertEqual(actual, expected)


    def test_that_compoundinterestcalculator_returns_correct_compound_amount_at_lower_interest(self):
        actual = lowerboundcompoundamount.get_lowerboundcompoundamount(10000.0, 500.0, 4.0, 12, 10)
        expected = 88778.64552812935
        self.assertEqual(actual, expected)


    def test_that_compoundinterestcalculator_returns_correct_compound_amount_at_mid_interest(self):
        actual = compoundamountatinterest.get_compoundamountatinterest(10000.0, 500.0, 5.0, 12, 10)
        expected = 94434.73944858181
        self.assertEqual(actual, expected)




    def test_that_compoundinterestcalculator_returns_correct_compound_amount_at_upper_interest(self):
        actual = upperboundcompoundamount.get_upperboundcompoundamount(10000.0, 500.0, 6.0, 12, 10)
        expected = 100543.33911056978
        self.assertEqual(actual, expected)



    


    
















