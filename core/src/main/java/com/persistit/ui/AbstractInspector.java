/**
 * Copyright © 2005-2012 Akiban Technologies, Inc.  All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, version 3 (only) of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * This program may also be available under different license terms. For more
 * information, see www.akiban.com or contact licensing@akiban.com.
 */

package com.persistit.ui;

import javax.swing.JPanel;

/**
 * A JPanel that drops into the UI to allow inspection of Key and Value values.
 * Inspectors offer multiple views, e.g., as a displayable string, a hex dump,
 * the toString() method of a reconstituted object, and via the structure of an
 * object discovered through reflection.
 * 
 * @author Peter Beaman
 * @version 1.0
 */
abstract class AbstractInspector extends JPanel {
    protected AdminUI _adminUI;
    protected InspectorPanel _host;

    protected void setup(AdminUI ui, InspectorPanel host) {
        _adminUI = ui;
        _host = host;
    }

    protected void waiting() {
    }

    protected void refreshed() {
    }

    protected void nullData() {
    }
}
