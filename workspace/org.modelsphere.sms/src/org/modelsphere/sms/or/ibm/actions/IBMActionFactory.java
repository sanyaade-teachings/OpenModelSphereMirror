/*************************************************************************

Copyright (C) 2008 Grandite

This file is part of Open ModelSphere.

Open ModelSphere is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
or see http://www.gnu.org/licenses/.

You can reach Grandite at: 

20-1220 Lebourgneuf Blvd.
Quebec, QC
Canada  G2K 2G4

or

open-modelsphere@grandite.com

 **********************************************************************/

package org.modelsphere.sms.or.ibm.actions;

import org.modelsphere.jack.actions.AbstractActionsStore;
import org.modelsphere.sms.actions.ActionFactory;

public class IBMActionFactory implements ActionFactory, IBMActionConstants {
    private static IBMActionFactory singleton;

    static {
        singleton = new IBMActionFactory();
    }

    private IBMActionFactory() {
    }

    public static ActionFactory getSingleton() {
        return singleton;
    }

    public final void registerActions(AbstractActionsStore actionStore) {
        // template: actionStore.put(IBM_ADD_COLUMN_TYPE, new
        // AddColumnTypeAction());
    }

}
