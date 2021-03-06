/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.primefaces.forge.data;

import org.jboss.forge.project.dependencies.Dependency;
import org.jboss.forge.project.dependencies.DependencyBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @author bleathem
 * @author rvkuijk
 * @author Rudy De Busscher - www.c4j.be
 */
public enum PrimefacesVersion {
    PRIMEFACES_2_2_1("Primefaces 2.2.1", Arrays.asList(DependencyBuilder.create("org.primefaces:primefaces:2.2.1")),
            2),
    PRIMEFACES_3("Primefaces 3.0",
            Arrays.asList(DependencyBuilder.create("org.primefaces:primefaces:3.0")), 3),
	PRIMEFACES_3_4_2("Primefaces 3.4.2",
         Arrays.asList(DependencyBuilder.create("org.primefaces:primefaces:3.4.2")), 4);

    private List<? extends Dependency> dependencies;

    private String name;

    private int version;

    private PrimefacesVersion(String name, List<? extends Dependency> deps, int someVersion) {
        this.name = name;
        this.dependencies = deps;
        version = someVersion;
    }

    public List<? extends Dependency> getDependencies() {
        return dependencies;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
