/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.config.xml.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jboss.seam.config.xml.util.TypeOccuranceInformation;

public class AnnotationXmlItem extends AbstractXmlItem
{
   private final HashSet<TypeOccuranceInformation> allowed = new HashSet<TypeOccuranceInformation>();

   public AnnotationXmlItem(XmlItem parent, Class<?> c, String innerText, Map<String, String> attributes, String document, int lineno)
   {
      super(XmlItemType.ANNOTATION, parent, c, innerText, attributes, document, lineno);
      if (innerText != null)
      {
         if (!innerText.trim().equals(""))
         {
            this.attributes.put("value", innerText);
         }
      }
      allowed.add(TypeOccuranceInformation.of(XmlItemType.ANNOTATION, null, null));
   }

   public Set<TypeOccuranceInformation> getAllowedItem()
   {
      return allowed;
   }

}
