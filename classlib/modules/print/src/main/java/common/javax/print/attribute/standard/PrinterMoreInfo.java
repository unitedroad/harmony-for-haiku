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

package javax.print.attribute.standard;

import java.net.URI;
import javax.print.attribute.Attribute;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.URISyntax;

public final class PrinterMoreInfo extends URISyntax implements PrintServiceAttribute {
    private static final long serialVersionUID = 4555850007675338574L;

    public PrinterMoreInfo(URI uri) {
        super(uri);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrinterMoreInfo)) {
            return false;
        }
        return super.equals(object);
    }

    public final Class<? extends Attribute> getCategory() {
        return PrinterMoreInfo.class;
    }

    public final String getName() {
        return "printer-more-info";
    }
}
