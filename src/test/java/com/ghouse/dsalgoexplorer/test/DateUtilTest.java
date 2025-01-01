package com.ghouse.dsalgoexplorer.test;

import dsalgoexplorer.test.TestExplorerTwo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TestExplorerTwoTest {

	@Test
	void testDateWithinRange_StartDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 12);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 15);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_EndDate() {
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

	@Test
	void testDateWithinRange_SameStartAndEndDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 12);

		LocalDate startDate = LocalDate.of(2023, 6, 12);
		LocalDate endDate = LocalDate.of(2023, 6, 12);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testDateWithinRange_StartDateAfterEndDate() {
		LocalDate givenDate = LocalDate.of(2023, 6, 12);

		LocalDate startDate = LocalDate.of(2023, 6, 15);
		LocalDate endDate = LocalDate.of(2023, 6, 12);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateMatchesStartDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 1);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateMatchesEndDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 10);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateWithinRange() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 5);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateBeforeStartDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2022, 12, 31);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateAfterEndDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 11);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateDayAfterStartDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 2);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testGivenDateDayBeforeEndDate() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 10);
		LocalDate givenDate = LocalDate.of(2023, 1, 9);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testStartDateEqualsEndDateAndGivenDateMatches() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 1);
		LocalDate givenDate = LocalDate.of(2023, 1, 1);
		assertTrue(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}

	@Test
	void testStartDateEqualsEndDateAndGivenDateDifferent() {
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 1);
		LocalDate givenDate = LocalDate.of(2023, 1, 2);
		assertFalse(DateUtil.isDateWithinRange(givenDate, startDate, endDate));
	}
}
