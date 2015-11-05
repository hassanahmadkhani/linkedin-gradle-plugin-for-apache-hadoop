/*
 * Copyright 2015 LinkedIn Corp.
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
package com.linkedin.gradle.hadoopdsl;

/**
 * Helper class for testing the NamedScope class and the BaseNamedScopeContainer lookup method.
 */
class NamedScopeContainerWrapper extends BaseNamedScopeContainer {
  String name;

  public NamedScopeContainerWrapper(NamedScope parentScope, String name) {
    super(parentScope, name);
    this.name = name;
  }

  @Override
  public BaseNamedScopeContainer clone(NamedScope parentScope) {
    return new NamedScopeContainerWrapper(parentScope, name);
  }
}