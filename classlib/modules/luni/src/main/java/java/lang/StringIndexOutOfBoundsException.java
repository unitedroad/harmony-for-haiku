/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package java.lang;


import org.apache.harmony.luni.internal.nls.Messages;

/**
 * Thrown when the a string is indexed with a value less than zero, or greater
 * than or equal to the size of the array.
 */
public class StringIndexOutOfBoundsException extends IndexOutOfBoundsException {

    private static final long serialVersionUID = -6762910422159637258L;

    /**
     * Constructs a new {@code StringIndexOutOfBoundsException} that includes
     * the current stack trace.
     */
    public StringIndexOutOfBoundsException() {
        super();
    }

    /**
     * Constructs a new {@code StringIndexOutOfBoundsException} with the current
     * stack trace and a detail message that is based on the specified invalid
     * {@code index}.
     * 
     * @param index
     *            the index which is out of bounds.
     */    
    public StringIndexOutOfBoundsException(int index) {
        super(Messages.getString("luni.55", index)); //$NON-NLS-1$
    }

    /**
     * Constructs a new {@code StringIndexOutOfBoundsException} with the current
     * stack trace and the specified detail message.
     * 
     * @param detailMessage
     *            the detail message for this exception.
     */
    public StringIndexOutOfBoundsException(String detailMessage) {
        super(detailMessage);
    }
}
