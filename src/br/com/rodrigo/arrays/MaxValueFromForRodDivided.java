package br.com.rodrigo.arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxValueFromForRodDivided {

    public static void main(String[] args) {
//        int[] values = new int[]{3, 7, 1, 3, 9};
//        int rodLength = values.length;
//
//        System.out.println("Max rod value: " + getValue(values, rodLength));

        var pilha = new Stack<String>();
        pilha.push("Teste1");
        pilha.push("Teste2");
        pilha.push("Teste3");
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);

        Queue<String> queue = new LinkedList<>();
        queue.add("Teste1");
        queue.add("Teste2");
        queue.add("Teste3");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }

    static int getValue(int[] values, int rodLength) {
        int[] subSolutions = new int[rodLength + 1];

        for (int i = 1; i <= rodLength; i++) {
            int tmpMax = -1;
            for (int j = 0; j < i; j++) {
                tmpMax = Math.max(tmpMax, values[j] + subSolutions[i - j - 1]);
                System.out.println(tmpMax);

            }
            subSolutions[i] = tmpMax;
        }
        return subSolutions[rodLength];
    }
}
