/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.engine.descriptor;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.UniqueId;

/**
 * {@link TestDescriptor} for a {@link DynamicContainer}.
 *
 * @since 5.0
 */
class DynamicContainerTestDescriptor extends JupiterTestDescriptor {

	DynamicContainerTestDescriptor(UniqueId uniqueId, DynamicContainer dynamicTest, TestSource source) {
		super(uniqueId, dynamicTest.getDisplayName());
		setSource(source);
	}

	@Override
	public Type getType() {
		return Type.CONTAINER;
	}

}
