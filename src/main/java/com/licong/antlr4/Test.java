package com.licong.antlr4;

/**
 * Created by lctm2005 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {
        String[] set = {
//                "$filter={user_question}",        // section only
//                "$filter={user_question} and {question.type eq 1} and {question.type eq 2}  and {question.type eq 3} or ({question.type eq 10} or {question.type eq 11})&$result=list",       // and
//                "$filter={user_question} and {question.type eq 2}",       // and
//                "$filter={user_question} or {question.type eq 2}",       // or
//                "$filter={user_question} minus {question.type eq 2}",    // minus
//                "$filter=not {user_question}",    // not
//                "$filter={question.chapter eq '642ed4e1-893b-452e-833a-8a1beb9c1290'} and ({user_question} or {question.type eq 2})",       // bracket
//                "$filter={question.knowledge in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')} and {question.type eq 2} or {question.bank in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')}&$limit=10",  //获取某用户的学习目标下某种题型未做过的题目(结果A)
//                "$filter={question.instructional_objective eq '642ed4e1-893b-452e-833a-8a1beb9c1290'} and {user_question} minus {user_question.user_mastered eq true}&$limit=2", //获取某用户的学习目标下某种题型做过且做对的题目(结果B)
//                "$filter={question.chapter eq '642ed4e1-893b-452e-833a-8a1beb9c1290'} and {user_question} and {question_type in (10,20)}&$limit=20"  //获取某用户的章节下某几种题型的20道未做过的题目
        };
        for (String qql : set) {
            StrategyInterpreter.interpret(qql);
        }
    }

}
