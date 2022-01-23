/*
 *  File: Operation.java
 * 
 * The MIT License
 *
 * Copyright 2022 Yiannis Kyranis <yiannis.kiranis at gmail.com>.
 * https://apps4net.eu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 *  Date: Jan 23, 2022
 *  Time: 9:22:00 PM
 * 
 * Abstract class for different math operations
 *
 */
package calculator;

/**
 *
 * @author Yiannis Kyranis <yiannis.kiranis at gmail.com>
 */
public abstract class Operation {
    private double A, B;

    public Operation(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }
    
   
    public abstract double compute();
}
