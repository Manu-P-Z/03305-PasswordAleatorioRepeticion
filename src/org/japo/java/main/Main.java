/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {
        final char MIN_CHAR = 'A';
        final char MAX_CHAR = 'Z';
        final int NUM_LETRAS = 32;
        
        System.out.print("Password ...: ");
        
        for (int i  = 0; i < NUM_LETRAS; i++) {
            char c = (char) (RND.nextInt( MAX_CHAR - MIN_CHAR + 1) + MIN_CHAR);
            System.out.print(c);
        }
            System.out.println("");
    }

}
