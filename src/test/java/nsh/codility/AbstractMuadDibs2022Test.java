package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public abstract class AbstractMuadDibs2022Test {
	abstract MuadDibs2022Interface getTestObject();

	MuadDibs2022Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();
	}

	@Test
	@DisplayName("Sample 1")
	void test01() {
		int[] A = new int[] {1, 2, 4, 5, 7, 29, 30};
		int E = 11;

		assertEquals(E, testObject.solution(A));
	}

	private static Stream<Arguments> testShort() {
		return Stream.of( //
				Arguments.of(2, new int[] {1}), //
				Arguments.of(2, new int[] {2}), //
				Arguments.of(2, new int[] {3}), //
				Arguments.of(2, new int[] {5000}));
	}

	@ParameterizedTest
	@MethodSource
	@DisplayName("Short")
	void testShort(int E, int[] A) {
		assertEquals(E, testObject.solution(A));

	}

	private static Stream<Arguments> test2w() {
		return Stream.of( //
				Arguments.of(14, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}),
				Arguments.of(14, new int[] {1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13}),
				Arguments.of(14, new int[] {1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}),
				Arguments.of(13, new int[] {1, 3, 5, 7, 9, 11, 13}));
	}

	@ParameterizedTest
	@MethodSource
	@DisplayName("2 weeks")
	void test2w(int E, int[] A) {
		assertEquals(E, testObject.solution(A));
	}

	private static Stream<Arguments> test1m() {
		return Stream.of(
				Arguments.of(25,
						new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
								22, 23, 24, 25, 26, 27, 28, 29, 30}),
				Arguments.of(25,
						new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
								23, 24, 25, 26, 27, 28, 29, 30}),
				Arguments.of(25,
						new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
								22, 23, 24, 25, 26, 27, 28, 29}),
				Arguments.of(25, new int[] {1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
						20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}));
	}

	@ParameterizedTest
	@MethodSource
	@DisplayName("1 month")
	void test1m(int E, int[] A) {
		assertEquals(E, testObject.solution(A));
	}

	private static Stream<Arguments> testExtreme() {
		return Stream.of( //
				Arguments.of(4, new int[] {1, 100000}), //
				Arguments.of(8, new int[] {1, 2, 99999, 100000}),
				Arguments.of(12, new int[] {1, 10, 100, 1000, 10000, 100000}),
				Arguments.of(15, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100000}), //
				Arguments.of(15,
						new int[] {1, 10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010}));
	}

	@ParameterizedTest
	@MethodSource
	@DisplayName("extreme")
	void testExtreme(int E, int[] A) {
		assertEquals(E, testObject.solution(A));
	}

	@Test
	void testFibbonaci() {
		int[] A = new int[] {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
		int E = 19;

		assertEquals(E, testObject.solution(A));
	}

	private static Stream<Arguments> testSkip1() {
		return Stream.of(//
				Arguments.of(18, new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}),
				Arguments.of(25, new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29}),
				Arguments.of(25, new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30}));
	}

	@ParameterizedTest
	@MethodSource
	void testSkip1(int E, int[] A) {
		assertEquals(E, testObject.solution(A));
	}


	@Test
	void testSkip2() {
		int[] A = new int[] {1, 4, 7, 10, 13, 16, 19, 22, 25, 28};
		int E = 20;
		assertEquals(E, testObject.solution(A));
	}

	private static Stream<Arguments> testGroupSkip() {
		return Stream.of( //
				Arguments.of(27,
						new int[] {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23,
								25, 26, 27, 28, 29, 30, 31}),
				Arguments.of(34,
						new int[] {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23,
								25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39}),
				Arguments.of(21,
						new int[] {1, 2, 3, 4, 5, 6, 7, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 10000, 10001,
								10002, 10003, 10004, 10005, 10006}),
				Arguments.of(50,
						new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
								22, 23, 24, 25, 26, 27, 28, 29, 30, 101, 102, 103, 104, 105, 106, 107, 108, 109,
								110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126,
								127, 128, 129, 130}));
	}

	@ParameterizedTest
	@MethodSource
	void testGroupSkip(int E, int[] A) {
		assertEquals(E, testObject.solution(A));
	}
}
