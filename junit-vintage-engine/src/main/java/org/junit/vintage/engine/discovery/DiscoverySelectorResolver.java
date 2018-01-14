/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.vintage.engine.discovery;

import java.util.function.Predicate;

import org.junit.platform.engine.EngineDiscoveryRequest;

/**
 * @since 4.12
 */
interface DiscoverySelectorResolver {

	void resolve(EngineDiscoveryRequest request, Predicate<Class<?>> classFilter, TestClassCollector collector);
}
