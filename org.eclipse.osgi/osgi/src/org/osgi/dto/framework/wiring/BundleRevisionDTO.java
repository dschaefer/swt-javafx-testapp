/*
 * Copyright (c) OSGi Alliance (2012). All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.osgi.dto.framework.wiring;

import org.osgi.dto.framework.BundleDTO;
import org.osgi.dto.resource.ResourceDTO;

/**
 * Data Transfer Object for a BundleWiring.
 * 
 * <p>
 * An installed Bundle can be adapted to provide a {@code BundleRevisionDTO} for
 * the current revision of the Bundle. {@code BundleRevisionDTO} objects for all
 * in use revisions of the Bundle can be obtained from a
 * {@link BundleRevisionsDTO} of the Bundle.
 * 
 * @author $Id$
 * @NotThreadSafe
 */
public class BundleRevisionDTO extends ResourceDTO {
    /**
     * The symbolic name of the bundle revision.
     */
    public String             symbolicName;

    /**
     * The type of the bundle revision.
     */
    public int                type;

    /**
     * The version of the bundle revision.
     */
    public String             version;

    /**
     * The bundle associated with this bundle revision.
     */
    public BundleDTO          bundle;
}
