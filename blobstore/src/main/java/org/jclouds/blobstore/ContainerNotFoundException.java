/**
 *
 * Copyright (C) 2009 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.blobstore;

import org.jclouds.rest.ResourceNotFoundException;

/**
 * Thrown when a container cannot be located.
 * 
 * @author Adrian Cole
 */
public class ContainerNotFoundException extends ResourceNotFoundException {

   private String container;

   public ContainerNotFoundException() {
      super();
   }

   public ContainerNotFoundException(String container, String message) {
      super(String.format("%s not found: %s", container, message));
      this.container = container;
   }

   public ContainerNotFoundException(Exception from) {
      super(from);
   }

   public String getContainer() {
      return container;
   }

   /** The serialVersionUID */
   private static final long serialVersionUID = -2272965726680821281L;

}
