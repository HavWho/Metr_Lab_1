package sample;

public class RegsVocabulary {
    final String regPlus = "\\+[^=]";
    final String regMultiply = "\\*[^=*]";
    final String regMinus = "\\-[^=]";
    final String regDiv = "\\%[^=]";
    final String regMod = "\\/[^=]";
    final String regExp = "\\(\\*\\*\\)";
    final String regIsEqual = "\\[^=]\\(==\\)[^=]";
    final String regIsNotEqual = "\\(!=\\)";
    final String regIsMore = "\\[^=?]>[^=>]";
    final String regIsLess = "\\[^=<]>[^=<]";
    final String regIsMoreOrEqual = "\\(>=\\)";
    final String regIsLessOrEqual = "\\(<=\\)";
    final String regIsCombinedEqual = "\\(<=>\\)";
    final String regIsEqualWhenCase = "\\(===\\)";
    final String regIsEql = "\\(.eql?\\)";
    final String regIsOneObject = "\\(equal?\\)";

    final String regAssigment = "\\[^=]=[^=]";
    final String regAddAnd = "\\(+=\\)";
    final String regSubAnd = "\\(-=\\)";
    final String regMulAnd = "\\(*=\\)";
    final String regDivAnd = "\\(/=\\)";
    final String regModAnd = "\\(%=\\)";
    final String regExpAnd = "\\(\\*\\*=\\)";

    final String regAnd = "\\[^&]&[&]";
    final String regOr = "[^|](\\|)[^|]";
    final String regXor = "\\^";
    final String regBO = "\\~";
    final String reg2TurnLeft = "\\(>>\\)";
    final String reg2TurnRight = "\\(<<\\)";

    final String regLogAnd = "\\b(and)\\b";
    final String regLogOR = "\\b(or)\\b";
    final String regLogAndAnd = "\\(&&\\)";
    final String regLogOr = "\\|\\|";
    final String regLogNot = "\\(!\\)[^=]";
    final String regLogNotNot = "\\b(not)";

    final String regDiap2 = "[^.]\\\\.\\\\.[^.]";
    final String regDiap3 = "\\.\\.\\.";

    final String regDefined = "\\b(defined>)\\b";
    final String regDot = "\\[^\\.]\\.[^\\.]";
    final String regDoubleColon = "\\S\\(::\\)";

    final String regLeftBracket = "\\)";
    final String regLRightBracket = "\\(";

    final String regWhile = "\\b(while)";
    final String regFor = "\\b(for)";
    final String regUntil = "\\b(until)";

    final String regBreak = "\\b(break)";
    final String regNext = "\\b(next)";
    final String regRedo = "\\b(redo)";
    final String regRetry = "\\b(retry)";

    final String regCase = "\\b(case)";

    final String regPuts = "\\b(puts)";

    final String regEach = "\\b(each)";

    final String regIf = "\\b(if)";
    final String regDef = "\\b(def)";

    final String regQuotes = "\"";

    String[] arrRegex = {regDef, regIf, regEach,
            regPuts, regCase, regRetry, regRedo, regNext, regBreak,
            regUntil, regFor, regWhile, regLRightBracket, regLeftBracket,
            regDoubleColon, regDot, regDefined, regDiap3, regDiap2,
            regLogNotNot, regLogNot, regLogOr, regLogAndAnd, regLogOR,
            regLogAnd, reg2TurnRight, reg2TurnLeft, regBO, regXor, regOr,
            regAnd, regExpAnd, regModAnd, regDivAnd, regMulAnd, regSubAnd,
            regAddAnd, regAssigment, regIsOneObject, regIsEql, regIsEqualWhenCase,
            regIsCombinedEqual, regIsLessOrEqual, regIsMoreOrEqual, regIsLess,
            regIsMore, regIsNotEqual, regIsEqual, regExp, regMod, regDiv,
            regMinus, regMultiply, regPlus};

    String[] arrNames = {"try..catch", "if..else", "do..while", "puts",
            "switch..case..default", "", "", "", "", "", "", "",
            "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
            "", "", "", "", "", "", "", "", "", "", "", "", };
}
