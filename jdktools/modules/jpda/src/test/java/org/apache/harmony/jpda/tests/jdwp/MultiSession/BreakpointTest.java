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
 * @author Aleksander V. Budniy
 */

/**
 * Created on 4.08.2005
 */
package org.apache.harmony.jpda.tests.jdwp.MultiSession;

import org.apache.harmony.jpda.tests.framework.TestOptions;
import org.apache.harmony.jpda.tests.framework.TestErrorException;
import org.apache.harmony.jpda.tests.framework.jdwp.CommandPacket;
import org.apache.harmony.jpda.tests.framework.jdwp.JDWPConstants;
import org.apache.harmony.jpda.tests.framework.jdwp.ParsedEvent;
import org.apache.harmony.jpda.tests.jdwp.share.JDWPSyncTestCase;
import org.apache.harmony.jpda.tests.jdwp.share.JDWPUnitDebuggeeWrapper;
import org.apache.harmony.jpda.tests.share.JPDADebuggeeSynchronizer;


/**
 * JDWP Unit test for verifying canceling of BREAKPOINT event after re-connection.
 */
public class BreakpointTest extends JDWPSyncTestCase {

    private String DEBUGGEE_SIGNATURE = "Lorg/apache/harmony/jpda/tests/jdwp/MultiSession/MultiSessionDebuggee;";

    private String METHOD_NAME = "printWord";

    protected String getDebuggeeClassName() {
        return "org.apache.harmony.jpda.tests.jdwp.MultiSession.MultiSessionDebuggee";
    }

    /**
     * This testcase verifies canceling of BREAKPOINT event after re-connection.
     * <BR>It runs MultiSessionDebuggee, sets request for BREAKPOINT event
     * and re-connects.
     * <BR>It is expected that no any events, including BREAKPOINT, occur after re-connection
     * and before MultiSessionDebuggee finish.
     */
    public void testClearBreakpoint001() {
        logWriter.println("==> testClearBreakpoint001 started..");
        synchronizer.receiveMessage(JPDADebuggeeSynchronizer.SGNL_READY);

        long classID = debuggeeWrapper.vmMirror.getClassID(DEBUGGEE_SIGNATURE);

        //long requestID =
            debuggeeWrapper.vmMirror.setBreakpointAtMethodBegin(
                classID, METHOD_NAME);

        logWriter.println("");
        logWriter.println("=> CLOSE CONNECTION");
        closeConnection();
        logWriter.println("=> CONNECTION CLOSED");

        logWriter.println("");
        logWriter.println("=> OPEN NEW CONNECTION");
        openConnection();
        logWriter.println("=> CONNECTION OPENED");

        //resuming debuggee
        synchronizer.sendMessage(JPDADebuggeeSynchronizer.SGNL_CONTINUE);
        synchronizer.receiveMessage(JPDADebuggeeSynchronizer.SGNL_READY);
        synchronizer.receiveMessage(JPDADebuggeeSynchronizer.SGNL_READY);

        //      receive event
        logWriter.println("=> Wait for event..");
        CommandPacket event = null;
        try {
            event = debuggeeWrapper.vmMirror.receiveEvent();
        } catch (TestErrorException thrown) {
            logWriter.println("=> Exception while receiving event:" + thrown);

        }
        if (event == null) {
            logWriter.println("=> It's expected result, nothing was caught");
            logWriter.println("=> Resuming debuggee");
            //resuming debuggee
            synchronizer.sendMessage(JPDADebuggeeSynchronizer.SGNL_CONTINUE);
            logWriter.println("==> testMethodEvent001 PASSED! ");
        } else {

            logWriter.println("##FAILURE: Event was received");

            try {
                ParsedEvent[] parsedEvents = ParsedEvent
                        .parseEventPacket(event);

                logWriter.println("=> Number of events = "
                        + parsedEvents.length);
                for (int i = 0; i < parsedEvents.length; i++) {
                    logWriter.println("=> EventKind() = "
                            + parsedEvents[0].getEventKind()
                            + " ("
                            + JDWPConstants.EventKind.getName(parsedEvents[0]
                                    .getEventKind()) + ")");
                    logWriter.println("=> EventRequestID() = "
                            + parsedEvents[0].getRequestID());

                }
            } catch (Throwable thrown) {
                logWriter
                        .println("##FAILURE: Exception while analyzing received event:"
                                + thrown);
                fail("Exception while analyzing received event: "+ thrown);
            }

            synchronizer.sendMessage(JPDADebuggeeSynchronizer.SGNL_CONTINUE);
            synchronizer.sendMessage(JPDADebuggeeSynchronizer.SGNL_CONTINUE);
            logWriter.println("==> testClearBreakpoint001 PASSED");
        }
    }

    protected void beforeDebuggeeStart(JDWPUnitDebuggeeWrapper debuggeeWrapper) {
        settings.setAttachConnectorKind();
        if (settings.getTransportAddress() == null) {
            settings.setTransportAddress(TestOptions.DEFAULT_ATTACHING_ADDRESS);
        }
        logWriter.println("ATTACH connector kind");
        super.beforeDebuggeeStart(debuggeeWrapper);
    }

    public static void main(String[] args) {

        junit.textui.TestRunner.run(BreakpointTest.class);

    }
}
