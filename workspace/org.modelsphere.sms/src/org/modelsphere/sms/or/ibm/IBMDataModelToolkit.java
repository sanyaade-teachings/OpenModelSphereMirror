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
package org.modelsphere.sms.or.ibm;

import org.modelsphere.jack.baseDb.db.DbException;
import org.modelsphere.jack.baseDb.db.DbObject;
import org.modelsphere.jack.baseDb.meta.MetaClass;
import org.modelsphere.sms.or.db.DbORCheck;
import org.modelsphere.sms.or.db.DbORColumn;
import org.modelsphere.sms.or.db.DbORDataModel;
import org.modelsphere.sms.or.db.DbORIndex;
import org.modelsphere.sms.or.db.DbORPrimaryUnique;
import org.modelsphere.sms.or.db.DbORTable;
import org.modelsphere.sms.or.db.DbORTrigger;
import org.modelsphere.sms.or.db.DbORView;
import org.modelsphere.sms.or.generic.GEDataModelToolkit;
import org.modelsphere.sms.or.ibm.db.DbIBMCheck;
import org.modelsphere.sms.or.ibm.db.DbIBMColumn;
import org.modelsphere.sms.or.ibm.db.DbIBMDataModel;
import org.modelsphere.sms.or.ibm.db.DbIBMIndex;
import org.modelsphere.sms.or.ibm.db.DbIBMPrimaryUnique;
import org.modelsphere.sms.or.ibm.db.DbIBMTable;
import org.modelsphere.sms.or.ibm.db.DbIBMTrigger;
import org.modelsphere.sms.or.ibm.db.DbIBMView;
import org.modelsphere.sms.or.informix.db.DbINFDataModel;

public final class IBMDataModelToolkit extends GEDataModelToolkit {

    protected MetaClass[] getSupportedPackage() {
        return new MetaClass[] { DbIBMDataModel.metaClass };
    }

    public DbObject createDbObject(MetaClass abstractMetaClass, DbObject composite,
            Object[] parameters) throws DbException {
        if (composite != null) {
            if (abstractMetaClass.equals(DbORView.metaClass))
                return composite.createComponent(DbIBMView.metaClass);
            else if (abstractMetaClass.equals(DbORTable.metaClass)) {
                return composite.createComponent(DbIBMTable.metaClass);
            } else if (abstractMetaClass.equals(DbORTrigger.metaClass))
                return composite.createComponent(DbIBMTrigger.metaClass);
            else if (abstractMetaClass.equals(DbORColumn.metaClass))
                return composite.createComponent(DbIBMColumn.metaClass);
            else if (abstractMetaClass.equals(DbORCheck.metaClass))
                return composite.createComponent(DbIBMCheck.metaClass);
            else if (abstractMetaClass.equals(DbORPrimaryUnique.metaClass))
                return composite.createComponent(DbIBMPrimaryUnique.metaClass);
            else if (abstractMetaClass.equals(DbORIndex.metaClass))
                return composite.createComponent(DbIBMIndex.metaClass);
            else if (abstractMetaClass.equals(DbORDataModel.metaClass)) {
                DbORDataModel dataModel = (DbORDataModel) composite;
                return new DbIBMDataModel(composite, dataModel.getTargetSystem(), dataModel
                        .getOperationalMode());
            } else {
                DbObject dbObj = super.createDbObject(abstractMetaClass, composite, parameters);
                return dbObj;
            } // end if
        }
        return null;
    } // end createDbObject()

} // end IBMDataModelToolkit
