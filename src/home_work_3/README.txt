========================================================================================================================
                                                      home_work_3
                  25 classes (21 according to terms of reference, 4 bonus with BigDecimal), 1 interface
========================================================================================================================

========================================================================================================================
TASK 1
========================================================================================================================

class WithoutCalculatorMain (pkg runners) - uses only basic operators of Java language to calculate the expression
                                4.1 + 15 * 7 + (28 / 5) ^ 2.

========================================================================================================================
TASK 2
========================================================================================================================

class CalculatorWithOperator (pkg calcs.simple) - simple calculator with operations addition, subtraction,
                                multiplication, division, getting absolut value, rising to a power, taking the square
                                root.
class CalculatorWithOperatorMain (pkg runners) - runner for simple calculator CalculatorWithOperator to calculate the
                                expression 4.1 + 15 * 7 + (28 / 5) ^ 2.

========================================================================================================================
TASK 3
========================================================================================================================

class CalculatorWithMathCopy (pkg calcs.simple) - same as CalculatorWithOperator, only 3 methods are replaced by Math
                                library: getting absolut value (Math.abs), rising to a power (Math.pow), taking the
                                square root (Math.sqrt).
class CalculatorWithMathCopyMain (pkg runners) - runner for simple calculator CalculatorWithMathCopy to calculate the
                                expression 4.1 + 15 * 7 + (28 / 5) ^ 2.

========================================================================================================================
TASK 4
========================================================================================================================

class CalculatorWithMathExtends (pkg calcs.simple) - extends CalculatorWithOperator, only 3 methods are overrided by
                                Math library: getting absolut value (Math.abs), rising to a power (Math.pow), taking the
                                square root (Math.sqrt).
class CalculatorWithMathExtendsMain (pkg runners) - runner for simple calculator CalculatorWithMathExtends to calculate
                                the expression 4.1 + 15 * 7 + (28 / 5) ^ 2.

BONUS:

class CalculatorWithBigDecimal (pkg calcs.simple) - same as CalculatorWithMathCopy, but uses BigDecimal to increase the
                                calculation accuracy.
class CalculatorWithMathBigDecimalMain (pkg runners) - runner for simple calculator CalculatorWithBigDecimal to
                                calculate the expression 4.1 + 15 * 7 + (28 / 5) ^ 2.

========================================================================================================================
TASK 5
========================================================================================================================

class CalculatorWithCounterClassic (pkg calcs.additional) - extends CalculatorWithMathExtends, added new field count and
                                two methods incrementCountOperation() (increments field count) and getCountOperation()
                                (returns current value of field count).
class CalculatorWithCounterClassicMain (pkg runners) - runner for simple calculator CalculatorWithCounterClassic to
                                calculate the expression 4.1 + 15 * 7 + (28 / 5) ^ 2 and count the number of uses of
                                methods.

========================================================================================================================
TASK 6
========================================================================================================================

class CalculatorWithCounterAutoSuper (pkg calcs.additional) - extends CalculatorWithMathExtends, added new field count,
                                getter getCountOperation() for this field, overrided all math methods with the addition
                                of a method incrementCountOperation() (increments field count) call for automatic
                                counting.
class CalculatorWithCounterAutoSuperMain (pkg runners) - runner for simple calculator CalculatorWithCounterAutoSuper to
                                calculate the expression 4.1 + 15 * 7 + (28 / 5) ^ 2 and count the number of uses of
                                methods.

========================================================================================================================
TASK 7
========================================================================================================================

class CalculatorWithCounterAutoComposite (pkg calcs.additional) - create calculator CalculatorWithMathExtends and uses
                                it to realize his own math methods and to count the number of uses of methods.
class CalculatorWithCounterAutoAgregation (pkg calcs.additional) - takes one of simple calculators (3 different
                                constructors) and uses it to realize his own math methods and to count the number of
                                uses of methods.
class CalculatorWithCounterDelegateMain (pkg runners) - runner for CalculatorWithCounterAutoComposite and
                                CalculatorWithCounterAutoAgregation to calculate the expression
                                4.1 + 15 * 7 + (28 / 5) ^ 2 and count the number of uses of methods.

BONUS:

class CalculatorWithCounterAutoAgregationBigDecimal (pkg calcs.additional) - same as CalculatorWithCounterAutoAgregation
                                but added 4th constructor for taking CalculatorWithBigDecimal.
class CalculatorWithCounterDelegateBigDecimalMain (pkg runners) - same as CalculatorWithCounterDelegateMain, but added
                                using CalculatorWithBigDecimal.

========================================================================================================================
TASK 8
========================================================================================================================

interface ICalculator (pkg calcs.api) - declares the methods of math operations: addition, subtraction, multiplication,
                                division, getting absolut value, rising to a power, taking the square root. All the
                                simple calculators implements this interface.

========================================================================================================================
TASK 9
========================================================================================================================

class CalculatorWithCounterAutoAgregationInterface (pkg calcs.additional) - uses the passed object of type ICalculator
                                to realize his own math methods and to count the number of uses of methods.
class CalculatorWithCounterAutoCompositeInterfaceMain (pkg runners) - transfers 4 different simple calculators to
                                CalculatorWithCounterAutoAgregationInterface and creates 4 advanced calculators. Uses
                                them to calculate the expression 4.1 + 15 * 7 + (28 / 5) ^ 2 and count the number of
                                uses of methods.

========================================================================================================================
TASK 10*
========================================================================================================================

class CalculatorWithMemory (pkg calcs.additional) - uses the passed object of type ICalculator to realize his own math
                                methods. Has special methods memorize() to memorize the result of the last operation
                                and getMemory() to return the result of the last operation (initializes result as 0
                                after return).
class CalculatorWithMemoryMain (pkg runners) - uses CalculatorWithBigDecimal and CalculatorWithMemory to calculate the
                                expression 4.1 + 15 * 7 + (28 / 5) ^ 2 without variables (uses only the methods of
                                CalculatorWithMemory).

========================================================================================================================
TASK 11*
========================================================================================================================

class CalculatorWithCounterAutoDecorator (pkg calcs.additional) - implements interface ICalculator, overrides his
                                methods, adds the counter features sa same as it does CalculatorWithCounterAutoSuper.
class CalculatorWithMemoryDecorator (pkg calcs.additional) - implements interface ICalculator, overrides his
                                methods, adds the memory features as same as it does CalculatorWithMemory.
class CalculatorDecoratorMain (pkg runners) - uses pattern decorator to add new features to calculator to calculate the
                                expression 4.1 + 15 * 7 + (28 / 5) ^ 2, memorize results of the operations and count of
                                the methods uses.

========================================================================================================================
TASK 12**
========================================================================================================================

class LexemeAnalyzer (pkg calcs.additional) - special class for lexical analyze of math expression (String).
class CalculatorStringExpression (pkg calcs.additional) - new calculator, that uses class LexemeAnalyzer for dividing
                                input string on a particular lexemes. After that it converts list of lexemes to reverse
                                polish notation (RPN) and calculates it using CalculatorWithBigDecimal.
class CalculatorStringExpressionMain (pkg calcs.runners) - runner for CalculatorStringExpression. Calculates an
                                expression (4.1 + 15 * 7) ^ 2 + (28 / 5) ^ 2 * PI - E.

            Don't kill me, please. Code isn't optimal. It's a Frankenstein! But I'm trying to do my best!

========================================================================================================================