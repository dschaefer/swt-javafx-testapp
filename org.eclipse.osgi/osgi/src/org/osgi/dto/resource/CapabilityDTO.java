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

package org.osgi.dto.resource;

import java.util.Map;
import org.osgi.dto.DTO;

/**
 * Data Transfer Object for a Capability.
 * 
 * @author $Id$
 * @NotThreadSafe
 */
public class CapabilityDTO extends DTO {
    /**
     * The namespace for the capability.
     */
    public String              namespace;

    /**
     * The directives for the capability.
     */
    public Map<String, String> directives;

    /**
     * The attributes for the capability.
     * 
     * The value type must be a numerical type, Boolean, String, DTO or an array
     * of any of the former.
     */
    public Map<String, Object> attributes;

    /**
     * The resource declaring this capability.
     */
    public ResourceDTO         resource;
}
