/*
 * Copyright (c) 2012-2017
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.che.sample.projecttype;

import static org.eclipse.che.sample.shared.Constants.COMPILER_VERSION_ATRIBUTE;
import static org.eclipse.che.sample.shared.Constants.C_LANG;
import static org.eclipse.che.sample.shared.Constants.LANGUAGE;
import static org.eclipse.che.sample.shared.Constants.X_PROJECT_TYPE_ID;

import com.google.inject.Inject;
import org.eclipse.che.api.project.server.type.ProjectTypeDef;

/**
 * C wizard type
 *
 * @author Vitalii Parfonov
 */
public class SampleProjectType extends ProjectTypeDef {
  @Inject
  public SampleProjectType() {
    super(X_PROJECT_TYPE_ID, "Sample Project Type", true, false, true);
    addConstantDefinition(LANGUAGE, "language", C_LANG);
    addVariableDefinition(COMPILER_VERSION_ATRIBUTE, "GCC compiler version", false);
  }
}
