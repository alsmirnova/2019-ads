package ru.mail.polis.ads.part1.alsmirnova;

import java.io.*;
import java.util.StringTokenizer;

public final class SolveTask4 {

        private SolveTask4() {
            // Should not be instantiated
        }


        private static void solve(final FastScanner in, final PrintWriter out) {
            //sequences initialization
            int length1=in.nextInt();
            int[] sequence1= new int[length1];
            for (int i:sequence1) {
                sequence1[i]=in.nextInt();
            }
            int length2=in.nextInt();
            int[] sequence2= new int[length1];
            for (int i:sequence2) {
                sequence2[i]=in.nextInt();
            }
            //find max common subsequence
            int[] commonSequence;
            int k=0;
            if (length1>=length2) {
            commonSequence=new int[length1];
            }
            else commonSequence=new int[length2];
            int n;
            if (length1>=length2) {
                n=length1;
            }
            else n=length2;

            for (int i=0;i<length1;i++) {
                for (int j=0;j<length2;j++) {
                    if (sequence1[i]==sequence2[j]) {
                        commonSequence[k++]=sequence1[i];
                    }
                    else k=0;
                }
            }




            int lenght2=in.nextInt();

        }

        private static class FastScanner {
            private final BufferedReader reader;
            private StringTokenizer tokenizer;

            FastScanner(final InputStream in) {
                reader = new BufferedReader(new InputStreamReader(in));
            }

            String next() {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return tokenizer.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }
        }

        public static void main(final String[] arg) {
            final FastScanner in = new FastScanner(System.in);
            try (PrintWriter out = new PrintWriter(System.out)) {
                solve(in, out);
            }
        }


}