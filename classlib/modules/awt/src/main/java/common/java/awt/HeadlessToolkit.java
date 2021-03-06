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

package java.awt;

import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import java.util.Map;
import java.util.Properties;

import org.apache.harmony.awt.ComponentInternals;
import org.apache.harmony.awt.datatransfer.DTK;
import org.apache.harmony.awt.wtk.GraphicsFactory;
import org.apache.harmony.awt.wtk.NativeEventQueue;
import org.apache.harmony.awt.wtk.WindowFactory;

final class HeadlessToolkit extends ToolkitImpl {

    private class EventMonitor {}
    private final Object eventMonitor = new EventMonitor();
    
    @Override
    protected ButtonPeer createButton(Button a0) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    protected CheckboxPeer createCheckbox(Checkbox a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected CheckboxMenuItemPeer createCheckboxMenuItem(CheckboxMenuItem a0) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    protected ChoicePeer createChoice(Choice a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public Cursor createCustomCursor(Image img, Point hotSpot, String name)
    throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected DialogPeer createDialog(Dialog a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public <T extends DragGestureRecognizer> T createDragGestureRecognizer(
            Class<T> recognizerAbstractClass, DragSource ds, Component c, int srcActions,
            DragGestureListener dgl) {
        return null;
    }

    @Override
    public DragSourceContextPeer createDragSourceContextPeer(DragGestureEvent dge)
    throws InvalidDnDOperationException {
        throw new InvalidDnDOperationException();
    }

    @Override
    protected FileDialogPeer createFileDialog(FileDialog a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected FramePeer createFrame(Frame a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected LabelPeer createLabel(Label a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected ListPeer createList(List a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected MenuPeer createMenu(Menu a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected MenuBarPeer createMenuBar(MenuBar a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected MenuItemPeer createMenuItem(MenuItem a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected PopupMenuPeer createPopupMenu(PopupMenu a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected ScrollbarPeer createScrollbar(Scrollbar a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected ScrollPanePeer createScrollPane(ScrollPane a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected TextAreaPeer createTextArea(TextArea a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected TextFieldPeer createTextField(TextField a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    protected WindowPeer createWindow(Window a0) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public Dimension getBestCursorSize(int prefWidth, int prefHeight) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public ColorModel getColorModel() throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public final Object getEventMonitor() {
        return eventMonitor;
    }

    @Override
    GraphicsFactory getGraphicsFactory() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public boolean getLockingKeyState(int keyCode) throws UnsupportedOperationException {
        throw new HeadlessException();
    }
    
    @Override
    public int getMaximumCursorColors() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public int getMenuShortcutKeyMask() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    NativeEventQueue getNativeEventQueue() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public PrintJob getPrintJob(Frame frame, String jobtitle, JobAttributes jobAttributes, 
            PageAttributes pageAttributes) throws IllegalArgumentException {
        throw new IllegalArgumentException();        
    }
    
    @Override
    public PrintJob getPrintJob(Frame frame, String jobtitle, Properties props) throws NullPointerException  {
        throw new NullPointerException();
    }
    
    @Override
    public Insets getScreenInsets(GraphicsConfiguration gc) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public int getScreenResolution() throws HeadlessException {
        throw new HeadlessException();
    }    
    
    @Override
    public Dimension getScreenSize() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public Clipboard getSystemClipboard() throws HeadlessException {
        throw new HeadlessException();
    }    
    
    @Override
    public Clipboard getSystemSelection() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    WindowFactory getWindowFactory() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    void init() {
        lockAWT();
        try {
            ComponentInternals.setComponentInternals(new ComponentInternalsImpl());
            new EventQueue(this); // create the system EventQueue
            dispatcher = new Dispatcher(this);
            awtEventsManager = new AWTEventsManager();
            dispatchThread = new HeadlessEventDispatchThread(this, dispatcher);            
            dtk = DTK.getDTK();
            dispatchThread.start();            
        } finally {
            unlockAWT();
        }
    }
    
    @Override
    public boolean isDynamicLayoutActive() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    protected boolean isDynamicLayoutSet() throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public boolean isFrameStateSupported(int state) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    protected void loadSystemColors(int[] systemColors) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public Map<java.awt.font.TextAttribute, ?> mapInputMethodHighlight(
            InputMethodHighlight highlight) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    Map<java.awt.font.TextAttribute, ?> mapInputMethodHighlightImpl(
            InputMethodHighlight highlight) throws HeadlessException {
        throw new HeadlessException();
    }

    @Override
    public void setDynamicLayout(boolean dynamic) throws HeadlessException {
        throw new HeadlessException();
    }
    
    @Override
    public void setLockingKeyState(int keyCode, boolean on) throws UnsupportedOperationException {
        throw new HeadlessException();
    }
}
