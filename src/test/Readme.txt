Handling the Unit test cases:

Boundary Cases : Testing the edge values or limits of input space checking lowest or highest values or special cases like zero and one.
Failure Cases (Negative testing):  Checking for incorrect or invalid inputs which result in error.
Equivalence classes : Set of input that behave similarly . testing these classes reduce redundancy by grouping same input into one set.

In My (slamu) commits and functions:

Boundary cases are :
        PositiveBaseToExponentZero():
        @Test
            @DisplayName("Positive base raised to Exponent Zero")
            void PositiveBaseToExponentZero() {
                int[] exponents = {0, 0, 0};
                int base = 2;
                int[] result = new int[exponents.length];
                for (int i = 0; i < exponents.length; i++) {
                    result[i] = power.toPower(base, exponents[i]);

                }
                int[] expected = {1, 1, 1};
                assertArrayEquals(expected, result);
            }

            Any Positive Number raised to power 0 should return 1 , the exponent is 0,which is a special case.
                so any_number^0 = 1
             This test checks if any positive base rasied to exponent zero always returns one. any number raised to 0 is 1 in maths.this is perfect boundary case example

        NegativeBaseWithZeroExponentShouldReturnOne():

        @Test
            @DisplayName("Negative base with zero exponent should return 1")
            void NegativeBaseWithZeroExponentShouldReturnOne() {
                int[] exponents = {0, 0, 0};
                int base = -10;
                int[] result = new int[exponents.length];
                for (int i = 0; i < exponents.length; i++) {
                    result[i] = power.toPower(base, exponents[i]);
                }
                int[] expected = {1,1,1};
                assertArrayEquals(expected, result);

            }

            Any Negative number raised to power 0 should return 1 , the exponent is 0 , any number raised to 0 is 1 in maths.which is a special case and matches boundary case .
               so -any_number^0 =1

        baseOneRaisesToGreaterPower():
            1 raised to any number should be return one , no matter what the exponent is , so base 1 is a special case here.
                so 1^any number = 1


Failure cases (Negative cases) are :
        NegativeBaseWithNegativeExponentShouldReturnError():

         @Test
            @DisplayName("Negative base with negative exponent should return undefined")
            void NegativeBaseWithNegativeExponentShouldReturnError() {
                int[] exponents = {-3};
                int base = -2;
                int[] result = new int[exponents.length];
                for (int i = 0; i < exponents.length; i++) {
                    result[i] = power.toPower(base, exponents[i]);
                }
                int[] expected = {-1/8};
                assertArrayEquals(expected, result);
            }
            So any negative base with negative exponent should return undefined for integer operations.
                 in our case lets take an example -2^-3 should return -1/8 which is undefined. So this should return either undefiend or error.
                 But in our case the method is designed for only int case and float is not being considered.so it returns one but the actual case is it should return -1/8 so this is considered as a failure case.


        testMainWithValidArgs() :
         @Test
            void testMainWithValidArgs() {
                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outContent));
                String[] args = {"2","2","3", "4", "5"};
                Smell1AlmostBest.main(args);
                String output = outContent.toString();
                assertTrue(output.contains("The 2nd power of 2 is 4"));
                assertTrue(output.contains("The 3rd power of 2 is 8"));
                assertTrue(output.contains("The 4th power of 2 is 16"));
                assertTrue(output.contains("The 5th power of 2 is 32"));
            }

            In this case we are checking the output of the program when exponeents are passed to a base,
            however in the main function it is declared that ( "The " + args[j] + "th power of ") .
            so in our expected output the grammar suffix to the numbers like 2nd and 3rd and 4th are expected,
            but in this case we are appending the 'th' to all the calculated exponents which is a failure case.


 Equivalence Classes are :
            PositiveBaseToPositivePower():
            @Test
                @DisplayName("Positive base raised to Positive Exponent")
                void PositiveBaseToPositivePower() {
                    int[] exponents = {3, 4, 5};
                    int base = 2;
                    int[] result = new int[exponents.length];
                    for (int i = 0; i < exponents.length; i++) {
                        result[i] = power.toPower(base, exponents[i]);

                    }
                    int[] expected = {8, 16, 32};
                    assertArrayEquals(expected, result);
                }

                Any positive base raised to a positive integer exponent should return the correct result.
                so positive any base(2) raised to exponents 3 4 5 should return  8,16,32



            NegativeBaseWithOddExponentIsnegative()

            @Test
                @DisplayName("Negative base with odd exponent should return Negative result")
                void NegativeBaseWithOddExponentIsnegative() {
                    int[] exponents = {1, 3, 5};
                    int base = -2;
                    int[] result = new int[exponents.length];
                    for (int i = 0; i < exponents.length; i++) {
                        result[i] = power.toPower(base, exponents[i]);
                    }
                    int[] expected = {-2,-8,-32};
                    assertArrayEquals(expected, result);
                }
                Any negative base rasied to an odd number should return negative result .
                so negative any base (-2) raised to 3 5 7 should return -8,-32 ,-128.



            NegativeBaseWithEvenExponentShouldReturnPositiveValue()

            @Test

                @DisplayName("Negative base with even Exponent shoudl return Positive value")
                void NegativeBaseWithEvenExponentShouldReturnPositiveValue() {
                    int[] exponents = {2, 4, 6};
                    int base = -2;
                    int[] result = new int[exponents.length];
                    for (int i = 0; i < exponents.length; i++) {
                        result[i] = power.toPower(base, exponents[i]);
                    }
                    int[] expected = {4,16,64};
                    assertArrayEquals(expected, result);

                }

                Any negative base raised to an even number should return positive result .
                so any negative base (-2) raised to 2, 4, 6 should return 4,16,64.


For the commits by dsalda11,

The Boundary cases are : 

    @Test
    @DisplayName("Raising Zero to a positive")
    public void BaseZeroPositiveExponent(){

        int[] exponents = {2,3,4};
        int[] expectedVal = {0,0,0};
        int[] result = new int[expectedVal.length];
        int base = 0;

        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }
This is a boundary test case as the base is zero which is a special case as zero raised to any positive number
returns 0. This test case passes successfully.

    @Test
    @DisplayName("Raising Zero to Zero")
    public void zeroRaisedToZero(){
        int[] exponentsList = {0,0,0,0};
        int expected = (int)Math.pow(0,0);
        int[] expectedVal = {expected,expected,expected,expected};
        int[] result = new int[expectedVal.length];
        int base = 0;
        for(int i =0;i<expectedVal.length;i++){
            result[i] = power.toPower(base, exponentsList[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

This is a boundary test case as the base is zero which is a special case as zero raised to zero should return 
zero. This test checks if a zero raised to zero always returns 1.

    @Test
    @DisplayName("Raising One to a Positive Number")
    public void baseOnePositivePower(){

        int[] exponents = {3,4,5};
        int[] expectedVal = {1,1,1};
        int[] result = new int[expectedVal.length];
        int base = 1;

        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }
This test case checks if a 1 raised to a positive number returns 1 or not. This test case passes as the function
returns 1.


    @Test
    @DisplayName("Raising one to a negative power")
    public void baseOneNegativeExponent(){
        int[] exponents = {-2,-3,-4};
        int[] expectedVal = {1,1,1};
        int[] result = new int[expectedVal.length];
        int base = 0;
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

This test case is a special boundary case that tests 1 raised to a negative number returns 1 or not. This test case
passes as the function returns 1.

Negative Cases :

    @Test
    @DisplayName("Raising Zero to a negative number")
    public void baseZeroNegativeExponent(){
        int expected = (int)Math.pow(0,-1);
        int base = 0;
        int[] exponents = {2,3,4};

        int[] expectedVal = {expected,expected,expected};
        int[] result = new int[expectedVal.length];
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }
This test case checks for 0 raised to a negative number as it is a special case that should be undefined and
returns infinity in java. The toPower fails to handle this special case and the test fails.

    @Test
    public void stringsAsInput(){
        String[] str = {"one", "two", "three"}; 
        Exception exception = assertThrows(NumberFormatException.class,() -> Smell1AlmostBest.main(str));
        assertEquals(NumberFormatException.class, exception.getClass());
    }

This is a negative case as we are passing an invalid input in the form of a string to the main function. The logic of
the code expects integer inputs. The main function throws an exception due to this. This test case is designed to 
check if the main function throws a NumberFormatException or not.


Equivalence class based tests : 
    @Test
    @DisplayName("Positive Number raised to a negative exponent")
    public void positiveBaseNegativeExponent(){
        int[] exponents = {-2,-3,-4};
        int[] expectedVal = {(int) 0.25,(int) 0.125,(int) 0.0625};
        int[] result = new int[expectedVal.length];
        int base = 2;
        for(int i =0;i<expectedVal.length;i++)
        {
            result[i] = power.toPower(base, exponents[i]);
        }
        assertArrayEquals(expectedVal,result);
    }

This is a special case that checks the output when a positive number is raised to a negative number.
This is a valid scenario that returns decimals. The function does not take this scenario into consideration 
and hence this test case fails.

