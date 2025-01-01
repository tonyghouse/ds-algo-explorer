package com.ghouse.dsalgoexplorer.test;

import dsalgoking.test.DateUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DateUtilTest {

	@Test
	void testDateWithinRange_SameStartDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 12);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_SameEndDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 15);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_BetweenDates() {
		LocalDate givenDate = LocalDate.of(2023, 6, 13);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_SameStartAndEndDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 12);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 12);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}
	@Test
	void testDateWithinRange_BeforeStartDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 11);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_AfterEndDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 16);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

}
