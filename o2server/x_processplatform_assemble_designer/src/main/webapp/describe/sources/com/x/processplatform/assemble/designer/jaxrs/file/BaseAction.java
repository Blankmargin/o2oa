package com.x.processplatform.assemble.designer.jaxrs.file;

import java.util.Date;

import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.jaxrs.StandardJaxrsAction;
import com.x.processplatform.core.entity.element.File;

abstract class BaseAction extends StandardJaxrsAction {
	
	protected void updateCreator(File file,EffectivePerson effectivePerson){
		file.setLastUpdatePerson(effectivePerson.getDistinguishedName());
		file.setLastUpdateTime(new Date());
	}

}
