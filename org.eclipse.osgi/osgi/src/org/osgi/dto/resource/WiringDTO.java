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

import java.util.List;
import org.osgi.dto.DTO;

/**
 * Data Transfer Object for a Wiring.
 * 
 * @author $Id$
 * @NotThreadSafe
 */
public class WiringDTO extends DTO {
    /**
     * The capabilities for the wiring.
     */
    public List<CapabilityDTO>  capabilities;

    /**
     * The requirements for the wiring.
     */
    public List<RequirementDTO> requirements;

    /**
     * The provided wires for the wiring.
     */
    public List<WireDTO>        providedWires;

    /**
     * The required wires for the wiring.
     */
    public List<WireDTO>        requiredWires;

    /**
     * Resource for the wiring.
     */
    public ResourceDTO          resource;
}
