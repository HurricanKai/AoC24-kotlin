class Day3 {

    enum class State {
        None,
        M,
        Mu,
        Mul,
        MulP,
        Num1,
        Whitespace,
        Num2,
        D,
        Do,
        DoP,
        Don,
        DonS,
        DonSt,
        DonStP,
        Paused
    }
    fun part1(input: String): Int = input
        .asSequence()
        .constrainOnce()
        .fold(Pair(State.None, Pair(0, Pair(0, 0)))) {
                acc, c -> when (acc.first) {
            State.None if (c == 'm') -> Pair(State.M, acc.second)
            State.M if (c == 'u') -> Pair(State.Mu, acc.second)
            State.Mu if (c == 'l') -> Pair(State.Mul, acc.second)
            State.Mul if (c == '(') -> Pair(State.MulP, acc.second)
            State.MulP if (c.isDigit()) -> Pair(State.Num1, Pair(acc.second.first, Pair(c.digitToInt(), 0)))
            State.Num1 if (c.isDigit()) -> Pair(State.Num1, Pair(acc.second.first, Pair(acc.second.second.first * 10 + c.digitToInt(), 0)))
            State.Num1 if (c == ',') -> Pair(State.Whitespace, acc.second)
            State.Whitespace if (c.isWhitespace()) -> Pair(State.Whitespace, acc.second)
            State.Whitespace if (c.isDigit()) -> Pair(State.Num2, Pair(acc.second.first, Pair(acc.second.second.first, c.digitToInt())))
            State.Num2 if (c.isDigit()) -> Pair(State.Num2, Pair(acc.second.first, Pair(acc.second.second.first, acc.second.second.second * 10 + c.digitToInt())))
            State.Num2 if (c == ')') -> Pair(State.None, Pair(acc.second.first + acc.second.second.first * acc.second.second.second, Pair(0, 0)))
            else -> Pair(State.None, acc.second)
        }
        }.second.first


    fun part2(input: String): Int = input
        .asSequence()
        .constrainOnce()
        .fold(Pair(State.None, Pair(0, Pair(0, 0)))) {
            acc, c -> when (acc.first) {
                State.None if (c == 'm') -> Pair(State.M, acc.second)
                State.None if (c == 'd') -> Pair(State.D, acc.second)
                State.Paused if (c == 'd') -> Pair(State.D, acc.second)
                State.Paused -> Pair(State.Paused, acc.second)
                State.D if (c == 'o') -> Pair(State.Do, acc.second)
                State.Do if (c == '(') -> Pair(State.DoP, acc.second)
                State.Do if (c == 'n') -> Pair(State.Don, acc.second)
                State.Don if (c == '\'') -> Pair(State.DonS, acc.second)
                State.DonS if (c == 't') -> Pair(State.DonSt, acc.second)
                State.DonSt if (c == '(') -> Pair(State.DonStP, acc.second)
                State.DoP if (c == ')') -> Pair(State.None, acc.second)
                State.DonStP if (c == ')') -> Pair(State.Paused, acc.second)
                State.M if (c == 'u') -> Pair(State.Mu, acc.second)
                State.Mu if (c == 'l') -> Pair(State.Mul, acc.second)
                State.Mul if (c == '(') -> Pair(State.MulP, acc.second)
                State.MulP if (c.isDigit()) -> Pair(State.Num1, Pair(acc.second.first, Pair(c.digitToInt(), 0)))
                State.Num1 if (c.isDigit()) -> Pair(State.Num1, Pair(acc.second.first, Pair(acc.second.second.first * 10 + c.digitToInt(), 0)))
                State.Num1 if (c == ',') -> Pair(State.Whitespace, acc.second)
                State.Whitespace if (c.isWhitespace()) -> Pair(State.Whitespace, acc.second)
                State.Whitespace if (c.isDigit()) -> Pair(State.Num2, Pair(acc.second.first, Pair(acc.second.second.first, c.digitToInt())))
                State.Num2 if (c.isDigit()) -> Pair(State.Num2, Pair(acc.second.first, Pair(acc.second.second.first, acc.second.second.second * 10 + c.digitToInt())))
                State.Num2 if (c == ')') -> Pair(State.None, Pair(acc.second.first + acc.second.second.first * acc.second.second.second, Pair(0, 0)))
                else -> Pair(State.None, acc.second)
            }
        }.second.first
}
