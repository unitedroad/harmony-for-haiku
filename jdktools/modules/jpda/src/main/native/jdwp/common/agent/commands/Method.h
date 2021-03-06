/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * @file
 * Method.h
 *
 */

#ifndef _METHOD_H_
#define _METHOD_H_

#include "AgentException.h"
#include "CommandHandler.h"

namespace jdwp {

    /**
     * The namespace includes declaration of the classes implementing commands
     * from the <code>Method</code> command set.
     */
    namespace Method {

        /**
         * The class implements the <code>LineTable</code> command from the
         * <code>Method</code> command set.
         */
        class LineTableHandler : public SyncCommandHandler {
        protected:

            /**
             * Executes the <code>LineTable</code> JDWP command for the
             * <code>Method</code> command set.
             *
             * @param jni - the JNI interface pointer
             */
            virtual int Execute(JNIEnv *jni);

        };//LineTableHandler

        /**
         * The class implements the <code>VariableTable</code> command from the
         * <code>Method</code> command set.
         */
        class VariableTableHandler : public SyncCommandHandler {
        protected:

            /**
             * Executes the <code>VariableTable</code> JDWP command for the
             * <code>Method</code> command set.
             *
             * @param jni - the JNI interface pointer
             */
            virtual int Execute(JNIEnv *jni);

        };//VariableTableHandler

        /**
         * The class implements the <code>Bytecodes</code> command from the
         * <code>Method</code> command set.
         */
        class BytecodesHandler : public SyncCommandHandler {
        protected:

            /**
             * Executes the <code>Bytecodes</code> JDWP command for the
             * <code>Method</code> command set.
             *
             * @param jni - the JNI interface pointer
             */
            virtual int Execute(JNIEnv *jni);

        };//BytecodesHandler

        /**
         * The class implements the <code>LineTable</code> command from the
         * <code>Method</code> command set.
         */
        class IsObsoleteHandler : public SyncCommandHandler {
        protected:

            /**
             * Executes the <code>IsObsolete</code> JDWP command for the
             * <code>Method</code> command set.
             *
             * @param jni - the JNI interface pointer
             */
            virtual int Execute(JNIEnv *jni);

        };//IsObsoleteHandler

        /**
         * The class implements the <code>VariableTableWithGeneric</code> command from the
         * <code>Method</code> command set.
         */
        class VariableTableWithGenericHandler : public SyncCommandHandler {
        protected:

            /**
             * Executes the <code>VariableTableWithGeneric</code> JDWP command for the
             * <code>Method</code> command set.
             *
             * @param jni - the JNI interface pointer
             */
            virtual int Execute(JNIEnv *jni);

        };//VariableTableWithGenericHandler

    } // Method

} //jdwp

#endif //_METHOD_H_
