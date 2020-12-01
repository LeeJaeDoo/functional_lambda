package com.company;

import com.company.dp.RodCutterBasic;
import com.company.lazy.Holder;
import com.company.recursive.BigFactorial;
import com.company.recursive.Factorial;
import com.company.recursive.TailCall;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static com.company.AssetUtil.totalAssetValues;
import static com.company.recursive.BigFactorial.factorial;
import static com.company.recursive.TailCalls.call;
import static com.company.recursive.TailCalls.done;

public class Main {

    /*// 1.숫자 스트림 생성
    static IntStream numbers() {
        return IntStream.iterate(2, n -> n + 1);
    }

    // 2.머리 획득
    static int head(IntStream numbers) {
        return numbers.findFirst().getAsInt();
    }

    // 3.꼬리 필터링
    static IntStream tail(IntStream numbers) {
        return numbers.skip(1);
    }

    // 4.재귀적으로 소수 스트림 생성
    static IntStream primes(IntStream numbers) {
        int head = head(numbers);
        return IntStream.concat(
            IntStream.of(head),
            primes(tail(numbers).filter(n -> n % head != 0))
        );
    }*/

    public static void main(String[] args) throws IOException {
        System.out.println(Factorial.factorialTailRec(1, 20000).invoke());

        /*RodCutterBasic rodCutterBasic = new RodCutterBasic(priceValues);

        System.out.println(rodCutterBasic.maxProfit(5));*/
    }

    public static int factorialRec(final int number) {
        if (number == 1)
            return number;
        else
            return number * factorialRec(number - 1);   //  팩토리얼을 구하기 위한 숫자를 갖고 있는 상태에서 factorialRec()의 호출에 대한 결과를 계속 기다리게 된다.
    }
}
