/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.topic;

import java.util.List;

/**
 * @author damonkohler@google.com (Damon Kohler)
 */
public class Topic {

  protected final TopicDescription description;

  public Topic(TopicDescription description) {
    this.description = description;
  }
 
  public List<String> getTopicDescriptionAsList() {
    return description.toList();
  }
  
  public String getTopicName() {
    return description.getName();
  }
  
  public String getTopicMessageType() {
    return description.getMessageType();
  }
  
}